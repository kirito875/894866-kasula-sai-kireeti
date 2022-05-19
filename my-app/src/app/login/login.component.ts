import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthtokenService } from '../authtoken.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  form: any;
  subscription: any;

  constructor(
    private ats:AuthtokenService,
    private router: Router
  ) { }

  ngOnInit(): void {
    this.form = new FormGroup({
      username: new FormControl(''),
      password: new FormControl(''), 
    });
    
  }

  login(){
    console.log(this.form.value);
    this.subscription = this.ats.jwtTokenGeneration(this.form.value).subscribe(
      (data: any) => this.responseSelection(data),
      (error:any)=>this.responseError(error)
      
    );
  }
  responseSelection(res:any){
     if(res.status==200){
      console.log(res.body.loginStatus);
      if(res.body.loginStatus='success'){
      sessionStorage.setItem('username',this.form.value.username);
      this.router.navigate(['returnorders']);
      }
     }
  }
  responseError(res:any){
    console.log(res);
  }
}
