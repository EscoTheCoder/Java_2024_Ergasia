import java.util.List;

public class Answer {
    private Evaluatee evaluatee;
    private Question question;
    private String answer;
    List<Object> answer2;

    public Answer(Evaluatee ajiologoumenos, Question erwthsh, String apanthsh) {
        this.evaluatee = ajiologoumenos;
        this.question = erwthsh;
        this.answer = apanthsh;
    }

    public Answer(Evaluatee ajiologoumenos, Question erwthsh, List<Object> apanthsh2) {
        this.evaluatee = ajiologoumenos;
        this.question = erwthsh;
        this.answer2 = apanthsh2;
    }

    public Evaluatee getEvaluatee() {
        return evaluatee;
    }

    public Question getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }


    @Override
    public String toString() {
        if (answer != null) {
            return "Answer{" +
                    "evaluate=" + evaluatee +
                    ", question=" + question +
                    ", answer=" + answer +
                    '}';
        } else if (answer2 != null) {
            StringBuilder stringBuilder = new StringBuilder("Answer{")
                    .append("evaluate=").append(evaluatee)
                    .append(", question=").append(question)
                    .append(", answer=[");

            for (Object obj : answer2) {
                stringBuilder.append(obj.toString()).append(", ");
            }

            if (!answer2.isEmpty()) {
                stringBuilder.setLength(stringBuilder.length() - 2);
            }

            stringBuilder.append("]}");

            return stringBuilder.toString();
        }
        else {
            return null;
        }
    }

    public boolean isCorrect() {
        if (answer2 == null) {
            return question instanceof SingleChoiceQuestion && answer.equalsIgnoreCase(((SingleChoiceQuestion) question).getApanthsh());
        }
        else {
            List<Object> correctAnswers;
            if(question instanceof MultipleChoiceQuestion){
                correctAnswers =((MultipleChoiceQuestion) question).getSwstes_apanthseis();
                boolean flag=true;
                for(Object item : correctAnswers){
                    if (!answer2.contains(item)){
                        flag=false;
                    }
                }
                return flag;
            }
            else{
                correctAnswers =((CorrectOrderQuestion) question).getLista_lejewn_swsth_seira();
                return answer2.equals(correctAnswers);
            }
        }
    }
}
