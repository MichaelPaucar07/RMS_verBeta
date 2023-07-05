import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  expandButton() {
    const button = document.querySelector('.button');
    button?.classList.add('expanded');
    setTimeout(() => {
      button?.classList.remove('expanded');
    }, 1000);
  }
}
