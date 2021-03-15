import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';
@Component({
  selector: 'app-customer-update',
  templateUrl: './customer-update.component.html',
  styleUrls: ['./customer-update.component.css'],
})
export class CustomerUpdateComponent implements OnInit {
  msg: string = '';
  constructor(public customerSer: CustomerService) {}

  ngOnInit(): void {}
  updateCustomerInfo(customerInfo: any) {
    this.customerSer
      .updateCustomerInfo(customerInfo)
      .subscribe((data) => (this.msg = data));
  }
}
