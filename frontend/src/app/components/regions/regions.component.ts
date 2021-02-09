import {Component, OnInit} from '@angular/core';
import {RegionsService} from "../../services/regions.service";
import {Region} from "./region";
import {FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-regions',
  templateUrl: './regions.component.html',
  styleUrls: ['./regions.component.scss']
})
export class RegionsComponent implements OnInit {
  regions: Region[];

  regionForm = new FormGroup({
    regionID: new FormControl(),
    regionName: new FormControl()
  });

  constructor(private regionsService: RegionsService) {
  }

  ngOnInit(): void {
    this.showInfo();
  }

  private showInfo() {
    this.regionsService.getRegions().subscribe({
      next: data => {
        this.regions = data;
      }
    });
  }

  onDelete(regionID: string) {
    this.regionsService.deleteRegion(regionID)
      .subscribe(() => {
        console.log(`Region with ID = ${regionID} deleted`)
        this.showInfo()
      });
  }

  onInsert() {
    this.regionsService.insertRegion(this.regionForm.value).subscribe(() => {
      console.log('Region added')
      this.showInfo()
    });
  }

}
