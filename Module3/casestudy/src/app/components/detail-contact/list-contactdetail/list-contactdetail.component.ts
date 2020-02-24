import { Component, OnInit } from '@angular/core';
import { DetailContactService } from '../../../services/detail-contact.service'
import { from } from 'rxjs';
@Component({
  selector: 'app-list-contactdetail',
  templateUrl: './list-contactdetail.component.html',
  styleUrls: ['./list-contactdetail.component.css']
})
export class ListContactdetailComponent implements OnInit {
  public detailServices;
  public term: string;
  public p:number;
  
  constructor( public detailService: DetailContactService) { }

  ngOnInit(): void {
    this.detailService.getAllDetailService().subscribe(data => {
      this.detailServices = data;
    })
  }

}
