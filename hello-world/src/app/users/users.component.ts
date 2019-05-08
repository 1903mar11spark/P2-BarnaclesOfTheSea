import { User } from './../user.model';
import { LoginCreds } from './../login-creds.model';
import { UserType } from './../user-type.model';
import { UserService } from './../user.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {

  title = 'User List';

  users: User[];
  user: User; // = new Bear(3, "Fred", new Cave(5, "Camp Awesome", 7), new BearType(8, "Grizzly"), 400, new Date());

  // Inject service
  // in a typescript constructor, can define properties of the class
  constructor(private userService: UserService) { }
  /*
  getBearInformation(): void {
    this.bearService.fetchBearInformation(this.selectedBearId)
      .subscribe(
        bear => this.bear = bear,
        error => console.log(`Error: ${error} `)
      );
  }
  */
  getUsers(): void {
    this.userService.fetchAllUsers()
      .subscribe(
        (userList: any) => { this.users = userList; console.log(this.users); },
        error => { console.log(error); }
      );
    console.log('populated users');
    console.log(this.users);
    // this will usually print 'undefined' because it is attempting to print a
    // value which may not have back from the Observable yet.
  }
  // if we want to make the call when component is created
  ngOnInit() {
    // this.getBearInformation();
    // with the current setup the component is created with no preselected bear
  }

}
