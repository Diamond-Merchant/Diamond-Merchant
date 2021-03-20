import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ProductService } from '../product.service';
import { ProductItem } from '../productitem.model';

@Component({
  selector: 'app-retrieve-product-category-bracelet',
  templateUrl: './retrieve-product-category-bracelet.component.html',
  styleUrls: ['./retrieve-product-category-bracelet.component.css']
})
export class RetrieveProductCategoryBraceletComponent implements OnInit {

  productInfo:Array<ProductItem>=[];

  constructor(public router:Router,public productSer:ProductService) { }

  ngOnInit(): void {
    this.productSer.getAllProductCategoryByBracelet().subscribe((data)=> (this.productInfo=data) );
  }
  searchText:string="";
}
