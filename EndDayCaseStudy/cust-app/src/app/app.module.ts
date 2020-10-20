import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FindCustComponent } from './find-cust/find-cust.component';
import { FindAllComponent } from './find-all/find-all.component';
import { SaveCustComponent } from './save-cust/save-cust.component';
import { CustjsonService } from './custjson.service';
import {HttpClientModule} from  '@angular/common/http'

@NgModule({
  declarations: [
    AppComponent,
    FindCustComponent,
    FindAllComponent,
    SaveCustComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [CustjsonService],
  bootstrap: [AppComponent]
})
export class AppModule { }
