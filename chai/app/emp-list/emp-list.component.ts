import { Component, OnInit } from '@angular/core';
import { IEmployee } from '../iemployee';

@Component({
  selector: 'app-emp-list',
  templateUrl: './emp-list.component.html',
  styleUrls: ['./emp-list.component.css']
})
export class EmpListComponent implements OnInit {

  pageTitle:string="Employee Details";
  employees:IEmployee[]=[
    {
      empId:"E001",
      name:"Ashutosh",
      email:"ak@gmail.com",
      phone:"123456",
      salary:"15400",
      appraisalRating:"5"
    },
    {
      empId:"E002",
      name:"Ashutosh Poddar",
      email:"ashutosh@gmail.com",
      phone:"987654321",
      salary:"154000",
      appraisalRating:"4"
    }
  ]
  constructor() { }

  ngOnInit() {

  }

}
