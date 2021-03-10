import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
//import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import {NgbModal} from '@ng-bootstrap/ng-bootstrap';
import { AppRoutingModule } from './app-routing.module';
import { ReactiveFormsModule} from '@angular/forms';
import { AppComponent } from './app.component';
import { StoreStoreComponent } from './store-store/store-store.component';
import { DeleteStoreComponent } from './delete-store/delete-store.component';
import { UpdateStoreComponent } from './update-store/update-store.component';
import { RetrieveStoreComponent } from './retrieve-store/retrieve-store.component';
import { StoreOrdersComponent } from './store-orders/store-orders.component';
import { DeleteOrdersComponent } from './delete-orders/delete-orders.component';
import { UpdateOrdersComponent } from './update-orders/update-orders.component';
import { RetrieveOrdersComponent } from './retrieve-orders/retrieve-orders.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { FormControl} from '@angular/forms';
import { StoreRetailerComponent } from './store-retailer/store-retailer.component';
import { DeleteRetailerComponent } from './delete-retailer/delete-retailer.component';
import { UpdateRetailerComponent } from './update-retailer/update-retailer.component';
import { RetrieveRetailerComponent } from './retrieve-retailer/retrieve-retailer.component';
import { DeleteEmployeeComponent } from './delete-employee/delete-employee.component';
import { RetrieveEmployeeComponent } from './retrieve-employee/retrieve-employee.component';
import { StoreEmployeeComponent } from './store-employee/store-employee.component';
import { UpdateEmployeeComponent } from './update-employee/update-employee.component';
import { DeleteBillComponent } from './delete-bill/delete-bill.component';
import { StoreBillComponent } from './store-bill/store-bill.component';
import { UpdateBillComponent } from './update-bill/update-bill.component';
import { RetrieveBillComponent } from './retrieve-bill/retrieve-bill.component';
import { DeleteProductComponent } from './delete-product/delete-product.component';
import { UpdateProductComponent } from './update-product/update-product.component';
import { StoreProductComponent } from './store-product/store-product.component';
import { RetrieveProductComponent } from './retrieve-product/retrieve-product.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { HeaderDashboardComponent } from './header-dashboard/header-dashboard.component';
import { FooterDashboardComponent } from './footer-dashboard/footer-dashboard.component';
@NgModule({
  declarations: [
    AppComponent,
    StoreStoreComponent,
    DeleteStoreComponent,
    UpdateStoreComponent,
    RetrieveStoreComponent,
    StoreOrdersComponent,
    DeleteOrdersComponent,
    UpdateOrdersComponent,
    RetrieveOrdersComponent,
    StoreRetailerComponent,
    DeleteRetailerComponent,
    UpdateRetailerComponent,
    RetrieveRetailerComponent,
    DeleteEmployeeComponent,
    RetrieveEmployeeComponent,
    StoreEmployeeComponent,
    UpdateEmployeeComponent,
    DeleteBillComponent,
    StoreBillComponent,
    UpdateBillComponent,
    RetrieveBillComponent,
    DeleteProductComponent,
    UpdateProductComponent,
    StoreProductComponent,
    RetrieveProductComponent,
    HeaderComponent,
    FooterComponent,
    DashboardComponent,
    HeaderDashboardComponent,
    FooterDashboardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
