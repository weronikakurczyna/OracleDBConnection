import {Component, OnInit} from '@angular/core';
import {CountriesService} from "../../services/countries.service";
import {Country} from "./country";
import {FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-countries',
  templateUrl: './countries.component.html',
  styleUrls: ['./countries.component.scss']
})
export class CountriesComponent implements OnInit {
  countries: Country[];

  countryForm = new FormGroup({
      countryID: new FormControl(),
      countryName: new FormControl()
    }
  )

  constructor(private countriesService: CountriesService) {
  }

  ngOnInit(): void {
    this.showInfo();
  }

  showInfo() {
    this.countriesService
      .getCountries()
      .subscribe((data: Country[]) => this.countries = data);
  }

  onDelete(countryID: string) {
    this.countriesService.deleteCountry(countryID)
      .subscribe(() => console.log(`Country with ID = ${countryID} deleted`));

  }

  onInsert(): void {
    this.countriesService.insertCountry(this.countryForm.value).subscribe(() => {
      console.log('Country added')
      this.showInfo()
    });

  }

}
