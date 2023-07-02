import java.util.*;

public class Question {
    private String id, question;
    private List<Answer> rightAnswers;
    private List<Answer> wrongAnswers;

    Question(String id, String question) {
        this.id = id;
        this.question = question;
        this.rightAnswers = new ArrayList<>();
        this.wrongAnswers = new ArrayList<>();
    }

    //Setters
    public boolean addAnswer (Answer a) {
        if(a.getPoints()>0)
            return rightAnswers.add(a);
        return wrongAnswers.add(a);
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String computeQuestion(int choices) {
        // Validate argument
        if (rightAnswers.size()==0)
            return "Error! There are not right answers associated with te given question!";
        else if (choices>(rightAnswers.size()+wrongAnswers.size()))
            return String.format("Error! There are not enough answers (only %d) for the number of choices requested!", rightAnswers.size()+wrongAnswers.size());
        // Compute output
        StringBuilder str = new StringBuilder();
        str.append(question);
        str.append('\n');
        // Answers
        Random rand = new Random();
        List<Answer> answers = new ArrayList<>();
        // Compute number of right and wrong answers to add
        int correct = rand.nextInt(choices)+1;
        correct = (correct>rightAnswers.size()) ? rightAnswers.size()-1 : correct;
        choices -= correct;
        while (choices>wrongAnswers.size()) {
            correct++;
            choices--;
        }
        // Add them to a list
        while(correct>0) {
            Answer a = rightAnswers.get(rand.nextInt(rightAnswers.size()));
            if (!answers.contains(a)) {
                answers.add(a);
                correct--;
            }
        }
        while(choices>0) {
            Answer a = wrongAnswers.get(rand.nextInt(wrongAnswers.size()));
            if (!answers.contains(a)) {
                answers.add(a);
                choices--;
            }
        }
        // Add answers on list to output (after randomize it)
        Collections.shuffle(answers);
        int counter = 97;
        for(Answer a:answers) {
            str.append(String.format(
                "%4s%c) %s\n",
                "",
                counter,
                a.getAnswer()
            ));
            counter++;
        }
        return str.toString();
    }

    public String toString() {
        return String.format(
            "%s: %s with %d answers",
            id,
            question,
            rightAnswers.size()+wrongAnswers.size()
        );
    }
}