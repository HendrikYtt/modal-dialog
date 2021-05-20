import { Component, OnInit } from '@angular/core';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';
import { Filter } from 'src/app/model/filter';
import { FilterService } from 'src/app/service/filter.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-dialog',
  templateUrl: './dialog.component.html',
  styleUrls: ['./dialog.component.css'],
})
export class DialogComponent implements OnInit {
  
  public filter: Filter;
  public filters: Filter[];

  constructor(public activeModal: NgbActiveModal, private filterService: FilterService) {}

  ngOnInit() {
    this.getFilters();
    
   }

  public getFilters(): void {
    this.filterService.getFilter().subscribe(
      (data) => {
        this.filters = data;
      }
    )
}

public addFilter(userForm: NgForm): void {
  const formData = this.filterService.createUserFormData(userForm.value);
    this.filterService.addFilter(formData).subscribe(
      (response: Filter) => {
        this.getFilters();
      }
    )
}

}
