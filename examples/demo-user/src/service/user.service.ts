import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from 'src/model/user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private usersUrl : string;

  constructor(private http: HttpClient) {
    this.usersUrl = 'http://localhost:8090/users'
   }

   public findAll(): Observable<User[]>{
     return this.http.get<User[]>(this.usersUrl);
   }
}
