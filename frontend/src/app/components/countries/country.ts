import {Region, RegionAttrs} from "../regions/region";


export interface CountryAttrs {
  countryID: number;
  countryName: string;
  regionID: RegionAttrs;
}

export class Country {
  constructor(attrs: Partial<CountryAttrs> = {}) {
    this.countryID = attrs.countryID;
    this.countryName = attrs.countryName;
    this.regionID = new Region(attrs.regionID);
  }
  countryID: number;
  countryName: string;
  regionID: Region;

}
