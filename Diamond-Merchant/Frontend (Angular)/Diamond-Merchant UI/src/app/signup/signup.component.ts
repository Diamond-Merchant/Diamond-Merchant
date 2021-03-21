import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Customer } from '../customer.model';
import { CustomerService } from '../customer.service';
import { SignupService } from '../signup.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css'],
})
export class SignupComponent implements OnInit {

  /* signupInfo = new FormGroup({
    customerid: new FormControl(),
    name: new FormControl(),
    cemail: new FormControl(),
    gender: new FormControl(),
    phonenumber: new FormControl(),
    password: new FormControl(),
  }); */

  msg: string = '';

  constructor(public registerService:CustomerService, public router:Router) {}

  ngOnInit(): void {}

  signupDetails(customer:Customer) {
    this.registerService.storeCustomerDetails(customer).subscribe(data => this.msg = data);
    setTimeout(() => {
      this.router.navigate(["login"])
    }, 1000);
  }

}
