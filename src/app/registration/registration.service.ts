import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class RegistrationService {

  //private baseUrl = 'http://localhost:8080/test';  

  constructor(private http: HttpClient) { }

  API = 'http://localhost:8080';
  public addCourier(courier: any) {
    return this.http.post(this.API + '/addCourierDetail', courier)
  }

  public getCouriers() {
    return this.http.get(this.API + '/courierDetail')
  }

  /*public  deleteCourier(id: number) {
    return this.http.delete(this.API + '/deleteCourier/{id}' + id)
  }*/

   public updateCourier(courier: any){
    return this.http.put(courier, this.API + '/updateCourierDetail' , courier)
   }

  public  deleteUser(id: any){
    return this.http.delete(this.API + '/deleteUser?id=' +id);
  }
}  