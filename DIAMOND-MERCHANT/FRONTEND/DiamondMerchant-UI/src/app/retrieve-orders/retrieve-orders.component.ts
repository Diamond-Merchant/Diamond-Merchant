import { Component, OnInit } from '@angular/core';
import { OrdersService } from '../orders.service';
import {Orders} from '../orders.model';

@Component({
  selector: 'app-retrieve-orders',
  templateUrl: './retrieve-orders.component.html',
  styleUrls: ['./retrieve-orders.component.css']
})
export class RetrieveOrdersComponent implements OnInit {

  ordersInfo:Array<Orders>=[];
  flag:boolean = false;
 
  
  constructor(public ordersSer:OrdersService) { }

  ngOnInit(): void {
    
  }
  loadData(){
    this.flag=true;
    this.ordersSer.loadOrdersDetails().subscribe(data=>this.ordersInfo=data);
    }
  
}
