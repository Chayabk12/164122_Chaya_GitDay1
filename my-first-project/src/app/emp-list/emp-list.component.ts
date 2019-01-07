import { Component, OnInit } from '@angular/core';
import { IEmployee } from '../iemployee';

@Component({
  selector: 'app-emp-list',
  templateUrl: './emp-list.component.html',
  styleUrls: ['./emp-list.component.css']
})
export class EmpListComponent implements OnInit {
pageTitle: String = "Employee Details"
employees: IEmployee[]=[
{
  "empId": "e01",
  "name": "Leanne Graham",
  "email" : "Sincere2APRIL.BIZ",
    "phone": 89456721,
    "salary": 587556,
    "appraisalRating": 451
},

{
  "empId": "e02",
  "name": "Graham",
  "email" : "Sincere2@gmail.BIZ",
    "phone": 8945672145,
    "salary": 586897,
    "appraisalRating": 51
}]
  constructor() { }

  ngOnInit() {
  }

}
