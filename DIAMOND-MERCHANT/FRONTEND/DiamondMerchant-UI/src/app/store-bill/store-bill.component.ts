import { Component, OnInit } from '@angular/core';
import { BillService } from '../bill.service';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-store-bill',
  templateUrl: './store-bill.component.html',
  styleUrls: ['./store-bill.component.css']
})
export class StoreBillComponent implements OnInit {
  
      billInfo = new FormGroup({
      eid: new FormControl(),
      ename: new FormControl(),
      gender:new FormControl(),
      birthdate: new FormControl(),
      joiningdate: new FormControl(),
      designation: new FormControl(),
    });
  
    msg:string='';
    constructor(public billSer: BillService) { }
  
    
    ngOnInit(): void {}
    storeBillDetails() {
      let billRef = this.billInfo.value;
      this.billSer
        .storeBillDetails(billRef)
        .subscribe((result) => (this.msg = result));
    }
    }
  