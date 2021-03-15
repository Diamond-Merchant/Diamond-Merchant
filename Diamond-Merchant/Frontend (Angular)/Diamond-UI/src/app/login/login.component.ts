import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Customer } from '../customer.model';
import { FormControl, FormGroup } from '@angular/forms';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})
export class LoginComponent implements OnInit {
  msg: string = 'Login Successfull';
  customerRef = new FormGroup({
    cemail: new FormControl(),
    password: new FormControl(),
  });

  constructor(
    public router: Router,
    public customerService: CustomerService,
    public router1: Router
  ) {} //DI for Router which help to do routing programmatially

  ngOnInit(): void {}

  checkUser() {
    let loginRef = this.customerRef.value;
    let user = loginRef.cemail;

    this.customerService.loginCheck(loginRef).subscribe((data) => {
      if (loginRef.cemail == 'admin' && loginRef.password == 'admin') {
        console.log('Successfully admin Login');
        sessionStorage.setItem('cemail',user);

        this.router.navigate(['AdminDashboard']);
      } else if (data == 'Success') {
        console.log('Successfully Login');
        sessionStorage.setItem('customerId', loginRef.cemail);
        this.router.navigate(['home']);
      } else {
        console.log('Failure try once again');
        this.msg = 'UserName or password is wrong';
      }
    });
  }
}
