//use pascal case to name component class
//convention is to use 'component' in the name of the class 
//for Angula to recognize a class as a commponent, we must import and use a decorator 

import { Component } from '@angular/core';
import { CoursesService } from './courses.service';

//we must add the decorator with the following syntax . . .
//note, we call it like a function. This is called a decorator function 
//the @Component decorator takes an object as an argument   
@Component({
    selector: 'courses', // <courses> "courses" //xml tag --> extending html vocabulary 
    template: `
    <h2>{{ getTitle() }}</h2>
    <ul>
        <li *ngFor="let course of courses">
            {{ course }}
        </li>
    </ul>


    <table>
        <tr>
            <td [colSpan]="colSpan"></td>
        </tr>
    </table>

    <img src = "{{ imageUrl }}" />
    
    <img [src] = "imageUrl" />

    <img src= "../assets/quiz_150908823-1021x580.jpg" />
  
   `
})               
// for <div class="courses"> ".courses" //same as for css
// for <div id="courses"> "#courses"
export class CoursesComponent {

    //instance variables/ properties to be bound
    title = "List of courses";

    //courses = ["course1", "course2", "course3"]
    courses;

    imageUrl = "../assets/quiz_150908823-1021x580.jpg"

    colSpan = 2;

    //methods 
    getTitle() {
        return this.title;
    }

    //costructur wich injects the getCourses srevice method
    //service is a dependency of type CoursesService
    //we add the dependence as a paramenter of the constructor to decouple the class 
    //from the dependency. 
    //we'll create an instance of the courses service when we instantiate the class
    //we have to register the dpendency injection somewhere in the module 
    constructor(service: CoursesService) {
        this.courses = service.getCourses();
    }


}