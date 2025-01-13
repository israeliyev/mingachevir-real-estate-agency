import {NgForOf} from '@angular/common';
import { Component, OnInit } from '@angular/core';
import {NavbarComponent} from './navbar/navbar.component';
import {FooterComponent} from './footer/footer.component';
import {HouseCardComponent} from './house-card/house-card.component';

interface Slide {
  image: string;
  title: string;
  description: string;
}
@Component({
  selector: 'app-root',
  imports: [NgForOf, NavbarComponent, FooterComponent, HouseCardComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit {
  title = 'mingachevir-real-estate-agency';

  slides: Slide[] = [
    {
      image: "../assets/img/008.jpg",
      title: 'First Slide',
      description: 'Description for the first slide.'
    },
    {
      image: "../assets/img/205.jpg",
      title: 'Second Slide',
      description: 'Description for the second slide.'
    },
    {
      image: "../assets/img/206.jpg",
      title: 'Third Slide',
      description: 'Description for the third slide.'
    }
  ];
  currentSlide = 0;
  isDropdownOpen = false;

  ngOnInit() {
    this.autoSlide();
  }

  autoSlide() {
    setInterval(() => {
      if (!this.isDropdownOpen) {
        this.nextSlide();
      }
    }, 5000);
  }
    nextSlide() {
    this.currentSlide = (this.currentSlide + 1) % this.slides.length;
  }

  prevSlide() {
    this.currentSlide = (this.currentSlide - 1 + this.slides.length) % this.slides.length;
  }

  toggleDropdown(state: boolean) {
    this.isDropdownOpen = state;
  }
}
