import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators} from '@angular/forms'
import { Router, ActivatedRoute } from '@angular/router'
import { CustomerService } from '../../../services/customer.service'

@Component({
  selector: 'app-edit-customer',
  templateUrl: './edit-customer.component.html',
  styleUrls: ['./edit-customer.component.css']
})
export class EditCustomerComponent implements OnInit {
  public formEditCustomer: FormGroup;
  public maxDate = new Date();
  public customerId;

  constructor(
    public formBuilder:FormBuilder, 
    public customerService: CustomerService,
    public router: Router,
    public activatedRoute: ActivatedRoute
  ) { }

  ngOnInit(): void {
    this.formEditCustomer = this.formBuilder.group({
      name: ['',[Validators.required]],
      type: ['',[Validators.required]],
      dateOfBirth: ['',[Validators.required]],
      idCard: ['',[Validators.required,Validators.pattern('^[0-9]{9}$')]],
      phoneNumber: ['',[Validators.required,Validators.pattern('^(090|091|([\(]84[\)][\+]90)|([\(]84[\)][\+]91))[0-9]{7}$')]],
      email: ['',[Validators.required,Validators.email]],
      address: ['',[Validators.required]],
    })

    this.activatedRoute.params.subscribe(data=> {
      this.customerId = data.id;
      this.customerService.getCustomerById(this.customerId).subscribe(data =>{
        this.formEditCustomer.patchValue(data)
      })
    })
  }

  editCustomer(){
    this.customerService.editCustomerById(this.formEditCustomer.value,this.customerId).subscribe(data => {
      this.router.navigateByUrl('/customer-list')
    })
  }
  
}
