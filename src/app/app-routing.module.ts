import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginauthComponent } from './loginauth/loginauth.component';
import { LoginComponent } from './login/login.component';
import { ShowbooksComponent } from './showbooks/showbooks.component';
import { AdminregComponent } from './adminreg/adminreg.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';

const routes: Routes = [
  {path:"",redirectTo:"login",pathMatch:"full"},
  {path:"books",component:ShowbooksComponent},
  {path:"register",component:LoginauthComponent},
  {path:"login",component:LoginComponent},
  {path:"adminregister",component:AdminregComponent},
  {path:"adminlogin",component:AdminloginComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
