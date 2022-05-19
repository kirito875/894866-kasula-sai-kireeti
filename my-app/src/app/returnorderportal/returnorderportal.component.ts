import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ProcessdetailService } from '../processdetail.service';
@Component({
  selector: 'app-returnorderportal',
  templateUrl: './returnorderportal.component.html',
  styleUrls: ['./returnorderportal.component.css']
})
export class ReturnorderportalComponent implements OnInit {
  username:any=sessionStorage.getItem('username');
  form: any;
  obj:any={processingcharge:0,packageanddeliverycharge:0};
  subscription: any;
  constructor(private pds:ProcessdetailService) { }

  ngOnInit(): void {
    this.username=sessionStorage.getItem('username');
    this.form = new FormGroup({
      contactnumber: new FormControl(''),
      componenttype: new FormControl(''),
      componentname:new FormControl(''),
      count:new FormControl('')
    });
  }

  submitProcessRequest(){
   this.subscription=this.pds.getProcessDetail({...this.form.value,username:this.username}).subscribe(
    (data: any) => this.redirectAfterGettingProcessReponse(data),
    (error:any)=>console.log(error)
   );
  }

  redirectAfterGettingProcessReponse(res:any){
      console.log(res.body);
      this.obj=res.body;
  }

}
