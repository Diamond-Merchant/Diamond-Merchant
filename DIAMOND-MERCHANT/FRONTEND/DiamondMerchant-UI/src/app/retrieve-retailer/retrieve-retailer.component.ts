import { Component, OnInit } from '@angular/core';
import { RetailerService } from '../retailer.service';
import {Retailer} from '../retailer.model';

@Component({
  selector: 'app-retrieve-retailer',
  templateUrl: './retrieve-retailer.component.html',
  styleUrls: ['./retrieve-retailer.component.css']
})
export class RetrieveRetailerComponent implements OnInit {

  retailerInfo:Array<Retailer>=[];
  flag:boolean = false;
 
  
  constructor(public retailerSer:RetailerService) { }

  ngOnInit(): void {
    
  }
  loadData(){
    this.flag=true;
    this.retailerSer.loadRetailerDetails ().subscribe(data=>this.retailerInfo=data);
    }
  
}
