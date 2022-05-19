import { Injectable } from '@angular/core';
import { JwtHelperService } from '@auth0/angular-jwt';
import {
  HttpRequest,
  HttpHandler,
  HttpEvent,
  HttpInterceptor,
  HttpHeaders,
} from '@angular/common/http';
import { EMPTY, Observable } from 'rxjs';
import { Router } from '@angular/router';


@Injectable()
export class HeaderconfigInterceptor implements HttpInterceptor {
  isExpired: any;
  constructor(private jwtHelper: JwtHelperService, private router: Router) {
    const helper = new JwtHelperService();

    let token = sessionStorage.getItem('jwttoken');
    if (token) this.isExpired = helper.isTokenExpired(token);
  }

  intercept(request: HttpRequest<unknown>, next: HttpHandler): Observable<HttpEvent<unknown>> {
    if (this.isExpired) {
      return EMPTY;
    } else {
      request = request.clone({
        headers: this.addExtraHeaders(request.headers),
      });
      return next.handle(request);
    }
  }


  private addExtraHeaders(headers: HttpHeaders): HttpHeaders {
    let authToken = sessionStorage.getItem('jwttoken');

    if (authToken) {
      headers = headers.append('Authorization', `${authToken}`);
    }
    return headers;
  }
}
