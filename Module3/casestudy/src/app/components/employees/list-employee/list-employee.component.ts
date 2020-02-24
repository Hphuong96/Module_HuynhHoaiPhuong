import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../../../services/employee.service'
import {MatDialog, MatDialogRef, MAT_DIALOG_DATA} from '@angular/material/dialog';
import { EmployeeDeleteDialogComponent } from '../employee-delete-dialog/employee-delete-dialog.component'


@Component({
  selector: 'list-employee',
  templateUrl: './list-employee.component.html',
  styleUrls: ['./list-employee.component.css']
})
export class ListEmployeeComponent implements OnInit {
  public employees;
  public term: string;
  public p:number;

  constructor( 
    public employeeService: EmployeeService,
    public dialog: MatDialog
    ) { }

  ngOnInit(): void {
    this.employeeService.getAllEmployee().subscribe(data=>{
      this.employees = data;
    })
  }

  openDialog(employeeId): void {
    this.employeeService.getEmployeeById(employeeId).subscribe(employeeData =>{
      console.log(employeeData);
      const dialogRef = this.dialog.open(EmployeeDeleteDialogComponent, {
        width: '500px',
        data: {data: employeeData},
        disableClose: true
      });
      dialogRef.afterClosed().subscribe(result => {
        console.log('The dialog was closed');
        this.ngOnInit();
      });
    })
  }

}
