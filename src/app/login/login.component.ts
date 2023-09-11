import { Component } from '@angular/core';
import { AppService } from '../app.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  constructor(private appService:AppService,
    private router: Router){}
    private authToken: string | null = null;
         
    setAuthToken(token: string) {
      this.authToken = token;
    }

    isCustomerValid(): boolean {
      return this.authToken !== null;
    }


  onLogin(txt1: string, txt2: string){
    
    this.appService.onLoginService(txt1, txt2).subscribe((response)=>{
      if(response){
        alert("Login Successfull")
        this.router.navigate(['books']);
        this.setAuthToken("kiran");
        console.log(this.isCustomerValid);
      }
      else{
        alert("Invalid Enail or Password")
      }
    },
    (error)=>{
      console.log(error)
    })
  }

  goToReg(){
    this.router.navigate(['register']);
  }
}
