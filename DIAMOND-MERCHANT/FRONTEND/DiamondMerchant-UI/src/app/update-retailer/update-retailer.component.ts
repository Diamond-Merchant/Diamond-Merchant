import { Component, OnInit } from '@angular/core';
import { RetailerService} from '../retailer.service';

@Component({
  selector: 'app-update-retailer',
  templateUrl: './update-retailer.component.html',
  styleUrls: ['./update-retailer.component.css']
})
export class UpdateRetailerComponent implements OnInit {
  msg:string = '';
  constructor(public retailerSer:RetailerService) { }

  ngOnInit(): void {}
    UpdateRetailerInfo(retailerInfo:any){
      this.retailerSer
      .updateRetailerInfo(retailerInfo)
      .subscribe((data)=>(this.msg=data));
    }
  }