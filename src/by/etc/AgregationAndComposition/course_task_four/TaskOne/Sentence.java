package by.etc.AgregationAndComposition.course_task_four.TaskOne;

public class Sentence {
    private Word []words;
    Sentence(Word ... words){
        this.words = words;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < words.length ; i++) {
            stringBuilder.append(words[i].getWord() + " ");
        }
        return stringBuilder.toString();
    }
}
