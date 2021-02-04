import {Region, RegionInterface} from "../regions/region";


export interface CountryInterface {
  countryID: number;
  countryName: string;
  regionID: RegionInterface;
}

export class Country {
  constructor(fields: Partial<CountryInterface>) {
    this.countryID = fields.countryID;
    this.countryName = fields.countryName;
    this.regionID = new Region(fields.regionID);
  }
  countryID: number;
  countryName: string;
  regionID: Region;

}
