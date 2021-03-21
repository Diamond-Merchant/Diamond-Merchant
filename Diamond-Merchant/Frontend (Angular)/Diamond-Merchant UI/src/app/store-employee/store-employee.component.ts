import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../employee.service';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-store-employee',
  templateUrl: './store-employee.component.html',
  styleUrls: ['./store-employee.component.css'],
})
export class StoreEmployeeComponent implements OnInit {
  employeeInfo = new FormGroup({
    eid: new FormControl(),
    sid: new FormControl(),
    ename: new FormControl(),
    email: new FormControl(),
    ephonenumber: new FormControl(),
    gender: new FormControl(),
    birthdate: new FormControl(),
    joiningdate: new FormControl(),
    designation: new FormControl(),
  });

  msg: string = '';
  constructor(public employeeSer: EmployeeService) {}

  ngOnInit(): void {}
  storeEmployeeDetails() {
    let employeeRef = this.employeeInfo.value;
    this.employeeSer
      .storeEmployeeDetails(employeeRef)
      .subscribe((result) => (this.msg = result));
  }
}
