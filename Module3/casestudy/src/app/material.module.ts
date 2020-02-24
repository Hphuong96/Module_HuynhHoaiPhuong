import { NgModule } from "@angular/core";
import { MatNativeDateModule } from '@angular/material/core';
import { MatInputModule } from '@angular/material/input';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { EmployeeDeleteDialogComponent } from './components/employees/employee-delete-dialog/employee-delete-dialog.component';
import { MatDialogModule} from '@angular/material/dialog';


@NgModule({
  imports: [
    MatDatepickerModule,
    MatNativeDateModule,
    MatFormFieldModule,
    MatInputModule,
    BrowserAnimationsModule,
    MatDialogModule
  ],
  exports: [
    MatDatepickerModule,
    MatNativeDateModule,
    MatFormFieldModule,
    MatInputModule,
    MatDialogModule
  ],
  entryComponents: [
      EmployeeDeleteDialogComponent
  ]
})
export class AngularMaterialModule {}
