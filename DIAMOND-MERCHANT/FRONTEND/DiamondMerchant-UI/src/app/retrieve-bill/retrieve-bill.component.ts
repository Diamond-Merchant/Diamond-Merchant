import { Component, OnInit } from '@angular/core';
import { BillService } from '../bill.service';
import {Bill} from '../bill.model';

@Component({
  selector: 'app-retrieve-bill',
  templateUrl: './retrieve-bill.component.html',
  styleUrls: ['./retrieve-bill.component.css']
})
export class RetrieveBillComponent implements OnInit {

  billInfo:Array<Bill>=[];
  flag:boolean = false;
 
  
  constructor(public billSer:BillService) { }

  ngOnInit(): void {
    
  }
  loadData(){
    this.flag=true;
    this.billSer.loadBillDetails().subscribe(data=>this.billInfo=data);
    }
  
}

