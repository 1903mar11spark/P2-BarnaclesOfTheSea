import { HttpClientModule } from '@angular/common/http';
import { UserService } from './user.service';
import { CoursesService } from './courses.service';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CoursesComponent } from './courses.component';
import { CourseComponent } from './course/course.component';
import { UsersComponent } from './users/users.component';
import { CardComponent } from './card/card.component';

//the only thing in here is this decorator function alled @NgModule
//this converts a plain ts class into a module from ts' point of view

@NgModule({
  declarations: [ //This is where we add all of the components that are port of this module
    AppComponent,  //by default, we have this one component 
    CoursesComponent, 
    CourseComponent, 
    UsersComponent, CardComponent //when we type this in, it is automatically imported at the top
  ],
  imports: [
    BrowserModule,
    AppRoutingModule, 
    HttpClientModule 
  ],
  providers: [CoursesService, UserService], //all of the dependencies that components in this module are dependent upon go in here 
  bootstrap: [AppComponent]     //note: when you register a dependency, angular creates a single instnace of the class for the entire module 
})

export class AppModule { }
