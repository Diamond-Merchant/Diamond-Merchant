import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { Product } from '../product.model';
import { Router} from '@angular/router';

@Component({
  selector: 'app-product-mfg-desc',
  templateUrl: './product-mfg-desc.component.html',
  styleUrls: ['./product-mfg-desc.component.css']
})
export class ProductMfgDescComponent implements OnInit {

  productInfo:Array<Product>=[];
  flag:boolean = false;
  constructor(public productSer:ProductService,public router:Router) { }

  ngOnInit(): void {
    this.productSer. getAllProductDetailsPMFGByDesc().subscribe(data=>this.productInfo=data);
  }
}