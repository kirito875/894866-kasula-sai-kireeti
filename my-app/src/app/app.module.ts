import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { NavigationComponent } from './navigation/navigation.component';
import { ReturnorderportalComponent } from './returnorderportal/returnorderportal.component';
import { HeaderconfigInterceptor } from './headerconfig.interceptor';
import { JwtHelperService, JWT_OPTIONS } from '@auth0/angular-jwt';
@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    NavigationComponent,
    ReturnorderportalComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
  ],
  providers: [ { provide: HTTP_INTERCEPTORS, useClass: HeaderconfigInterceptor, multi: true },
    { provide: JWT_OPTIONS, useValue: JWT_OPTIONS },
    JwtHelperService],
  bootstrap: [AppComponent]
})
export class AppModule { }
