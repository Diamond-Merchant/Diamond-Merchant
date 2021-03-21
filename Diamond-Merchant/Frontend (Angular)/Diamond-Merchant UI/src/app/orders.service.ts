import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import {Orders} from './orders.model';
@Injectable({
  providedIn: 'root'
})
export class OrdersService {
  loadOrdersDetails(): Observable<Orders[]>{
    return this.httpClient.get<Orders[]>("http://localhost:8090/orders/allOrdersData")
  }
 

  constructor(public httpClient:HttpClient) { }

  storeOrdersDetails(ordersRef:any):Observable<string>{
    return this.httpClient.post('http://localhost:8090/orders/storeOrdersData',
    ordersRef,
    {responseType:'text'}
    );
  }
 
  updateOrdersInfo(ordersRef:any): Observable<string>{
    return this.httpClient.put('http://localhost:8090/orders/updateOrdersData',
    ordersRef,
    {responseType:'text'}
      );
   }

   deleteOrdersInfo(oid:any):Observable<string>{
     return this.httpClient.delete('http://localhost:8090/orders/deleteOrdersData/' 
     +oid,
      {responseType:'text'}
     );
   }
}
