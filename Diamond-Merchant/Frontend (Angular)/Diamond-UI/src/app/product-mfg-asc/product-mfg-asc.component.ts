import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ProductService } from '../product.service';
import { ProductItem } from '../productitem.model';

@Component({
  selector: 'app-product-mfg-asc',
  templateUrl: './product-mfg-asc.component.html',
  styleUrls: ['./product-mfg-asc.component.css']
})
export class ProductMfgAscComponent implements OnInit {

  productInfo:Array<ProductItem>=[];
  
  constructor(public productSer:ProductService,public router:Router) { }

  ngOnInit(): void {
    this.productSer.getAllProductDetailsPMFGByAsc().subscribe(data=>this.productInfo=data);
  }

}
