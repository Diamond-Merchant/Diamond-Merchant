import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-delete-employee',
  templateUrl: './delete-employee.component.html',
  styleUrls: ['./delete-employee.component.css']
})
export class DeleteEmployeeComponent implements OnInit {

  
  constructor(public employeeSer:EmployeeService) { }
  msg:string ='';
  ngOnInit():void{}
  
 deleteEmployee(eid:any){
   this.employeeSer
   .deleteEmployeeInfo(eid)
   .subscribe((result)=>(this.msg=result));
 }
}