import { Component, OnInit } from '@angular/core';
import { StoreService } from '../store.service';
import {Store} from '../store.model';
import { Router} from '@angular/router';


@Component({
  selector: 'app-retrieve-store',
  templateUrl: './retrieve-store.component.html',
  styleUrls: ['./retrieve-store.component.css']
})
export class RetrieveStoreComponent implements OnInit {
 
  storeInfo:Array<Store>=[];
  flag:boolean = false;
  route: any;
  

  constructor(public storeSer:StoreService,  public router:Router) { }
  ngOnInit() {
 
    this.storeSer.loadStoreDetails().subscribe(data=>{this.storeInfo=data;
    });
    
    }
  
   btnClick () {
      this.router.navigateByUrl('/StoreStore');
   }
  
    btnUpdate(){
      this.router.navigateByUrl('/UpdateStore');
    }
  
    btnDelete(){
      this.router.navigateByUrl('/DeleteStore');
    }
   
  }