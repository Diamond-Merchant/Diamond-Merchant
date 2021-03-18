import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Customer } from '../customer.model';
import { FormControl, FormGroup } from '@angular/forms';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})
export class LoginComponent implements OnInit {
  msg: string = 'Login Successfull';
  customer = new Customer();
  customer1=new Customer();

  /*customerRef = new FormGroup({
    cemail: new FormControl(),
    password: new FormControl(),
  });*/

  constructor(
    public router: Router,
    public customerService: CustomerService,
    public router1: Router
  ) {} //DI for Router which help to do routing programmatially

  onclickregister(){
    this.router.navigate(['register'])
  }

  register()
  {
    this.router.navigate(["register"]);
  }

  ngOnInit(): void {}

  /* checkUser() {
    let loginRef = this.customerRef.value;
    let user = loginRef.cemail;

    this.customerService.loginCheck(loginRef).subscribe((data) => {
      if (loginRef.cemail == 'admin' && loginRef.password == 'admin') {
        console.log('Successfully admin Login');
        sessionStorage.setItem('cemail',user);

        this.router.navigate(['AdminDashboard']);
      } else if (data == 'Success') {
        console.log('Successfully Login');
        sessionStorage.setItem('customerId', loginRef.cemail);
        this.router.navigate(['home']);
      } else {
        console.log('Failure try once again');
        this.msg = 'UserName or password is wrong';
      }
    });
  } */

  loginUser(userData:any)
      {

        let user=userData.cemail;
        let pass=userData.password;
        // let desig=userData.desg;
        console.log(user+" "+pass);
         
       
        this.customer.cemail=user;
        this.customer.password=pass;
    
        this.customerService.checkLogin(this.customer).subscribe(obj=>{
          if (userData.cemail == 'admin' && userData.password == 'admin') {
          console.log('Successfully admin Login');
          sessionStorage.setItem('cemail',user);
          this.router.navigate(['AdminDashboard']);
        } 
         else if(obj==null)
          {
            console.log("wrong pass / username");
            console.log("customer");
          }
          else{
              console.log(obj);
              this.customer1=obj;
              sessionStorage.setItem("customer",JSON.stringify(obj));
              this.router.navigate(['home']);
            }
      
          
        })
      }
      
}
