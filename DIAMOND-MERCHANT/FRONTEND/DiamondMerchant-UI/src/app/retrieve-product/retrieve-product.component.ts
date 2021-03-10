import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import {Product} from '../product.model';


@Component({
  selector: 'app-retrieve-product',
  templateUrl: './retrieve-product.component.html',
  styleUrls: ['./retrieve-product.component.css']
})

  export class RetrieveProductComponent implements OnInit {

    productInfo:Array<Product>=[];
    flag:boolean = false;
   
    
    constructor(public productSer:ProductService) { }
  
    ngOnInit(): void {
      
    }
    loadData(){
      this.flag=true;
      this.productSer.loadProductDetails().subscribe(data=>this.productInfo=data);
      }
    
  }
  
