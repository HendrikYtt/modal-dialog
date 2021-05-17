import { Component } from '@angular/core';
import { DialogServiceService } from './GenericConfirmationDialog/dialog-service.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Wisercar Modal Dialog';

  /**
   *
   */
  constructor(private dialogService: DialogServiceService) {  }

  openDialog() {

    this.dialogService.open(
      {
      })
      .then(result => {
        console.log(result);
    }, () => {});
  }
}
