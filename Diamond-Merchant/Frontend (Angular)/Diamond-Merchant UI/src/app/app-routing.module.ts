import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { StoreProductComponent } from '../app/store-product/store-product.component';
import { UpdateProductComponent } from '../app/update-product/update-product.component';
import { DeleteProductComponent } from '../app/delete-product/delete-product.component';
import { RetrieveProductComponent } from '../app/retrieve-product/retrieve-product.component';
import { RetrieveBillComponent } from '../app/retrieve-bill/retrieve-bill.component';
import { DeleteBillComponent } from './delete-bill/delete-bill.component';
import { StoreBillComponent } from './store-bill/store-bill.component';
import { UpdateBillComponent } from './update-bill/update-bill.component';
import { StoreStoreComponent } from './store-store/store-store.component';
import { DeleteStoreComponent } from './delete-store/delete-store.component';
import { UpdateStoreComponent } from './update-store/update-store.component';
import { RetrieveStoreComponent } from './retrieve-store/retrieve-store.component';
import { HeaderComponent } from './header/header.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { StoreOrdersComponent } from './store-orders/store-orders.component';
import { DeleteOrdersComponent } from './delete-orders/delete-orders.component';
import { UpdateOrdersComponent } from './update-orders/update-orders.component';
import { RetrieveOrdersComponent } from './retrieve-orders/retrieve-orders.component';
import { StoreRetailerComponent } from './store-retailer/store-retailer.component';
import { DeleteRetailerComponent } from './delete-retailer/delete-retailer.component';
import { UpdateRetailerComponent } from './update-retailer/update-retailer.component';
import { RetrieveRetailerComponent } from './retrieve-retailer/retrieve-retailer.component';
import { DeleteEmployeeComponent } from './delete-employee/delete-employee.component';
import { RetrieveEmployeeComponent } from './retrieve-employee/retrieve-employee.component';
import { StoreEmployeeComponent } from './store-employee/store-employee.component';
import { UpdateEmployeeComponent } from './update-employee/update-employee.component';
import { ManageBillComponent } from './manage-bill/manage-bill.component';
import { ManageRetailersComponent } from './manage-retailers/manage-retailers.component';
import { ManageStoreComponent } from './manage-store/manage-store.component';
import { ManageProductsComponent } from './manage-products/manage-products.component';
import { ManageOrdersComponent } from './manage-orders/manage-orders.component';
import { ManageEmployeesComponent } from './manage-employees/manage-employees.component';
import { ProductPageComponent } from './product-page/product-page.component';
import { LoginComponent } from '../app/login/login.component';
import { CustomerRetrieveComponent } from '../app/customer-retrieve/customer-retrieve.component';
import { SignupComponent } from '../app/signup/signup.component';
import { CustomerHomePageComponent } from './customer-home-page/customer-home-page.component';
import { MyGuards } from './app.guard';
import { ProductMfgAscComponent } from './product-mfg-asc/product-mfg-asc.component';
import { ProductMfgDescComponent } from './product-mfg-desc/product-mfg-desc.component';
import { ProductPriceAscComponent } from './product-price-asc/product-price-asc.component';
import { ProductPriceDescComponent } from './product-price-desc/product-price-desc.component';
import { RetrieveProductCategoryBraceletComponent } from './retrieve-product-category-bracelet/retrieve-product-category-bracelet.component';
import { RetrieveProductCategoryNecklaceComponent } from './retrieve-product-category-necklace/retrieve-product-category-necklace.component';
import { RetrieveProductCategoryRingComponent } from './retrieve-product-category-ring/retrieve-product-category-ring.component';
import { ProductNameAscComponent } from './product-name-asc/product-name-asc.component';
import { ProductNameDescComponent } from './product-name-desc/product-name-desc.component';
const routes: Routes = [
  { path: 'Header', component: HeaderComponent },
  { path: 'StoreProduct', component: StoreProductComponent },
  { path: 'UpdateProduct', component: UpdateProductComponent },
  { path: 'DeleteProduct', component: DeleteProductComponent },
  {
    path: 'RetrieveProduct',
    component: RetrieveProductComponent,
    canActivate: [MyGuards],
  },
  { path: 'Dashoboard', component: DashboardComponent },
  { path: 'RetrieveBill', component: RetrieveBillComponent },
  { path: 'StoreBill', component: StoreBillComponent },
  { path: 'DeleteBill', component: DeleteBillComponent },
  { path: 'UpdateBill', component: UpdateBillComponent },
  { path: 'RetrieveStore', component: RetrieveStoreComponent },
  { path: 'StoreStore', component: StoreStoreComponent },
  { path: 'DeleteStore', component: DeleteStoreComponent },
  { path: 'UpdateStore', component: UpdateStoreComponent },
  { path: 'RetrieveOrders', component: RetrieveOrdersComponent },
  { path: 'UpdateOrders', component: UpdateOrdersComponent },
  { path: 'StoreOrders', component: StoreOrdersComponent },
  { path: 'DeleteOrders', component: DeleteOrdersComponent },
  { path: 'UpdateOrders', component: UpdateOrdersComponent },
  { path: 'StoreOrders', component: StoreOrdersComponent },
  { path: 'DeleteOrders', component: DeleteOrdersComponent },
  { path: 'RetrieveEmployee', component: RetrieveEmployeeComponent },
  { path: 'UpdateEmployee', component: UpdateEmployeeComponent },
  { path: 'StoreEmployee', component: StoreEmployeeComponent },
  { path: 'DeleteEmployee', component: DeleteEmployeeComponent },
  { path: 'RetrieveRetailer', component: RetrieveRetailerComponent },
  { path: 'UpdateRetailer', component: UpdateRetailerComponent },
  { path: 'StoreRetailer', component: StoreRetailerComponent },
  { path: 'DeleteRetailer', component: DeleteRetailerComponent },
  { path: 'ManageBill', component: ManageBillComponent },
  { path: 'ManageRetailers', component: ManageRetailersComponent },
  { path: 'ManageStore', component: ManageStoreComponent },
  { path: 'AdminDashboard', component: DashboardComponent },
  { path: 'ManageProduct', component: ManageProductsComponent },
  { path: 'ManageOrder', component: ManageOrdersComponent },
  { path: 'ManageEmployee', component: ManageEmployeesComponent },
  { path: 'ProductPage', component: ProductPageComponent },
  { path: 'home', component: CustomerHomePageComponent },
  { path: 'login', component: LoginComponent },
  { path: 'signup', component: SignupComponent },
  { path: 'ProductMfgAsc', component: ProductMfgAscComponent },
  { path: 'ProductMfgDesc', component: ProductMfgDescComponent },
  { path: 'allRings', component: RetrieveProductCategoryRingComponent },
  { path: 'allBracelet', component: RetrieveProductCategoryBraceletComponent },
  { path: 'allNecklace', component: RetrieveProductCategoryNecklaceComponent },
  { path: 'allproductspricebyasc', component: ProductPriceAscComponent },
  { path: 'allproductspricebydesc', component: ProductPriceDescComponent },
  { path: 'allproductsnameasc', component: ProductNameAscComponent },
  { path: 'allproductsnamedesc', component: ProductNameDescComponent },
  { path: '', redirectTo: 'home', pathMatch: 'prefix' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
