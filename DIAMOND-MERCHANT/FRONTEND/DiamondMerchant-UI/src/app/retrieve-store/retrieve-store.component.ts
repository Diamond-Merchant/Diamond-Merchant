import { Component, OnInit } from '@angular/core';
import { StoreService } from '../store.service';
import {Store} from '../store.model'
@Component({
  selector: 'app-retrieve-store',
  templateUrl: './retrieve-store.component.html',
  styleUrls: ['./retrieve-store.component.css']
})
export class RetrieveStoreComponent implements OnInit {
 
  storeInfo:Array<Store>=[];
  flag:boolean = false;
  

  constructor(public storeSer:StoreService) { }

  ngOnInit(): void {
    
  }
  loadData(){
    this.flag=true;
    this.storeSer.loadStoreDetails().subscribe(data=>this.storeInfo=data);
  }
  

}
