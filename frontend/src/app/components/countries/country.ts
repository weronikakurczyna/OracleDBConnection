import {Region, RegionAttrs} from "../regions/region";


export interface CountryAttrs {
  countryID: number;
  countryName: string;
  region: RegionAttrs;
}

export class Country {
  constructor(attrs: Partial<CountryAttrs> = {}) {
    this.countryID = attrs.countryID;
    this.countryName = attrs.countryName;
    this.region = new Region(attrs.region);
  }
  countryID: number;
  countryName: string;
  region: Region;

}
