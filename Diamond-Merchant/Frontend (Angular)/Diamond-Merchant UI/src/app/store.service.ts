import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Store } from './store.model';

@Injectable({
  providedIn: 'root',
})
export class StoreService {
  constructor(public httpClient: HttpClient) {}

  loadStoreDetails(): Observable<Store[]> {
    return this.httpClient.get<Store[]>(
      'http://localhost:8090/store/allStoreData'
    );
  }

  storeStoreDetails(storeRef: any): Observable<string> {
    return this.httpClient.post(
      'http://localhost:8090/store/storeStoreData',
      storeRef,
      { responseType: 'text' }
    );
  }

  updateStoreInfo(storeid: any): Observable<string> {
    return this.httpClient.put(
      'http://localhost:8090/store/updateStoreData',
      storeid,
      { responseType: 'text' }
    );
  }

  deleteStoreInfo(storeid: any): Observable<string> {
    return this.httpClient.delete(
      'http://localhost:8090/store/deleteStoreData/' + storeid,
      { responseType: 'text' }
    );
  }
}
