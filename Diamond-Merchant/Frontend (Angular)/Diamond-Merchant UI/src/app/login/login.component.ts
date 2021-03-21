import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Customer } from '../customer.model';
import { FormControl, FormGroup } from '@angular/forms';
import { CustomerService } from '../customer.service';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})
export class LoginComponent implements OnInit {
  msg: string = ' ';
  customer = new Customer();
  customer1 = new Customer();

  constructor(
    public router: Router,
    public customerService: CustomerService,
    public router1: Router,
    public store: LoginService
  ) {} //DI for Router which help to do routing programmatially

  onclickregister() {
    this.router.navigate(['register']);
  }

  register() {
    this.router.navigate(['register']);
  }

  ngOnInit(): void {}

  loginUser(userData: any) {
    let user = userData.cemail;
    let pass = userData.password;
    console.log(user + ' ' + pass);

    this.customer.cemail = user;
    this.customer.password = pass;

    this.customerService.checkLogin(this.customer).subscribe((obj) => {
      if (userData.cemail == 'admin' && userData.password == 'admin') {
        console.log('Successfully admin Login');
        sessionStorage.setItem('cemail', user);
        this.store.setLoginStatus(1);
        this.router.navigate(['RetrieveProduct']);
      } else if (obj == null) {
        console.log('wrong pass / username');
        this.msg =
          '** Invalid User Email & Password. Plz Enter Valid E-Mail & Password !!!!';
        console.log('customer');
      } else {
        console.log(obj);
        this.customer1 = obj;
        sessionStorage.setItem('customer', JSON.stringify(obj));
        this.store.setLoginStatus(1);
        this.router.navigate(['ProductPage']);
      }
    });
  }
}
