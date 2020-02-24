import { Injectable } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http'
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class DetailContactService {
  public API: string = "http://localhost:3000/detail-contact"
  constructor(public http: HttpClient) { }
  
  getAllDetailService(): Observable<any>{
    return this.http.get(this.API)
  }

  addNewDetailService(detailService): Observable<any>{
    return this.http.post(this.API ,detailService)
  }

  getDetailServiceById(detailServiceId): Observable<any>{
    return this.http.get(this.API +'/', detailServiceId)
  }

  deleteDetailServiceById(detailServiceId): Observable<any>{
    return this.http.delete(this.API + '/' ,detailServiceId)
  }

  editDetailServiceById(detailServiceId): Observable<any>{
    return this.http.put(this.API + '/',detailServiceId)
  }
}
