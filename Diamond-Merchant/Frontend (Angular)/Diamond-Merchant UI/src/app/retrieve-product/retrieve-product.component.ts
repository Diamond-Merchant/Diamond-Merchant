import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import {Product} from '../product.model';
import { Router } from '@angular/router';


@Component({
  selector: 'app-retrieve-product',
  templateUrl: './retrieve-product.component.html',
  styleUrls: ['./retrieve-product.component.css']
})

  export class RetrieveProductComponent implements OnInit {

    productInfo:Array<Product>=[];
    flag:boolean = false;
    route: any;

    toggleSidebar(){ }
   
    
    constructor(public productSer:ProductService, public router:Router) { }
  
   ngOnInit() {
 
    this.productSer.loadProductDetails().subscribe(data=>{this.productInfo=data;
    });
    
    }
    btnClick() {
      this.router.navigateByUrl('/StoreProduct');
   }

    btnUpdate(){
      this.router.navigateByUrl('/UpdateProduct');
    }

    btnDelete(){
      this.router.navigateByUrl('/DeleteProduct');
    }
  
  }