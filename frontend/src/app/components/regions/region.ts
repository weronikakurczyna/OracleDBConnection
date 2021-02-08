
export interface RegionInterface {
  regionID: string;
  regionName: string;
}

export class Region {
  constructor(fields: Partial<RegionInterface>) {
    this.regionID = fields.regionID;
    this.regionName = fields.regionName;
  }

  regionID: string;
  regionName: string;



}
