import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product} from './product.model';

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
}

