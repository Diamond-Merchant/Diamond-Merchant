import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from '../app/login/login.component';
import { SignupComponent } from '../app/signup/signup.component';
import { CustomerHomePageComponent } from './customer-home-page/customer-home-page.component';

const routes: Routes = [
  { path: 'home', component: CustomerHomePageComponent },
  { path: 'login', component: LoginComponent },
  { path: 'signup', component: SignupComponent },

  { path: '', redirectTo: 'home', pathMatch: 'prefix' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}