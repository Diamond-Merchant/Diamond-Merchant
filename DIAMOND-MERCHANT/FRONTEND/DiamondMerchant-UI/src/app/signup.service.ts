import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class SignupService {
  constructor(public httpClient: HttpClient) {}

  signupDetails(signupRef: any): Observable<string> {
    return this.httpClient.post(
      'http://localhost:8090/customer/storeCustomerData',
      signupRef,
      { responseType: 'text' }
    );
  }
}
