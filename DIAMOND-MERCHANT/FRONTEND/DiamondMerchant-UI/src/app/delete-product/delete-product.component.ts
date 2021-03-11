import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-delete-product',
  templateUrl: './delete-product.component.html',
  styleUrls: ['./delete-product.component.css']
})

  export class DeleteProductComponent implements OnInit {

  
    constructor(public productSer:ProductService) { }
    msg:string ='';
    ngOnInit():void{}
    
   deleteProduct(eid:any){
     this.productSer
     .deleteProductInfo(eid)
     .subscribe((result)=>(this.msg=result));
   }
  }
