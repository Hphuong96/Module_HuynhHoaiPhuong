import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder ,Validators } from '@angular/forms'
import { ServiceService } from '../../../services/service.service'
import { Router } from '@angular/router'



@Component({
  selector: 'app-create-service',
  templateUrl: './create-service.component.html',
  styleUrls: ['./create-service.component.css']
})
export class CreateServiceComponent implements OnInit {
  public formAddNewService: FormGroup;
  public maxdate = new Date();


  constructor(
    public formBuilder: FormBuilder,
    public serviceService: ServiceService,
    public router: Router
  ) { }

  ngOnInit(): void {
    this.formAddNewService = this.formBuilder.group({
      nameService: ['',[Validators.required]],
      area: ['',[Validators.required,Validators.pattern('^[1-9]*$')]],
      numberOfFloor: ['',[Validators.required,Validators.pattern('^([1-9]{1}|10)$')]],
      maxPeople: ['',[Validators.required,Validators.pattern('^([1-9]{1}|10)$')]],
      cost: ['',[Validators.required,Validators.pattern('^[1-9]*$')]],
      idRentType: ['',[Validators.required,Validators.pattern('^([1-5]{1}$)')]],
      status: ['',[Validators.required]]
    })
  }

  addNewService(){
    this.serviceService.addNewService(this.formAddNewService.value).subscribe(data =>{
      this.router.navigateByUrl('services-list')
    })
  }
}
