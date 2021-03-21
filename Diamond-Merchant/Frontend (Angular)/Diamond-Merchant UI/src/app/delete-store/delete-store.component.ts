import { Component, OnInit } from '@angular/core';
import { StoreService } from '../store.service';

@Component({
  selector: 'app-delete-store',
  templateUrl: './delete-store.component.html',
  styleUrls: ['./delete-store.component.css']
})
export class DeleteStoreComponent implements OnInit {
  

  constructor(public storeSer:StoreService) { }
  msg:string ='';
  ngOnInit():void{}
  
 deleteStore(storeid:any){
   this.storeSer
   .deleteStoreInfo(storeid)
   .subscribe((result)=>(this.msg=result));
 }
}
