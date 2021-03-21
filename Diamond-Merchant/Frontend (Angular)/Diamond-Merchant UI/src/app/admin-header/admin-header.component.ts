import { Component, OnInit } from '@angular/core';
import { LoginService } from '../login.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin-header',
  templateUrl: './admin-header.component.html',
  styleUrls: ['./admin-header.component.css'],
})
export class AdminHeaderComponent implements OnInit {
  constructor(public store: LoginService, public router: Router) {}

  ngOnInit(): void {}
  exit() {
    window.location.reload();
  }
  login() {}
  logout() {
    sessionStorage.removeItem('cemail');
    this.store.setLoginStatus(0);
    this.router.navigate(['home']);
  }
}
