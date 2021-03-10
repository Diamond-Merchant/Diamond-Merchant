import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-update-product',
  templateUrl: './update-product.component.html',
  styleUrls: ['./update-product.component.css']
})
export class UpdateProductComponent implements OnInit {
  
  msg:string = '';
  constructor(public productSer:ProductService) { }

  ngOnInit(): void {}
    UpdateProductInfo(productInfo:any){
      this.productSer
      .updateProductInfo(productInfo)
      .subscribe((data)=>(this.msg=data));
    }
  }




