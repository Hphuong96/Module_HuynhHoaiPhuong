import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";
import { CommonModule } from "@angular/common";
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { FormsModule } from '@angular/forms'
import {NgxPaginationModule} from 'ngx-pagination';
import { ReactiveFormsModule } from '@angular/forms';
import {MatDatepickerModule} from '@angular/material/datepicker';



import { ListEmployeeComponent } from "./components/employees/list-employee/list-employee.component";
import { NavigatorComponent } from "./components/navigator/navigator.component";
import { MainComponent } from "./components/layout/main/main.component";
import { ListContactComponent } from './components/contact/list-contact/list-contact.component';
import { ListContactdetailComponent } from './components/detail-contact/list-contactdetail/list-contactdetail.component';
import { ListServicesComponent } from './components/servicess/list-services/list-services.component';
import { CustomerListComponent } from './components/customer/customer-list/customer-list.component';
import { CreateContactComponent } from './components/contact/create-contact/create-contact.component';
import { HomeComponent } from './components/home/home.component';
import { CreateEmployeeComponent } from './components/employees/create-employee/create-employee.component';
import { AngularMaterialModule } from './material.module';
import { EmployeeDeleteDialogComponent } from './components/employees/employee-delete-dialog/employee-delete-dialog.component';
import { EditEmployeeComponent } from './components/employees/edit-employee/edit-employee.component';
import { CreateCustomerComponent } from './components/customer/create-customer/create-customer.component';
import { EditCustomerComponent } from './components/customer/edit-customer/edit-customer.component';
import { CustomerDeleteDialogComponent } from './components/customer/customer-delete-dialog/customer-delete-dialog.component';
import { CreateServiceComponent } from './components/servicess/create-service/create-service.component';
import { DeleteServiceDialogComponent } from './components/servicess/delete-service-dialog/delete-service-dialog.component';
import { EditServiceComponent } from './components/servicess/edit-service/edit-service.component';


const routes: Routes = [
  {path: "",component: MainComponent,children: [
    { path: "", component: HomeComponent },
    { path: "employee-list", component: ListEmployeeComponent},
    { path: "contact-list", component: ListContactComponent},
    { path: "customer-list", component: CustomerListComponent},
    { path: "contactDetail-list", component: ListContactdetailComponent},
    { path: "services-list", component: ListServicesComponent},
    { path: "create-employee", component: CreateEmployeeComponent},
    { path: "edit-employee/:id", component: EditEmployeeComponent},
    { path: "create-customer", component: CreateCustomerComponent},
    { path: "edit-customer/:id", component: EditCustomerComponent},
    { path: "create-service", component: CreateServiceComponent},

  ]}
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes),
    CommonModule,
    Ng2SearchPipeModule,
    FormsModule,
    NgxPaginationModule,
    ReactiveFormsModule,
    AngularMaterialModule
  ],
  exports: [RouterModule],
  declarations: [
    ListEmployeeComponent,
    ListContactComponent,
    ListContactdetailComponent,
    ListServicesComponent,
    CustomerListComponent,
    CreateContactComponent,
    HomeComponent,
    CreateEmployeeComponent,
    EmployeeDeleteDialogComponent,
    EditEmployeeComponent,
    CreateCustomerComponent,
    EditCustomerComponent,
    CustomerDeleteDialogComponent,
    CreateServiceComponent,
    DeleteServiceDialogComponent,
    EditServiceComponent,
  ]
})
export class AppRoutingModule { }
