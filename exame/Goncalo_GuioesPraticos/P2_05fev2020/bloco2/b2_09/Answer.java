public class Answer {

    private String answer;
    private int points;

    public Answer(String answer, int points) {
        this.answer = answer;
        this.points = points;
    }

    public String getAnswer() {
        return answer;
    }

    public int getPoints() {
        return points;
    }

    public String toString() {
        return String.format(
            "%s (%d)",
            answer,
            points
        );
    }
    
}