import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-update-product',
  templateUrl: './update-product.component.html',
  styleUrls: ['./update-product.component.css']
})
export class UpdateProductComponent implements OnInit {
  public siteUrl=window.location.href;
  msg:string = '';
  constructor(public productSer:ProductService, private route: ActivatedRoute ) { }

  ngOnInit(): void {}
    UpdateProductInfo(productInfo:any){
      this.productSer
      .updateProductInfo(productInfo)
      .subscribe((data)=>(this.msg=data));
    }
    
    
  }




