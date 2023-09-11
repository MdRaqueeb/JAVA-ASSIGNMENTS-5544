import { Component } from '@angular/core';
import { OnInit } from '@angular/core';
import { AppService } from '../app.service';
import { ShowbooksService } from '../showbooks.service'; 
import { LoginComponent } from '../login/login.component';
import { Router } from '@angular/router';
@Component({
  selector: 'app-showbooks',
  templateUrl: './showbooks.component.html',
  styleUrls: ['./showbooks.component.css']
})
export class ShowbooksComponent implements OnInit
{
  books:any[]=[];

  constructor(private showbookservice : ShowbooksService,private log:LoginComponent,private router:Router){}

  ngOnInit(): void
    {
        this.showbookservice.getAllbookDetails('').subscribe((data)=> this.books = data);
        console.log(this.books)
    }

    showBooksByTitle(title:string){

      const url='/search/'+title;
      this.showbookservice.getAllbookDetails(url).subscribe((data)=> this.books = data);
    }


     addTocart(id:number,price:number){
      this.showbookservice.addToCart(id,price).subscribe((response)=>console.log(response),
      (error)=>console.log(error));

      console.log(this.log.isCustomerValid());

      
    }

    goToReg()
    {
      this.router.navigate(['register'])
    }

}


