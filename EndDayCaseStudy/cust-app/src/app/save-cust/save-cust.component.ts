import { identifierModuleUrl } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { CustjsonService } from '../custjson.service';
import { ICustomer } from '../icustomer';

@Component({
  selector: 'app-save-cust',
  templateUrl: './save-cust.component.html',
  styleUrls: ['./save-cust.component.css']
})
export class SaveCustComponent implements OnInit {

  public resp:String="";
  public cust:ICustomer;
  constructor(private _service:CustjsonService) { }

  ngOnInit(): void {
  }

  public save(id:number,name:String,mobile:number){

     this.cust={customerId:id, customerName:name, mobile:mobile};
    console.log(this.cust);
     this._service.save(this.cust).subscribe(data=>{this.resp=data;});;
    console.log(this.resp);
  }
}
