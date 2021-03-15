import { Component, OnInit } from '@angular/core';
import { OrdersService } from '../orders.service';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-store-orders',
  templateUrl: './store-orders.component.html',
  styleUrls: ['./store-orders.component.css']
})
export class StoreOrdersComponent implements OnInit {
ordersInfo = new FormGroup({
    oid: new FormControl(),
    pname: new FormControl(),
	  oqty:new FormControl(),
    oprice: new FormControl(),
	  odate: new FormControl(),
	  ostatus: new FormControl(),
  });

  msg:string='';
  constructor(public ordersSer: OrdersService) { }

  
  ngOnInit(): void {}
  storeOrdersDetails() {
    let ordersRef = this.ordersInfo.value;
    this.ordersSer
      .storeOrdersDetails(ordersRef)
      .subscribe((result) => (this.msg = result));
  }
  }
