import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
userName:string="";
  constructor(public router:Router) { }

  ngOnInit(): void {
    let obj=sessionStorage.getItem("cemail");
    if(obj!=null){
      this.userName=obj;
    }
  }
  logout()
{
  sessionStorage.removeItem("name");
  this.router.navigate(["login"]); 
}
}