import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { FormGroup, FormControl } from '@angular/forms';
import { Router } from '@angular/router';

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
      constructor(public productSer: ProductService, public router: Router) { }
    
      
      ngOnInit(): void {}
      storeProductDetails() {
        let productRef = this.productInfo.value;
        this.productSer
          .storeProductDetails(productRef)
          .subscribe((result) => (this.msg = result));
          if (this.msg=="Product Record Updated Successfully"){
            this.router.navigate(['/RetrieveProduct']);
          }
      }
     
     }
    