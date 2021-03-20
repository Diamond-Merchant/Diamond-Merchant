import { Component, OnInit } from '@angular/core';
import { RetailerService } from '../retailer.service';
import {Retailer} from '../retailer.model';
import { Router} from '@angular/router';

@Component({
  selector: 'app-retrieve-retailer',
  templateUrl: './retrieve-retailer.component.html',
  styleUrls: ['./retrieve-retailer.component.css']
})
export class RetrieveRetailerComponent implements OnInit {

  retailerInfo:Array<Retailer>=[];
  flag:boolean = false;
  route: any;
 
  
  constructor(public retailerSer:RetailerService, public router:Router) { }
  

  ngOnInit() {
 
    this.retailerSer.loadRetailerDetails().subscribe(data=>{this.retailerInfo=data;
    });
    
    }
     
   btnClick () {
    this.router.navigateByUrl('/StoreRetailer');
 }

  btnUpdate(){
    this.router.navigateByUrl('/UpdateRetailer');
  }

  btnDelete(){
    this.router.navigateByUrl('/DeleteRetailer');
  }
 
   
  }