import {  Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-child-table-printer',
  templateUrl: './child-table-printer.component.html',
  styleUrls: ['./child-table-printer.component.css']
})
export class ChildTablePrinterComponent implements OnInit {

  @Input() value:number;
  @Output() public idEvent = new EventEmitter();
  public oneToTen:number[]=[1,2,3,4,5,6,7,8,9,10];

  constructor() { }

  ngOnInit(): void {
  }
  

  public loaded(){  
    this.idEvent.emit("This is message to inform I printed table of value you passed");
    //this.value=10;
  }
}
