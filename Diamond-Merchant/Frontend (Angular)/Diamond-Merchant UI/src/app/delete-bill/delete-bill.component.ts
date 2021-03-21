import { Component, OnInit } from '@angular/core';
import { BillService } from '../bill.service';

@Component({
  selector: 'app-delete-bill',
  templateUrl: './delete-bill.component.html',
  styleUrls: ['./delete-bill.component.css']
})
export class DeleteBillComponent implements OnInit {

  constructor(public billSer:BillService) { }
  msg:string ='';
  ngOnInit():void{}
  
 deleteBill(bid:any){
   this.billSer
   .deleteBillInfo(bid)
   .subscribe((result)=>(this.msg=result));
 }
}
