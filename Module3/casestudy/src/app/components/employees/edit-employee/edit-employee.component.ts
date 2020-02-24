import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators} from '@angular/forms'
import { Router, ActivatedRoute } from '@angular/router'
import { EmployeeService } from '../../../services/employee.service';




@Component({
  selector: 'app-edit-employee',
  templateUrl: './edit-employee.component.html',
  styleUrls: ['./edit-employee.component.css']
})
export class EditEmployeeComponent implements OnInit {

  public formEditEmployee: FormGroup;
  public maxDate = new  Date();
  public employeeId;
 
  constructor( 
    public formBuilder:FormBuilder, 
    public employeeService: EmployeeService,
    public router: Router,
    public activatedRoute: ActivatedRoute
    ) { }

  ngOnInit(): void {
    this.formEditEmployee = this.formBuilder.group({
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

    this.activatedRoute.params.subscribe(data=> {
      console.log(data)
      this.employeeId = data.id;
      this.employeeService.getEmployeeById(this.employeeId).subscribe(data =>{
        this.formEditEmployee.patchValue(data)
      })
    })

  }

  editEmployee(){
    this.employeeService.editEmployeeById(this.formEditEmployee.value,this.employeeId).subscribe(data =>{
      this.router.navigateByUrl('/employee-List')
    })
  }
}
