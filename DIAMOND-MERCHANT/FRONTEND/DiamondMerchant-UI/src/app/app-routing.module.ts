import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { StoreProductComponent } from '../app/store-product/store-product.component';
import { UpdateProductComponent} from '../app/update-product/update-product.component';
import { DeleteProductComponent} from '../app/delete-product/delete-product.component';
import { RetrieveProductComponent } from '../app/retrieve-product/retrieve-product.component';
import { RetrieveBillComponent} from '../app/retrieve-bill/retrieve-bill.component';
import { DeleteBillComponent } from './delete-bill/delete-bill.component';
import { StoreBillComponent } from './store-bill/store-bill.component';
import { UpdateBillComponent } from './update-bill/update-bill.component';
import { StoreStoreComponent } from './store-store/store-store.component';
import { DeleteStoreComponent } from './delete-store/delete-store.component';
import { UpdateStoreComponent } from './update-store/update-store.component';
import { RetrieveStoreComponent } from './retrieve-store/retrieve-store.component';
import { HeaderComponent} from './header/header.component';
import { FooterComponent} from './footer/footer.component';
import { DashboardComponent} from './dashboard/dashboard.component';
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

const routes: Routes = [
  {path:"\Header",component:HeaderComponent},
  {path:"\Footer",component:FooterComponent},
  {path:"\StoreProduct",component:StoreProductComponent},
  {path:"\UpdateProduct",component:UpdateProductComponent},
  {path:"\DeleteProduct",component:DeleteProductComponent},
  {path:"\RetrieveProduct",component:RetrieveProductComponent},
  {path:"\Dashoboard",component:DashboardComponent},
  {path:"\RetrieveBill",component:RetrieveBillComponent},
  {path:"\StoreBill",component:StoreBillComponent},
  {path:"\DeleteBill",component:DeleteBillComponent},
  {path:"\UpdateBill",component:UpdateBillComponent},
  {path:"\RetrieveStore",component:RetrieveStoreComponent},
  {path:"\StoreStore",component:StoreStoreComponent},
  {path:"\DeleteStore",component:DeleteStoreComponent},
  {path:"\UpdateStore",component:UpdateStoreComponent},
  {path:"\RetrieveOrders",component:RetrieveOrdersComponent},
  {path:"\UpdateOrders",component:UpdateOrdersComponent},
  {path:"\StoreOrders",component:StoreOrdersComponent},
  {path:"\DeleteOrders",component:DeleteOrdersComponent},
  {path:"\UpdateOrders",component:UpdateOrdersComponent},
  {path:"\StoreOrders",component:StoreOrdersComponent},
  {path:"\DeleteOrders",component:DeleteOrdersComponent},
  {path:"\RetrieveEmployee",component:RetrieveEmployeeComponent},
  {path:"\UpdateEmployee",component:UpdateEmployeeComponent},
  {path:"\StoreEmployee",component:StoreEmployeeComponent},
  {path:"\DeleteEmployee",component:DeleteEmployeeComponent},
  {path:"\RetrieveRetailer",component:RetrieveRetailerComponent},
  {path:"\UpdateRetailer",component:UpdateRetailerComponent},
  {path:"\StoreRetailer",component:StoreRetailerComponent},
  {path:"\DeleteRetailer",component:DeleteRetailerComponent}

  


  
  //{path:"\aboutus",component:AboutusComponent},
 // {path:"\contactus",component:ContactusComponent},
  //{path:"\home",component:DashboardComponent, canActivate:[MyGuards],children:[
    //{path:"\a",component:AComponent},
    //{path:"\b",component:BComponent},
    //{path:"\c",component:CComponent},
//]},
//  {path:"",redirectTo:"\login",pathMatch:"prefix"},
//  {path:"**",component:NotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
 