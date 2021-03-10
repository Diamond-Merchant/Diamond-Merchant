import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RetrieveProductComponent } from './retrieve-product/retrieve-product.component';



const routes: Routes = [
  {path:"\allproducts",component:RetrieveProductComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
