import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';

@Injectable(

)
export class AppService {
 

  constructor(private httpClient:HttpClient){}

  
  public onsubmitService(txt1: string, txt2: string, txt3: string, txt4: number, txt5: string, txt6: string):Observable<any>{
    const url='http://localhost:8083/customer/signup';
    const data = {
      "customerName": txt1,
      "email": txt2,
      "password": txt3,
      "mobileNumber": txt4,
      "gender": txt5,
      "address": txt6
    };

    return this.httpClient.post(url,data);
  }


  public onLoginService(txt1: string, txt2: string):Observable<any> {
    const url='http://localhost:8083/customer/login';
    const data = {
      "email": txt1,
      "password": txt2,
      
    };

    return this.httpClient.post(url,data);
  }

  public adminOnsubmitService(txt1: string, txt2: string, txt3: string, txt4: number):Observable<any>{

    const url='http://localhost:8083/admin/signup';

    const data = {

      "adminName": txt1,
      "email": txt2,
      "password": txt3,
      "mobile": txt4,

    };
    return this.httpClient.post(url,data);

    }

    public adminOnLoginService(txt1:string,txt2:string):Observable<any>

    {
       const url='http://localhost:8083/admin/login';
       const data = 
       {
        "email": txt1,
        "password": txt2,

    };
    return this.httpClient.post(url,data);
}

}




