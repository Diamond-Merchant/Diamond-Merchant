import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ProductService } from '../product.service';
import { ProductItem } from '../productitem.model';

@Component({
  selector: 'app-retrieve-product-category-necklace',
  templateUrl: './retrieve-product-category-necklace.component.html',
  styleUrls: ['./retrieve-product-category-necklace.component.css']
})
export class RetrieveProductCategoryNecklaceComponent implements OnInit {

  productInfo:Array<ProductItem>=[];

  constructor(public router:Router,public productSer:ProductService) { }

  ngOnInit(): void {
    this.productSer.getAllProductCategoryByNecklace().subscribe((data)=> (this.productInfo=data) );
  }

}
