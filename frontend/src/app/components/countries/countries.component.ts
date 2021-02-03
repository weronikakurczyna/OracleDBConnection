import {Component, OnInit} from '@angular/core';
import {CountriesService} from "../../services/countries.service";
import {Country} from "./country";

@Component({
  selector: 'app-countries',
  templateUrl: './countries.component.html',
  styleUrls: ['./countries.component.scss']
})
export class CountriesComponent implements OnInit {
  private countries: Country[];
  private downloadedCountries: any;

  constructor(private countriesService: CountriesService) {
  }

  ngOnInit(): void {
    this.showInfo();
  }

  private showInfo() {
    this.downloadedCountries = this.countriesService.getCountries().subscribe({
      next: data => {
        this.countries = data;
      }
    });
  }

}
