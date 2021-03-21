import { Component, OnInit } from '@angular/core';
import { BillService } from '../bill.service';

@Component({
  selector: 'app-update-bill',
  templateUrl: './update-bill.component.html',
  styleUrls: ['./update-bill.component.css']
})
export class UpdateBillComponent implements OnInit {

  msg:string = '';
  constructor(public billSer:BillService) { }

  ngOnInit(): void {}
    UpdateBillInfo(billInfo:any){
      this.billSer
      .updateBillInfo(billInfo)
      .subscribe((data)=>(this.msg=data));
    }
  }
