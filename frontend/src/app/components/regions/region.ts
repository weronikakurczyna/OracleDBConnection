
export interface RegionAttrs {
  id: number;
  regionName: string;
}

export class Region {
  constructor(attrs: Partial<RegionAttrs> = {}) {
    this.id = attrs.id;
    this.regionName = attrs.regionName;
  }

  id: number;
  regionName: string;

}
