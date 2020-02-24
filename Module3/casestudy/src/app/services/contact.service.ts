import { Injectable } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class ContactService {
  public API: string = 'http://localhost:3000/contacts'

  constructor(public http: HttpClient) { }

  getAllContact(): Observable<any>{
    return this.http.get(this.API)
  }

  getContactById(contactId): Observable<any> {
    return this.http.get(this.API + '/' + contactId)
  }

  addNewContact(contact): Observable<any> {
    return this.http.post(this.API,contact)
  }
   
  deleteContactById(contactId): Observable<any>{
    return this.http.delete(this.API + '/' + contactId)
  }
  
  editEmployeeById(contact,contactId): Observable<any>{
    return this.http.put(this.API + '/' + contactId,contact)
  }
}
