import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { RegistrationService } from './registration.service';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent {


  title = 'project';
  registerCourier: any;

  getaCourier: any | null;
  CourierToUpdate = {
    id: "",
    name: "",
    address: "",
    provider: "",
    boxweight: "",
    price: ""
  };
  //updateCourier: any;

  constructor(private registrationService: RegistrationService) {
  }

  register(registerForm: { value: NgForm; }) {
    this.registrationService.addCourier(registerForm.value).subscribe(
      (resp) => {
        console.log(resp);
        this.getCouriers();
      },
      (error) => {
        console.log(error);
      }
    );
  }
  getCouriers() {
    this.registrationService.getCouriers().subscribe(
      (resp) => {
        console.log(resp);
        this.getaCourier = resp;
      },
      (error) => {
        console.log(error);
      }
    )
  }

  /*deleteCourier(deleteCourier: any) {
    this.registrationService.deleteCourier(deleteCourier).subscribe(
      (resp: any) => {
        console.log(resp);

      },
      (error: any) => {
        console.log(error);
      }
    )*/
  deleteUser(getCouriers: { id: any; }) {
    this.registrationService.deleteUser(getCouriers.id).subscribe(
      (resp) => {
        console.log(resp)
      },
      (error) => {
        console.log(error);
      }
    )
  }

  updateCourier(getCouriers: any) {
    this.CourierToUpdate = getCouriers;
  }
}




