import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { CustomerService } from '../customer.service';
@Component({
  selector: 'app-customer-store',
  templateUrl: './customer-store.component.html',
  styleUrls: ['./customer-store.component.css'],
})
export class CustomerStoreComponent implements OnInit {
  customerInfo = new FormGroup({
    customerid: new FormControl(),
    name: new FormControl(),
    cemail: new FormControl(),
    gender: new FormControl(),
    phonenumber: new FormControl(),
    password: new FormControl(),
  });

  msg: string = '';
  constructor(public customerSer: CustomerService) {}

  ngOnInit(): void {}
  storeCustomerDetails() {
    let customerRef = this.customerInfo.value;
    this.customerSer
      .storeCustomerDetails(customerRef)
      .subscribe((result) => (this.msg = result));
  }
}
