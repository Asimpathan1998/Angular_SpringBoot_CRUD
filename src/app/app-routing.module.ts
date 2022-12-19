import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RegistrationComponent } from './registration/registration.component';

const routes: Routes = [
  {path: 'registration', component:RegistrationComponent},
   {path:'add' ,component:RegistrationComponent},
   {path:'update',component:RegistrationComponent},
   {path:'delete', component:RegistrationComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
