import { Component, OnInit } from '@angular/core';
import {RegionsService} from "../../services/regions.service";
import {Region} from "./region";

@Component({
  selector: 'app-regions',
  templateUrl: './regions.component.html',
  styleUrls: ['./regions.component.scss']
})
export class RegionsComponent implements OnInit {
  private regions: Region[];
  private downloadedRegions: any;

  constructor(private regionsService: RegionsService) { }

  ngOnInit(): void {
    this.showInfo();
  }

  private showInfo() {
    this.downloadedRegions = this.regionsService.getRegions().subscribe({
      next: data => {
        this.regions = data;
      }
    });
  }

}
