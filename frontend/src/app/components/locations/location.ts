import {Country, CountryInterface} from "../countries/country";

export interface LocationInterface {
  locationID: string;
  streetAddress: string;
  postalCode: string;
  city: string;
  stateProvince: string;
  countryID: CountryInterface;
}

export class Location {
  constructor(fields: Partial<LocationInterface>) {
    this.locationID = fields.locationID;
    this.streetAddress = fields.streetAddress;
    this.postalCode = fields.postalCode;
    this.city = fields.city;
    this.stateProvince = fields.stateProvince;
    this.countryID = new Country(fields.countryID);
  }

  locationID: string;
  streetAddress: string;
  postalCode: string;
  city: string;
  stateProvince: string;
  countryID: CountryInterface;

}
