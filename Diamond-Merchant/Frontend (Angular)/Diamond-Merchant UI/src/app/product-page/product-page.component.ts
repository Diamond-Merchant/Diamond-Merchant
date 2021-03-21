import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { Pipe, PipeTransform } from '@angular/core';
import { Product } from '../product.model';
import { Router} from '@angular/router';
import { ProductItem } from '../productitem.model';

@Component({
  selector: 'app-product-page',
  templateUrl: './product-page.component.html',
  styleUrls: ['./product-page.component.css']
})
export class ProductPageComponent implements OnInit {
  productInfo:Array<Product>=[];
  flag:boolean = false;
  constructor(public productSer:ProductService,public router:Router) { }

  ngOnInit(): void {
    this.flag=true;
    this.productSer.loadProductDetails().subscribe(data=>this.productInfo=data);
  }
  searchText:string="";
}