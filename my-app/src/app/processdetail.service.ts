import { Injectable } from '@angular/core';
import { map,Observable } from 'rxjs';
import { HttpClient, HttpHeaders, HttpResponse } from '@angular/common/http';
import { ProcessDetails } from './processdetail';

@Injectable({
  providedIn: 'root'
})
export class ProcessdetailService {

  constructor(private http:HttpClient) { }

  getProcessDetail(processDetails:ProcessDetails):Observable<any>{
    return this.http.post<any>(`http://localhost:8000/ProcessDetail`,processDetails,{observe:'response'}).pipe(map((data)=>{return data}));
  }

}
