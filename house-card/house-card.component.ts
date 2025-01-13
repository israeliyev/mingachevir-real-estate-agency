import {Component} from '@angular/core';
import {MatDialog, MatDialogConfig} from '@angular/material/dialog';
import {HouseDetailComponent} from '../house-detail/house-detail.component';

@Component({
  selector: 'app-house-card',
  imports: [],
  templateUrl: './house-card.component.html',
  styleUrl: './house-card.component.css'
})
export class HouseCardComponent {
  constructor(
    private dialog: MatDialog
  ) {

  }

  openHouseDetail(): void {
    const dialogConfig = new MatDialogConfig();
    dialogConfig.data = "sdfdsfdsf";
    dialogConfig.width = '1200px';
    dialogConfig.maxWidth = '1200px';
    this.dialog.open(HouseDetailComponent, dialogConfig);
  }
}
