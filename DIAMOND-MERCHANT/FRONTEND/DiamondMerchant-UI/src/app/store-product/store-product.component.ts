import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-store-product',
  templateUrl: './store-product.component.html',
  styleUrls: ['./store-product.component.css',]
  
})

  export class StoreProductComponent implements OnInit {
    productInfo = new FormGroup({
        pid: new FormControl(),
        pname: new FormControl(),
        shelflocation:new FormControl(),
        costprice: new FormControl(),
        mrp: new FormControl(),
        manufacturer: new FormControl(),
      });
    
      msg:string='';
      constructor(public productSer: ProductService) { }
    
      
      ngOnInit(): void {}
      storeProductDetails() {
        let productRef = this.productInfo.value;
        this.productSer
          .storeProductDetails(productRef)
          .subscribe((result) => (this.msg = result));
      }
      }
    