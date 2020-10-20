import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ICustomer } from './icustomer';

@Injectable({
  providedIn: 'root'
})
export class CustjsonService {

  private _urlAll="http://localhost:8080/cust/findAll";
  private _urlById="http://localhost:8080/cust/find?id=";
  private _urlSave="http://localhost:8080/cust/save";
  public respdata:String="";
  constructor(private http:HttpClient) { }

  public findById(custId:number):Observable<ICustomer>{

    return this.http.get<ICustomer>(this._urlById+custId);
  }

  public findAll():Observable<ICustomer[]>{
    return this.http.get<ICustomer[]>(this._urlAll);
  }

  public save(cust:ICustomer):Observable<String>{
    console.log("in service");
    const headers = { 'Content-Type': 'application/json', 'Accept': 'text/plain' };
   // this.http.post<String>(this._urlSave,cust,{headers, responseType:'text' as 'json'}).subscribe(data=>{console.log(data)});
  return  this.http.post<String>(this._urlSave,cust,{headers, responseType:'text' as 'json'});
  
  // console.log(this.respdata);
  // return this.respdata;
 
  }
}
