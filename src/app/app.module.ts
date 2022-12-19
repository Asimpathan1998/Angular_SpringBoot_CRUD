import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { NgForm } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NetflixmainComponent } from './netflixmain/netflixmain.component';
import { LoginComponent } from './login/login.component';
import { CustomersComponent } from './customers/customers.component';
import { RegistrationComponent } from './registration/registration.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { DemoComponent } from './demo/demo.component';
import { TemplateformComponent } from './templateform/templateform.component';
import { EditEmployeeComponent } from './edit-employee/edit-employee.component';
@NgModule({
  declarations: [
    AppComponent,
    NetflixmainComponent,
    LoginComponent,
    CustomersComponent,
    RegistrationComponent,
    DemoComponent,
    TemplateformComponent,
    EditEmployeeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [RegistrationComponent]
})
export class AppModule { }
