import { Component, OnInit } from '@angular/core';
import { BillService } from '../bill.service';
import {Bill} from '../bill.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-retrieve-bill',
  templateUrl: './retrieve-bill.component.html',
  styleUrls: ['./retrieve-bill.component.css']
})
export class RetrieveBillComponent implements OnInit {

  billInfo:Array<Bill>=[];
  flag:boolean = false;
  route: any;
 
  
  constructor(public billSer:BillService, public router:Router) { }

  
  
  ngOnInit() {

   this.billSer.loadBillDetails().subscribe(data=>{this.billInfo=data;
   });
   
   }
   btnClick () {
    this.router.navigateByUrl('/StoreBill');
 }

  btnUpdate(){
    this.router.navigateByUrl('/UpdateBill');
  }

  btnDelete(){
    this.router.navigateByUrl('/DeleteBill');
  }
 }
 
