import { Component, OnInit } from '@angular/core';
import { Customer } from '../customer.model';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-customer-retrieve',
  templateUrl: './customer-retrieve.component.html',
  styleUrls: ['./customer-retrieve.component.css'],
})
export class CustomerRetrieveComponent implements OnInit {
  customerInfo: Array<Customer> = [];
  flag: boolean = false;

  constructor(public customerSer: CustomerService) {}

  ngOnInit(): void {}
  loadData() {
    this.flag = true;
    this.customerSer
      .loadCustomerDetails()
      .subscribe((data) => (this.customerInfo = data));
  }
}
