import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {Retailer} from './retailer.model';

@Injectable({
  providedIn: 'root'
})
export class RetailerService {
  

  loadRetailerDetails(): Observable<Retailer[]>{
    return this.httpClient.get<Retailer[]>("http://localhost:8090/retailer/getRetailerData")
  }
  constructor(public httpClient:HttpClient) { }
  
  storeRetailerDetails(retailerRef:any):Observable<string>{
   return this.httpClient.post('http://localhost:8090/retailer/storeRetailerData', retailerRef,
    {responseType:'text'}
    );
  }
 
  updateRetailerInfo(rid:any): Observable<string>{
    return this.httpClient.put('http://localhost:8090/retailer/updateRetailerData' ,rid,
    {responseType:'text'}
      );
   }

   deleteRetailerInfo(rid:any):Observable<string>{
     return this.httpClient.delete('http://localhost:8090/retailer/deleteRetailerData/'
     +rid,
      {responseType:'text'}
     );
   }
}


