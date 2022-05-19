import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpResponse } from '@angular/common/http';
import { BehaviorSubject, catchError, map, Observable } from 'rxjs';
import { UserDetails } from './userdetails';
@Injectable({
  providedIn: 'root'
})
export class AuthtokenService {

  constructor(private http: HttpClient) {}

  jwtTokenGeneration(userDetails:UserDetails):Observable<any>{
    return this.http
    .post<any>(`http://3.239.76.103:8300/login`, userDetails, {
      observe: 'response',
    })
    .pipe(
      map((data) => { 
        sessionStorage.setItem('jwttoken', data.body.jwtToken);
       
        return data;
      })
    );  
  }


}
