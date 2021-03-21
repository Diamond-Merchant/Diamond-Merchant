import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ProductService } from '../product.service';
import { ProductItem } from '../productitem.model';

@Component({
  selector: 'app-product-name-asc',
  templateUrl: './product-name-asc.component.html',
  styleUrls: ['./product-name-asc.component.css']
})
export class ProductNameAscComponent implements OnInit {

  productInfo:Array<ProductItem>=[];
  
  constructor(public productSer:ProductService,public router:Router) { }

  ngOnInit(): void {
    this.productSer.getAllProductDetailsNameByAsc().subscribe(data=>this.productInfo=data);
  }

}
