import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ProductService } from '../product.service';
import { ProductItem } from '../productitem.model';

@Component({
  selector: 'app-product-name-desc',
  templateUrl: './product-name-desc.component.html',
  styleUrls: ['./product-name-desc.component.css']
})
export class ProductNameDescComponent implements OnInit {

  productInfo:Array<ProductItem>=[];
  
  constructor(public productSer:ProductService,public router:Router) { }

  ngOnInit(): void {
    this.productSer.getAllProductDetailsNameByDesc().subscribe(data=>this.productInfo=data);
  }

}
