import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators} from '@angular/forms'
import { CustomerService } from '../../../services/customer.service'
import { Router } from '@angular/router'



@Component({
  selector: 'app-create-customer',
  templateUrl: './create-customer.component.html',
  styleUrls: ['./create-customer.component.css']
})
export class CreateCustomerComponent implements OnInit {
  public formAddNewCustomer: FormGroup;
  public maxDate = new Date();
  constructor(
    public formBuilder: FormBuilder,
    public customerService: CustomerService,
    public router: Router
  ) { } 

  ngOnInit(): void {
    this.formAddNewCustomer = this.formBuilder.group({
      name: ['',[Validators.required]],
      type: ['',[Validators.required]],
      dateOfBirth: ['',[Validators.required]],
      idCard: ['',[Validators.required,Validators.pattern('^[0-9]{9}$')]],
      phoneNumber: ['',[Validators.required,Validators.pattern('^(090|091|([\(]84[\)][\+]90)|([\(]84[\)][\+]91))[0-9]{7}$')]],
      email: ['',[Validators.required,Validators.email]],
      address: ['',[Validators.required]],
    })
  }

  addNewCustomer(){
    this.customerService.addNewCustomer(this.formAddNewCustomer.value).subscribe(data=>{
      this.router.navigateByUrl('customer-list')
    })
  }
}
