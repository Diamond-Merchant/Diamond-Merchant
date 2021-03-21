import { Component, OnInit } from '@angular/core';
import { StoreService } from '../store.service';
import { FormGroup, FormControl } from '@angular/forms';
@Component({
  selector: 'app-store-store',
  templateUrl: './store-store.component.html',
  styleUrls: ['./store-store.component.css']
})
export class StoreStoreComponent implements OnInit {
  storeInfo = new FormGroup({
    storeid: new FormControl(),
    pid: new FormControl(),
    oid: new FormControl(),
    eid: new FormControl(),
    contact: new FormControl(),
	  address:new FormControl(),
  	storename: new FormControl(),
	  email: new FormControl(),
	  //pname: new FormControl(),
	  //productprice:new FormControl(),
  });

  msg:string='';
  constructor(public storeSer: StoreService) { }

  
  ngOnInit(): void {}
  storeStoreDetails() {
    let storeRef = this.storeInfo.value;
    this.storeSer
      .storeStoreDetails(storeRef)
      .subscribe((result) => (this.msg = result));
  }
  }


