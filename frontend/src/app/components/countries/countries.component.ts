import {Component, OnInit} from '@angular/core';
import {CountriesService} from "../../services/countries.service";
import {Country} from "./country";

@Component({
  selector: 'app-countries',
  templateUrl: './countries.component.html',
  styleUrls: ['./countries.component.scss']
})
export class CountriesComponent implements OnInit {
  countries: Country[];

  constructor(private countriesService: CountriesService) {
  }

  ngOnInit(): void {
    this.showInfo();
  }

  private showInfo() {
    this.countriesService
      .getCountries()
      .subscribe((data: Country[]) => this.countries = data);
  }
}
