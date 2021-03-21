import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ProductService } from '../product.service';
import { ProductItem } from '../productitem.model';

@Component({
  selector: 'app-product-price-asc',
  templateUrl: './product-price-asc.component.html',
  styleUrls: ['./product-price-asc.component.css']
})
export class ProductPriceAscComponent implements OnInit {
  
  productInfo:Array<ProductItem>=[];
  
  constructor(public productSer:ProductService,public router:Router) { }

  ngOnInit(): void {
    this.productSer.getAllProductDetailsPriceByAsc().subscribe(data=>this.productInfo=data);
  }

}
