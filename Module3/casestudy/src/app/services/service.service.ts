import { Injectable, ɵinitServicesIfNeeded } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Observable } from 'rxjs'
import { from } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class ServiceService {
  public API: string = 'http://localhost:3000/service'

  constructor( public http: HttpClient) { }
  
  getAllService():Observable<any>{
    return this.http.get(this.API)
  } 

  getServiceById(serviceId): Observable<any>{
    return this.http.get(this.API + '/' + serviceId)
  }

  addNewService(service): Observable<any>{
    return this.http.post(this.API,service)
  }

  deleteServiceById(serviceId):Observable<any>{
    return this.http.delete(this.API + '/' + serviceId)
  }

  editServiceById(service,serviceId):Observable<any>{
    return this.http.put(this.API + '/' + serviceId,service)
  }
}
