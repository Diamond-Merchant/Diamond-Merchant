import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-update-employee',
  templateUrl: './update-employee.component.html',
  styleUrls: ['./update-employee.component.css']
})
export class UpdateEmployeeComponent implements OnInit {

  msg:string = '';
  constructor(public employeeSer:EmployeeService) { }

  ngOnInit(): void {}
    UpdateEmployeeInfo(employeeInfo:any){
      this.employeeSer
      .updateEmployeeInfo(employeeInfo)
      .subscribe((data)=>(this.msg=data));
    }
  }


