import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserComponent } from './components/user/user.component';
//import { CarouselModule } from 'ngx-bootstrap/carousel';
import { EmpListComponent } from './emp-list/emp-list.component';


@NgModule({
  declarations: [
    AppComponent,
    UserComponent,
    EmpListComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})

export class AppModule {

 }
