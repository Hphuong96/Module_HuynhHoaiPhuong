import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../../../services/service.service'
import {MatDialog, MatDialogRef, MAT_DIALOG_DATA} from '@angular/material/dialog';
import { DeleteServiceDialogComponent } from '../delete-service-dialog/delete-service-dialog.component';

import { from } from 'rxjs';
@Component({
  selector: 'app-list-services',
  templateUrl: './list-services.component.html',
  styleUrls: ['./list-services.component.css']
})
export class ListServicesComponent implements OnInit {
  public services;
  public term: string;
  public p:number;
  
  constructor(
    public serviceService: ServiceService,
    public dialog: MatDialog 
    ) { }

  ngOnInit(): void {
    this.serviceService.getAllService().subscribe(data => {
      this.services = data;
    })
  }
  openDialog(serviceId): void {
    this.serviceService.getServiceById(serviceId).subscribe(serviceData =>{
      console.log(serviceData);
      const dialogRef = this.dialog.open(DeleteServiceDialogComponent, {
        width: '500px',
        data: {data: serviceData},
        disableClose: true
      });
      dialogRef.afterClosed().subscribe(result => {
        console.log('The dialog was closed');
        this.ngOnInit();
      });
    })
  }
}
