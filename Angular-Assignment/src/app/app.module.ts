import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ChildTablePrinterComponent } from './child-table-printer/child-table-printer.component';

@NgModule({
  declarations: [
    AppComponent,
    ChildTablePrinterComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
