import {Injectable} from '@angular/core';
import {CanActivate,Router}from "@angular/router";

@Injectable()
export class MyGuards implements CanActivate{
    constructor(public router:Router){}

    canActivate(){
    let obj=sessionStorage.getItem("cemail" );
    if(obj==null){
        
        this.router.navigate(["login"]);
                return false;
    }else{
        // this.router.navigate(["home"]);
        return true;
    }
    }

}