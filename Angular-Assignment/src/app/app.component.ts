import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
  
  public numValue:number;
  
  public message:String="";
  title = 'tryproject';

  public pass(value:number){
    this.numValue=value;
  }
}
