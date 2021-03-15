import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';
import {Employee} from '../employee.model';

@Component({
  selector: 'app-retrieve-employee',
  templateUrl: './retrieve-employee.component.html',
  styleUrls: ['./retrieve-employee.component.css']
})
export class RetrieveEmployeeComponent implements OnInit {

  employeeInfo:Array<Employee>=[];
  flag:boolean = false;
 
  
  constructor(public employeeSer:EmployeeService) { }

  ngOnInit(): void {
    
  }
  loadData(){
    this.flag=true;
    this.employeeSer.loadEmployeeDetails().subscribe(data=>this.employeeInfo=data);
    }
  
}

