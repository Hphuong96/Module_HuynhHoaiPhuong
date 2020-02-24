import { Component, OnInit, Inject } from '@angular/core';
import { ServiceService } from '../../../services/service.service';
import { Route } from '@angular/compiler/src/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';


@Component({
  selector: 'app-delete-service-dialog',
  templateUrl: './delete-service-dialog.component.html',
  styleUrls: ['./delete-service-dialog.component.css']
})
export class DeleteServiceDialogComponent implements OnInit {
  public serviceName;
  public serviceId;

  constructor(
    public dialogRef: MatDialogRef<DeleteServiceDialogComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    public serviceService: ServiceService
  ) { }

  ngOnInit(): void {
    this.serviceName = this.data.data.nameService;
    this.serviceId = this.data.data.id;
  }

    deleteService(){
      this.serviceService.deleteServiceById(this.serviceId).subscribe(data =>{
        this.dialogRef.close()
      })
    }
}
