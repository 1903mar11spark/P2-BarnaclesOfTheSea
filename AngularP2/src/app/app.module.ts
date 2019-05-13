//MyModules
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap'; //BootStrap import 
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

//may add Material and Graphics 
//as comments aren't permitted in json, to add Bootstrap you also have to go to the angular.json file and add
// "node_modules/bootstrap/dist/css/bootstrap.min.css" this to the styles section among assets


//Routing
import { AppRoutingModule } from './app-routing.module';

//Good old components
import { AppComponent } from './app.component';
import { LoginComponent } from './components/landings/login/login.component';
import { AdminHomeComponent } from './components/landings/admin-home/admin-home.component';
import { InfoComponent } from './components/sections/info/info.component';
import { NavComponent } from './components/layout/nav/nav.component';
import { CreateUserComponent } from './components/landings/create-user/create-user.component';
import { FooterComponent } from './components/layout/footer/footer.component';
import { UserInfoComponent } from './components/sections/user-info/user-info.component';
import { CardsComponent } from './components/sections/cards/cards.component';
import { UserHomeComponent } from './components/landings/user-home/user-home.component';
import { FlipCardComponent } from './components/features/flip-card/flip-card.component';
import {UniquePipe} from '../app/app.component';
//services 

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    AdminHomeComponent,
    InfoComponent,
    NavComponent,
    CreateUserComponent,
    FooterComponent,
    UserInfoComponent,
    CardsComponent,
    UserHomeComponent,
    FlipCardComponent,
    UniquePipe
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  //lets ang know root component
  bootstrap: [AppComponent]
})
export class AppModule { }
