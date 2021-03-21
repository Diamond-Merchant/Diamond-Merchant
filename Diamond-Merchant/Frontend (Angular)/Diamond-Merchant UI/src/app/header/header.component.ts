import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css'],
})
export class HeaderComponent implements OnInit {
  constructor(public store: LoginService, public router:Router) {}

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
