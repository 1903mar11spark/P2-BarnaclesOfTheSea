import { Injectable } from '@angular/core';

@Injectable({ //only need to use this if the service has dependenices we want to include in its contructor
  providedIn: 'root'
})
export class EmailService {

  constructor() { }
}
