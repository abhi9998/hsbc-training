import { Component, OnInit } from '@angular/core';
import { CustjsonService } from '../custjson.service';
import { ICustomer } from '../icustomer';

@Component({
  selector: 'app-find-all',
  templateUrl: './find-all.component.html',
  styleUrls: ['./find-all.component.css']
})
export class FindAllComponent implements OnInit {

  public custList:ICustomer[];
  constructor(private _service:CustjsonService) { }

  ngOnInit(): void {
  }

  public getAll(){
    this._service.findAll().subscribe(data=>this.custList=data);
}

}
