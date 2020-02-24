import { Component, OnInit, Inject } from '@angular/core';
import {MatDialog, MatDialogRef, MAT_DIALOG_DATA} from '@angular/material/dialog';
import { EmployeeService } from '../../../services/employee.service'
import { from } from 'rxjs';

@Component({
  selector: 'app-employee-delete-dialog',
  templateUrl: './employee-delete-dialog.component.html',
  styleUrls: ['./employee-delete-dialog.component.css']
})
export class EmployeeDeleteDialogComponent implements OnInit {
  public employeeName ;
  public employeeId;
  constructor(
    public dialogRef: MatDialogRef<EmployeeDeleteDialogComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any ,
    public employeeService : EmployeeService) {}

  ngOnInit(): void {
    this.employeeName = this.data.data.name;
    this.employeeId = this.data.data.id;
    console.log(this.employeeName)
  }
   
  deleteEmployee(){
    this.employeeService.deleteEmployeeById(this.employeeId).subscribe(data=>{
      this.dialogRef.close()
    })
  }
}
