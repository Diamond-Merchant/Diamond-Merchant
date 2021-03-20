import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {MatSidenavModule} from '@angular/material/sidenav';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
@NgModule({
   declarations: [
    
   ],
   imports: [
      BrowserModule,
      BrowserAnimationsModule,
      MatSidenavModule,
      FormsModule,
      ReactiveFormsModule
   ],
   providers: [],
   bootstrap: []
})
export class AppModule { }