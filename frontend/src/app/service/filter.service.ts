import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Filter } from '../model/filter';

@Injectable({
  providedIn: 'root'
})
export class FilterService {
  private host = "http://localhost:8080" //Backend service API endpoint
  public incrementation = 1;

  constructor(private http: HttpClient) { }

  public increment(number): void {
    if(number > 0) {
      this.incrementation += 1;
    }
    else {
      this.incrementation -= 1;
    }
    if(this.incrementation > 3) {
      this.incrementation = 3;
      
    }
    if(this.incrementation < 1) {
      this.incrementation = 1;
    }
  }
  public getFilter(): Observable<Filter[]> {
    return this.http.get<Filter[]>(`${this.host}/filter/list`);
  }

  public addFilter(formData: FormData): Observable<Filter> {
    return this.http.post<Filter>(`${this.host}/filter/add`, formData);
  }

  public createUserFormData(filter: Filter): FormData {
    const formData = new FormData();
    formData.append('name', filter.name);
    formData.append('amount', filter.amount);
    formData.append('compare', filter.compare);
    formData.append('numericField', filter.numericField);
    formData.append('text', filter.text);
    formData.append('textOptions', filter.textOptions);
    formData.append('textField', filter.textField);
    formData.append('dateType', filter.dateType);
    formData.append('dateOptions', filter.dateOptions);
    formData.append('date', filter.date);
    formData.append('conditions', filter.conditions);
    return formData;
  }
}