import { Component, OnInit } from '@angular/core';
import { Flashcard } from 'src/app/models/Flashcard';
import { FlashcardService} from '../../../services/flashcard.service';

@Component({
  selector: 'app-flip-card',
  templateUrl: './flip-card.component.html',
  styleUrls: ['./flip-card.component.css']
})
export class FlipCardComponent implements OnInit {
flashcards: Flashcard[];
flashcard: Flashcard;
  constructor(private flashcardService:FlashcardService) { }

  loadFlashCards(): void{
    this.flashcardService.getFlashcards()
    .subscribe(
    (flashcardList: any) => { this.flashcards = flashcardList;
       console.log(this.flashcards);
      },
    error => { console.log(error); }
    )

  }
  
  
  checkCategories(Category:string): string{
    let categoryCheck=false;

    if(Flashcard.topic.topicName='Geography'){
      categoryCheck=true;
    }
return categoryCheck;
  }
  ngOnInit() {
    this.loadFlashCards();
    this.checkCategories('');
  }

}
