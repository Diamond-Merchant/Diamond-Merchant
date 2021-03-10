import { Component, OnInit } from '@angular/core';
import { RetailerService} from '../retailer.service';

@Component({
  selector: 'app-delete-retailer',
  templateUrl: './delete-retailer.component.html',
  styleUrls: ['./delete-retailer.component.css']
})
export class DeleteRetailerComponent implements OnInit {

  constructor(public retailerSer:RetailerService) { }
  msg:string ='';
  ngOnInit():void{}
  
 deleteRetailer(rid:any){
   this.retailerSer
   .deleteRetailerInfo(rid).subscribe((result)=>(this.msg=result));
 }

}
