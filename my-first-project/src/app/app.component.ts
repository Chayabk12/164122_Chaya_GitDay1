import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Hello World of TypeScript!';
  firstname= "chaya"
  lastname = "b k"
  location : address = {
     "street" : "1007 Mountain Drive",
    	    "city" : "Gotham"
    	  };
        


}


class address{
  street: String
  city: String

}