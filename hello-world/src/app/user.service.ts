import { User } from './user.model';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class UserService {

  //endpoint = 'http://localhost:8084/ServletDemo/bear';
  endpoint = 'http://localhost:8089/P2/user';

  // inject HttpClient
  constructor(private httpClient: HttpClient) { }

  public fetchUserInformation(id: number): Observable<User> {
    return this.httpClient.get<User>(`${this.endpoint}?id=${id}`);
  }

  // get all bears, for real, from our backend. using HttpClient, newer version of HttpModule
  public fetchAllUsers(): Observable<User[]> {
    return this.httpClient.get<User[]>(this.endpoint+`/all`);
  }

}
