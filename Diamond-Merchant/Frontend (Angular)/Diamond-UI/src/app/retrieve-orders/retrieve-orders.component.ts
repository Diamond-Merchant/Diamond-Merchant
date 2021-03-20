import { Component, OnInit } from '@angular/core';
import { OrdersService } from '../orders.service';
import {Orders} from '../orders.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-retrieve-orders',
  templateUrl: './retrieve-orders.component.html',
  styleUrls: ['./retrieve-orders.component.css']
})
export class RetrieveOrdersComponent implements OnInit {

  ordersInfo:Array<Orders>=[];
  flag:boolean = false;
  oedersSer: any;
  route: any;
 
  
  constructor(public ordersSer:OrdersService, public router:Router) { }


  ngOnInit() {
 
    this.ordersSer.loadOrdersDetails().subscribe(data=>{this.ordersInfo=data;
    });
    
    }
  
    btnClick () {
      this.router.navigateByUrl('/StoreOrders');
   }
  
    btnUpdate(){
      this.router.navigateByUrl('/UpdateOrders');
    }
  
    btnDelete(){
      this.router.navigateByUrl('/DeleteOrders');
    }
  }


