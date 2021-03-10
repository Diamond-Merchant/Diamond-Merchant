import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ProductService } from '../product.service';
import { ProductItem } from '../productitem.model';

@Component({
  selector: 'app-retrieve-product',
  templateUrl: './retrieve-product.component.html',
  styleUrls: ['./retrieve-product.component.css']
})
export class RetrieveProductComponent implements OnInit {

  productInfo:Array<ProductItem>=[];

  constructor(public router:Router,public productSer:ProductService) { }

  ngOnInit(): void {
    this.productSer.getProductData().subscribe(data=>this.productInfo=data);
  }

}
