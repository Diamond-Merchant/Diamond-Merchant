import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import {Bill} from './bill.model';

@Injectable({
  providedIn: 'root'
})
export class BillService {
  loadBillDetails(): Observable<Bill[]>{
    return this.httpClient.get<Bill[]>("http://localhost:8090/bill/getBillData")
  }
 

  constructor(public httpClient:HttpClient) { }

  storeBillDetails(billRef:any):Observable<string>{
    return this.httpClient.post('http://localhost:8090/bill/storeBillData',
    billRef,
    {responseType:'text'}
    );
  }
 
  updateBillInfo(billRef:any): Observable<string>{
    return this.httpClient.put('http://localhost:8090/bill/updateBillData',
    billRef,
    {responseType:'text'}
      );
   }

   deleteBillInfo(bid:any):Observable<string>{
     return this.httpClient.delete('http://localhost:8090/bill/deleteBillData/' 
     +bid,
      {responseType:'text'}
     );
   }
}
