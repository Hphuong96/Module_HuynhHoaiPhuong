import { Component, OnInit ,Inject} from '@angular/core';
import { CustomerService } from '../../../services/customer.service'
import {MatDialog, MatDialogRef, MAT_DIALOG_DATA} from '@angular/material/dialog';

import { from } from 'rxjs';

@Component({
  selector: 'app-customer-delete-dialog',
  templateUrl: './customer-delete-dialog.component.html',
  styleUrls: ['./customer-delete-dialog.component.css']
})
export class CustomerDeleteDialogComponent implements OnInit {
  public customerName;
  public customerId;

  constructor(
    public dialogRef: MatDialogRef<CustomerDeleteDialogComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any ,
    public customerService : CustomerService) {}

  ngOnInit(): void {
    this.customerName = this.data.data.name;
    this.customerId = this.data.data.id;
  }

  deleteCustomer(){
    this.customerService.deleteCustomerById(this.customerId).subscribe(data=>{
      this.dialogRef.close()
    })
  }

}
