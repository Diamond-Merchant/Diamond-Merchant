import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product} from './product.model';

import { ProductItem } from "./productitem.model";

@Injectable({
  providedIn: 'root'
})
export class ProductService {
 
  constructor(public httpClient:HttpClient) { }

  loadProductDetails(): Observable<Product[]>{
    return this.httpClient.get<Product[]>("http://localhost:8090/product/getProductData")
  }
 
 
 
  storeProductDetails(productRef:any):Observable<string>{
    return this.httpClient.post('http://localhost:8090/product/storeProductData',
    productRef,
    {responseType:'text'}
    );
  }
 
  updateProductInfo(pid:any): Observable<string>{
    return this.httpClient.put('http://localhost:8090/product/updateProductData' ,pid,
    {responseType:'text'}
      );
   }

   deleteProductInfo(pid:any):Observable<string>{
     return this.httpClient.delete('http://localhost:8090/product/deleteProductData/'
     +pid,
      {responseType:'text'}
     );
   }

   getAllProductDetailsPriceByAsc():Observable<ProductItem[]>{
    return this.httpClient.get<ProductItem[]>("http://localhost:8090/product/productAscByPrice")
  }

  getAllProductDetailsPriceByDesc():Observable<ProductItem[]>{
    return this.httpClient.get<ProductItem[]>("http://localhost:8090/product/productDescByPrice")
  }

  getAllProductDetailsNameByAsc():Observable<ProductItem[]>{
    return this.httpClient.get<ProductItem[]>("http://localhost:8090/product/productAscByPName")
  }

  getAllProductDetailsNameByDesc():Observable<ProductItem[]>{
    return this.httpClient.get<ProductItem[]>("http://localhost:8090/product/productDescByPName")
  }

  getAllProductDetailsPMFGByAsc():Observable<ProductItem[]>{
    return this.httpClient.get<ProductItem[]>("http://localhost:8090/product/productAscByPMFG")
  }

  getAllProductDetailsPMFGByDesc():Observable<ProductItem[]>{
    return this.httpClient.get<ProductItem[]>("http://localhost:8090/product/productDescByPMFG")
  }

  getAllProductCategoryByRing(): Observable<ProductItem[]>{
    return this.httpClient.get<ProductItem[]>("http://localhost:8090/product/productCategoryByRing")
  }

  getAllProductCategoryByBracelet(): Observable<ProductItem[]>{
    return this.httpClient.get<ProductItem[]>("http://localhost:8090/product/productCategoryByBracelet")
  }

  getAllProductCategoryByNecklace(): Observable<ProductItem[]>{
    return this.httpClient.get<ProductItem[]>("http://localhost:8090/product/productCategoryByNecklace")
  }

}

