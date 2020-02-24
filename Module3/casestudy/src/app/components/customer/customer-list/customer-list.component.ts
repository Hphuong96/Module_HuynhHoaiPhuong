import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../../../services/customer.service';
import {MatDialog, MatDialogRef, MAT_DIALOG_DATA} from '@angular/material/dialog';
import { CustomerDeleteDialogComponent } from '../customer-delete-dialog/customer-delete-dialog.component'
import { from } from 'rxjs';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
  public customers;
  public term: string;
  public p:number;
  
  constructor(
    public customerService: CustomerService,
    public dialog: MatDialog
    ) { }

  ngOnInit(): void {
    this.customerService.getAllCustomer().subscribe( data => {
      this.customers = data;
    })
  }

  openDialog(customerId): void {
    this.customerService.getCustomerById(customerId).subscribe(customerData =>{
      console.log(customerData);
      const dialogRef = this.dialog.open(CustomerDeleteDialogComponent, {
        width: '500px',
        data: {data: customerData},
        disableClose: true
      });
      dialogRef.afterClosed().subscribe(result => {
        console.log('The dialog was closed');
        this.ngOnInit();
      });
    })
  }
}
