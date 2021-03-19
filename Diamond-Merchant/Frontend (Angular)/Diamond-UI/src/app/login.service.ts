import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class LoginService {
  constructor(public http: HttpClient) {}

  public loginStatus = 0;
  setLoginStatus(status: number) {
    this.loginStatus = status;
  }

  loginCheck(loginRef: any): Observable<string> {
    return this.http.post('http://localhost:8090/customer/login', loginRef, {
      responseType: 'text',
    });
  }

  signUpService(signUpRef: any): Observable<string> {
    return this.http.post('http://localhost:9090/signup', signUpRef, {
      responseType: 'text',
    });
  }
}
