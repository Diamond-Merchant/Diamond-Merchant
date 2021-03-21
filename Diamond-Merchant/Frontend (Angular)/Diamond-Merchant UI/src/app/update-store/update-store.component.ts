import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { StoreService} from '../store.service';

@Component({
  selector: 'app-update-store',
  templateUrl: './update-store.component.html',
  styleUrls: ['./update-store.component.css']
})

export class UpdateStoreComponent implements OnInit {
  msg:string = '';
  constructor(public storeSer:StoreService, public router:Router) { }

  ngOnInit(): void {}
    UpdateStoreInfo(storeInfo:any){
      this.storeSer
      .updateStoreInfo(storeInfo)
      .subscribe((data)=>(this.msg=data));
     
    }
  }


