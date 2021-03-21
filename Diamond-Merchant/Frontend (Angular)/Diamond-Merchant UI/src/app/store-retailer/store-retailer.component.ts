import { Component, OnInit } from '@angular/core';
import { RetailerService } from '../retailer.service';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-store-retailer',
  templateUrl: './store-retailer.component.html',
  styleUrls: ['./store-retailer.component.css'],
})
export class StoreRetailerComponent implements OnInit {
  retailerInfo = new FormGroup({
    rid: new FormControl(),
    email: new FormControl(),
    rname: new FormControl(),
    remail: new FormControl(),
    rpassword: new FormControl(),
    rphone: new FormControl(),
    raddress: new FormControl(),
    rpname: new FormControl(),
    rostatus: new FormControl(),
    oid: new FormControl(),
    storeid: new FormControl(),
    pid: new FormControl(),
  });

  msg: string = '';
  constructor(public retailerSer: RetailerService) {}

  ngOnInit(): void {}
  storeRetailerDetails() {
    let retailerRef = this.retailerInfo.value;
    this.retailerSer
      .storeRetailerDetails(retailerRef)
      .subscribe((result) => (this.msg = result));
  }
}
