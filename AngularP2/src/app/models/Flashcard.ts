
export interface Flashcard {
    id:number;
    question: string;
    answer:string;
    topic?:[number,string];
}