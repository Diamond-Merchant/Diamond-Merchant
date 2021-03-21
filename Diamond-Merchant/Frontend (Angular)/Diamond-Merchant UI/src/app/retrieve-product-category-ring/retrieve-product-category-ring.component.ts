import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ProductService } from '../product.service';
import { ProductItem } from "../productitem.model";

@Component({
  selector: 'app-retrieve-product-category-ring',
  templateUrl: './retrieve-product-category-ring.component.html',
  styleUrls: ['./retrieve-product-category-ring.component.css']
})
export class RetrieveProductCategoryRingComponent implements OnInit {

  productInfo:Array<ProductItem>=[];

  constructor(public router:Router,public productSer:ProductService) { }

  ngOnInit(): void {
    this.productSer.getAllProductCategoryByRing().subscribe((data)=> (this.productInfo=data));
  }

}
