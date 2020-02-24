import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators} from '@angular/forms'
import { EmployeeService } from '../../../services/employee.service';
import { Router } from '@angular/router'
import { from } from 'rxjs';



@Component({
  selector: 'app-create-employee',
  templateUrl: './create-employee.component.html',
  styleUrls: ['./create-employee.component.css']
})
export class CreateEmployeeComponent implements OnInit {
  
  public formAddNewEmployee: FormGroup;
  public maxDate = new  Date();
 
  constructor( 
    public formBuilder:FormBuilder, 
    public employeeService: EmployeeService,
    public router: Router
    ) { }

  ngOnInit(): void {
    this.formAddNewEmployee = this.formBuilder.group({
      name: ['',[Validators.required]],
      idRole: ['',[Validators.required]],
      idSkill: ['',[Validators.required]],
      idDepart: ['',[Validators.required]],
      dateOfBirth: ['',[Validators.required]],
      idCard: ['',[Validators.required,Validators.pattern('^[0-9]{9}$')]],
      salary: ['',[Validators.required,Validators.pattern('^[0-9]*$')]],
      phoneNumber: ['',[Validators.required,Validators.pattern('^(090|091|([\(]84[\)][\+]90)|([\(]84[\)][\+]91))[0-9]{7}$')]],
      email: ['',[Validators.required,Validators.email]],
      address: ['',[Validators.required]],
    })
  }

  addNewEmployee(){
    console.log(this.formAddNewEmployee.value)
    this.employeeService.addNewEmployee(this.formAddNewEmployee.value).subscribe(data =>{
      console.log(data)
      this.router.navigateByUrl('employee-list')
    })
  }

}
