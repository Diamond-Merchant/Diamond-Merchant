import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { ProductItem } from "./productitem.model";

@Injectable({
    providedIn: 'root'
  })

  export class ProductService {
  
    constructor(public httpClient:HttpClient) { }
  
    getProductData(): Observable<ProductItem[]>{
      return this.httpClient.get<ProductItem[]>("http://localhost:8090/product/getProductData")
    }

    getProductDataById(pid:any):Observable<ProductItem[]>{
      return this.httpClient.get<ProductItem[]>("http://localhost:8090/product/findProductById/"+pid);
    }
  
    storeProductData(prodRef:any):Observable<string>{
      return this.httpClient.post("http://localhost:8090/product/storeProductData",prodRef,{responseType:'text'})
    }
     
    updateProductData(prodRef:any ):Observable<string>{
      return this.httpClient.put("http://localhost:8090/product/updateProductData",prodRef,{responseType:'text'});
    }
     
    deleteProductData(pid:any):Observable<string>{
     return this.httpClient.delete("http://localhost:8090/product/updateProductData/"+pid,{responseType:'text'})
    }
     
  }