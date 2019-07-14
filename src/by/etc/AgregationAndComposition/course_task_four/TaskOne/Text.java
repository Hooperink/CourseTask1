package by.etc.AgregationAndComposition.course_task_four.TaskOne;

public class Text {

    private String text;
    private String title;
    Text(String title, Sentence ... sentences){
        this.title = title;
        this.text = makeString(sentences);
    }

    Text(String title, Word ... words){
        this.title = title;
        Sentence sentence = new Sentence(words);
        this.text = makeString(sentence);
    }

    public void setText(String text) {
        this.text = text;
    }

    public void printTitle(){
        System.out.println(this.title.toUpperCase());
    }

    public static String makeString(Sentence ... sentences){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < sentences.length; i++) {
            stringBuilder.append(sentences[i].toString());
        }
        return stringBuilder.toString();
    }

    public static String makeString(Sentence sentence){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(sentence);
        return stringBuilder.toString();
    }


    public void addSentence(Sentence ... sentences){
        StringBuilder stringBuilder = new StringBuilder(this.text);
        stringBuilder.append(makeString(sentences));
        this.text = stringBuilder.toString();
    }

    public void addSentence(Word ... words){
        Sentence sentence = new Sentence(words);
        StringBuilder stringBuilder = new StringBuilder(this.text);
        stringBuilder.append(makeString(sentence));
        this.text = stringBuilder.toString();
    }

    public String getText() {
        return text;
    }

    public String getTitle() {
        return title;
    }
}
