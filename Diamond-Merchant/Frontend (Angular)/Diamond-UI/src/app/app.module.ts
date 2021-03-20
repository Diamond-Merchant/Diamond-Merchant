import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
//import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
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
import { DashboardComponent } from './dashboard/dashboard.component';
import { CustomerUpdateComponent } from './customer-update/customer-update.component';
import { CustomerDeleteComponent } from './customer-delete/customer-delete.component';
import { CustomerRetrieveComponent } from './customer-retrieve/customer-retrieve.component';
import { CustomerStoreComponent } from './customer-store/customer-store.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { CustomerHomePageComponent } from './customer-home-page/customer-home-page.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { ProductPageComponent } from './product-page/product-page.component';
import {ProductMfgAscComponent} from './product-mfg-asc/product-mfg-asc.component';
import { MyGuards } from './app.guard';
import { ProductMfgDescComponent } from './product-mfg-desc/product-mfg-desc.component';
import { ProductNameAscComponent } from './product-name-asc/product-name-asc.component';
import { ProductNameDescComponent} from './product-name-desc/product-name-desc.component';
import { ProductPriceAscComponent } from './product-price-asc/product-price-asc.component';
import { ProductPriceDescComponent} from './product-price-desc/product-price-desc.component';
import { RetrieveProductCategoryBraceletComponent} from './retrieve-product-category-bracelet/retrieve-product-category-bracelet.component';
import { RetrieveProductCategoryNecklaceComponent} from './retrieve-product-category-necklace/retrieve-product-category-necklace.component';
import { RetrieveProductCategoryRingComponent} from './retrieve-product-category-ring/retrieve-product-category-ring.component';
import { CustomerNavbarComponent } from './customer-navbar/customer-navbar.component';
import { RetailerPageComponent } from './retailer-page/retailer-page.component';
import { FilterPipe } from './filter.pipe';
import { SidebarModule} from 'ng-sidebar';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ManageBillComponent} from './manage-bill/manage-bill.component';
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
    DashboardComponent,
    CustomerUpdateComponent,
    CustomerDeleteComponent,
    CustomerRetrieveComponent,
    CustomerStoreComponent,
    LoginComponent,
    SignupComponent,
    CustomerHomePageComponent,
    HeaderComponent,
    FooterComponent,
    ProductPageComponent,
    ProductMfgAscComponent,
    ProductMfgDescComponent,
    ProductNameAscComponent,
    ProductNameDescComponent,
    ProductPriceAscComponent,
    ProductPriceDescComponent,
    RetrieveProductCategoryBraceletComponent,
    RetrieveProductCategoryNecklaceComponent,
    RetrieveProductCategoryRingComponent,
    CustomerNavbarComponent,
    RetailerPageComponent,
    FilterPipe,
    ManageBillComponent
    
    
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    SidebarModule,
    BrowserAnimationsModule,
    
  ],
  providers: [MyGuards],
  bootstrap: [AppComponent]
})
export class AppModule { }
