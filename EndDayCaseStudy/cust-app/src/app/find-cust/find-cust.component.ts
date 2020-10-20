import { Component, OnInit } from '@angular/core';
import { CustjsonService } from '../custjson.service';
import { ICustomer } from '../icustomer';

@Component({
  selector: 'app-find-cust',
  templateUrl: './find-cust.component.html',
  styleUrls: ['./find-cust.component.css']
})
export class FindCustComponent implements OnInit {

  public cust:ICustomer={customerId:null,customerName:null,mobile:null};
  constructor(private _service:CustjsonService) { }

  ngOnInit(): void {
  }

  public getById(value:number){

    this._service.findById(value).subscribe(data=>this.cust=data);
}

}
