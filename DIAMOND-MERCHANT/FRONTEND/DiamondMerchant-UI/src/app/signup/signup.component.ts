import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { SignupService } from '../signup.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css'],
})
export class SignupComponent implements OnInit {
  signupInfo = new FormGroup({
    customerid: new FormControl(),
    name: new FormControl(),
    cemail: new FormControl(),
    gender: new FormControl(),
    phonenumber: new FormControl(),
    password: new FormControl(),
  });
  msg: string = '';
  constructor(public signupSer: SignupService) {}

  ngOnInit(): void {}
  signupDetails() {
    let signupRef = this.signupInfo.value;
    this.signupSer
      .signupDetails(signupRef)
      .subscribe((result) => (this.msg = result));
  }
}
