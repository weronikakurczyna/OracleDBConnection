
export interface RegionInterface {
  regionID: number;
  regionName: string;
}

export class Region {
  constructor(fields: Partial<RegionInterface>) {
    this.regionID = fields.regionID;
    this.regionName = fields.regionName;
  }

  regionID: number;
  regionName: string;

}
