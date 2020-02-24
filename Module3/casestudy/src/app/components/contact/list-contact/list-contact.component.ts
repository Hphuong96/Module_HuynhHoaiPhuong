import { Component, OnInit } from '@angular/core';
import { ContactService } from '../../../services/contact.service'
import { from } from 'rxjs';

@Component({
  selector: 'list-contact',
  templateUrl: './list-contact.component.html',
  styleUrls: ['./list-contact.component.css']
})
export class ListContactComponent implements OnInit {
  public contacts;
  public term: string;
  public p:number;
  constructor( public contactService: ContactService) { }

  ngOnInit(): void {
    this.contactService.getAllContact().subscribe(data => {
      this.contacts = data;
    })
  }

}
