package by.etc.AgregationAndComposition.course_task_four.TaskOne;

public class Main {
    public static void main(String[] args) {


        Sentence sentence = new Sentence(new Word("Hello"), new Word("world"), new Word("ahhhh"));
        Sentence sentence1 = new Sentence(new Word("two,"), new Word("three"));
        Text text = new Text("Attack", sentence, sentence1);
        System.out.println(text.getText());
        Sentence sentence2 = new Sentence(new Word("How"), new Word("are"), new Word("you"));
        text.addSentence(sentence2);
        System.out.println(text.getText());
        text.printTitle();

        Text text1 = new Text("WOW", new Word("A NEW"), new Word("POOOOOP"));
        System.out.println(text1.getText());
        text1.addSentence(new Word("Add"));
        System.out.println(text1.getText());
    }
}
