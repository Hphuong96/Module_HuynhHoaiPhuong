import { Injectable } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Observable } from 'rxjs'
import { from } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  public API: string = 'http://localhost:3000/customer'

  constructor(public http: HttpClient) { }

  getAllCustomer(): Observable<any>{
    return this.http.get(this.API)
  }

  getCustomerById(customerId): Observable<any>{
    return this.http.get(this.API + '/'+customerId)
  }

  addNewCustomer(customer): Observable<any>{
    return  this.http.post(this.API , customer)
  }

  deleteCustomerById(customerId): Observable<any>{
    return this.http.delete(this.API + '/' + customerId)
  }

  editCustomerById(customer,customerId): Observable<any>{
    return this.http.put(this.API + '/' +customerId, customer)
  }

}
