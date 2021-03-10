import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-customer-delete',
  templateUrl: './customer-delete.component.html',
  styleUrls: ['./customer-delete.component.css'],
})
export class CustomerDeleteComponent implements OnInit {
  constructor(public customerSer: CustomerService) {}
  msg: string = '';
  ngOnInit(): void {}
  deleteCustomer(customerid: any) {
    this.customerSer
      .deleteCustomerInfo(customerid)
      .subscribe((result) => (this.msg = result));
  }
}
