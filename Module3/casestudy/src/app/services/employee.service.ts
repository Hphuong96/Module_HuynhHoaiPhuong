import { Injectable } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Observable } from 'rxjs'
@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  public API: string = 'http://localhost:3000/employee';

  constructor(public http: HttpClient) { }

  getAllEmployee(): Observable<any> {
    return this.http.get(this.API)
  }
  
  addNewEmployee(employee): Observable<any> {
    return this.http.post(this.API, employee);
  }

  getEmployeeById(employeeId): Observable<any> {
    return this.http.get(this.API + '/' + employeeId);
  }

  deleteEmployeeById(employeeId): Observable<any> {
    return this.http.delete(this.API + '/' + employeeId);
  }

  editEmployeeById(employee,employeeId): Observable<any> {
    return this.http.put(this.API + '/' + employeeId, employee)
  }
}
