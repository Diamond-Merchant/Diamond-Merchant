import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import * as $ from 'jquery';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css'],
})
export class DashboardComponent implements OnInit {
  opened = false;
  constructor(public router: Router) {}
  ngOnInit() {
    //Toggle Click Function
    $('#menu-toggle').click(function (e) {
      e.preventDefault();
      $('#wrapper').toggleClass('toggled');
    });
  }
  logout() {
    sessionStorage.removeItem('name');
    this.router.navigate(['login']);
  }
}
