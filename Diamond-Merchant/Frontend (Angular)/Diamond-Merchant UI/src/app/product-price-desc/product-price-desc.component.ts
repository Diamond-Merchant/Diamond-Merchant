import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ProductService } from '../product.service';
import { ProductItem } from '../productitem.model';

@Component({
  selector: 'app-product-price-desc',
  templateUrl: './product-price-desc.component.html',
  styleUrls: ['./product-price-desc.component.css']
})
export class ProductPriceDescComponent implements OnInit {

  productInfo:Array<ProductItem>=[];

  constructor(public productSer:ProductService,public router:Router) { }

  ngOnInit(): void {
    this.productSer.getAllProductDetailsPriceByDesc().subscribe(data=>this.productInfo=data);
  }

}
