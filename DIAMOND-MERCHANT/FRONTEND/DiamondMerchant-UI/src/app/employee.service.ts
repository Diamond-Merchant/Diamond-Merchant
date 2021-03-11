import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import {Employee} from './employee.model';
@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  loadEmployeeDetails(): Observable<Employee[]>{
    return this.httpClient.get<Employee[]>("http://localhost:8090/employee/allEmployeeData")
  }
 

  constructor(public httpClient:HttpClient) { }

  storeEmployeeDetails(employeeRef:any):Observable<string>{
    return this.httpClient.post('http://localhost:8090/employee/storeEmployeeData',
    employeeRef,
    {responseType:'text'}
    );
  }
 
  updateEmployeeInfo(employeeRef:any): Observable<string>{
    return this.httpClient.put('http://localhost:8090/employee/updateEmployeeData',
    employeeRef,
    {responseType:'text'}
      );
   }

   deleteEmployeeInfo(eid:any):Observable<string>{
     return this.httpClient.delete('http://localhost:8090/employee/deleteEmployeeData/' 
     +eid,
      {responseType:'text'}
     );
   }
}
