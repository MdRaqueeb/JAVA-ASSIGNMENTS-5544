import { Component } from '@angular/core';
import { AppService } from '../app.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-adminreg',
  templateUrl: './adminreg.component.html',
  styleUrls: ['./adminreg.component.css']
})
export class AdminregComponent 
{
  constructor (private appService:AppService,
    private router:Router) {}
   onsubmit(txt1:string,txt2:string,txt3:string,txt4:string)
   {

     this.appService.adminOnsubmitService(txt1,txt2,txt3,parseInt(txt4)).subscribe((response)=>{
      
      console.log(response)
      alert("Successfully Registered as Admin")
       this.router.navigate(['adminlogin'])

     },

     (error)=>{
      console.log(error)
      alert("User already Exist")
     })
   }

}
