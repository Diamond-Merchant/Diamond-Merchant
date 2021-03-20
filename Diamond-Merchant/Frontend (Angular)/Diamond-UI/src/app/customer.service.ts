import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Customer } from './customer.model';
@Injectable({
  providedIn: 'root',
})
export class CustomerService {
  constructor(public httpClient: HttpClient) {}

  loadCustomerDetails(): Observable<Customer[]> {
    return this.httpClient.get<Customer[]>(
      'http://localhost:8090/customer/allCustomerData'
    );
  }

  storeCustomerDetails(customerRef: any): Observable<string> {
    return this.httpClient.post(
      'http://localhost:8090/customer/storeCustomerData',
      customerRef,
      { responseType: 'text' }
    );
  }

  updateCustomerInfo(customerRef: any): Observable<string> {
    return this.httpClient.put(
      'http://localhost:8090/customer/updateCustomerData',
      customerRef,
      { responseType: 'text' }
    );
  }
  deleteCustomerInfo(customerId: any): Observable<string> {
    return this.httpClient.delete(
      'http://localhost:8090/customer/deleteCustomerData/' + customerId,
      { responseType: 'text' }
    );
  }
  loginCheck(loginRef: any): Observable<string> {
    return this.httpClient.post(
      'http://localhost:8090/customer/login',
      loginRef,
      {
        responseType: 'text',
      }
    );
  }
}
