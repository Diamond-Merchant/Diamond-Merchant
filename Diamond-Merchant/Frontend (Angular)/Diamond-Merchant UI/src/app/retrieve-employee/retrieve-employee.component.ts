import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';
import {Employee} from '../employee.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-retrieve-employee',
  templateUrl: './retrieve-employee.component.html',
  styleUrls: ['./retrieve-employee.component.css']
})
export class RetrieveEmployeeComponent implements OnInit {

  employeeInfo:Array<Employee>=[];
  flag:boolean = false;
  route: any;
 
  
  constructor(public employeeSer:EmployeeService,public router:Router) { }

  ngOnInit() {
 
    this.employeeSer.loadEmployeeDetails().subscribe(data=>{this.employeeInfo=data;
    });
    
    }
    btnClick () {
      this.router.navigateByUrl('/StoreEmployee');
   }
  
    btnUpdate(){
      this.router.navigateByUrl('/UpdateEmployee');
    }
  
    btnDelete(){
      this.router.navigateByUrl('/DeleteEmployee');
    }
    
   
  }

