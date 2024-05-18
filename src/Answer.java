import java.util.List;

public class Answer {
    private Evaluatee ajiologoumenos;
    private Question erwthsh;
    private String apanthsh;
    List<Object> apanthsh2;

    public Answer(Evaluatee ajiologoumenos, Question erwthsh, String apanthsh) {
        this.ajiologoumenos = ajiologoumenos;
        this.erwthsh = erwthsh;
        this.apanthsh = apanthsh;
    }

    public Answer(Evaluatee ajiologoumenos, Question erwthsh, List<Object> apanthsh2) {
        this.ajiologoumenos = ajiologoumenos;
        this.erwthsh = erwthsh;
        this.apanthsh2 = apanthsh2;
    }

    public Evaluatee getEvaluatee() {
        return ajiologoumenos;
    }

    public Question getErwthsh() {
        return erwthsh;
    }

    public String getApanthsh() {
        return apanthsh;
    }


    @Override
    public String toString() {
        if (apanthsh != null) {
            return "Apanthsh{" +
                    "ajiologoumenos=" + ajiologoumenos +
                    ", erwthsh=" + erwthsh +
                    ", apanthsh=" + apanthsh +
                    '}';
        } else if (apanthsh2 != null) {
            StringBuilder stringBuilder = new StringBuilder("Apanthsh{")
                    .append("ajiologoumenos=").append(ajiologoumenos)
                    .append(", erwthsh=").append(erwthsh)
                    .append(", apanthsh=[");

            for (Object obj : apanthsh2) {
                stringBuilder.append(obj.toString()).append(", ");
            }

            // Remove the last comma and space
            if (!apanthsh2.isEmpty()) {
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
        if (apanthsh2 == null) {
            // An h apanthsh einai String elegxoume thn akriveia ths
            return erwthsh instanceof SingleChoiceQuestion && apanthsh.equalsIgnoreCase(((SingleChoiceQuestion) erwthsh).getApanthsh());
        }
        else {
            // An h apanthsh einai Lista elegxoume tis epiloges tou xrhsth me tis swstes apanthseis
            List<Object> correctAnswers;
            if(erwthsh instanceof MultipleChoiceQuestion){
                correctAnswers =((MultipleChoiceQuestion) erwthsh).getSwstes_apanthseis();
                boolean flag=true;
                for(Object item : correctAnswers){
                    if (!apanthsh2.contains(item)){
                        flag=false;
                    }
                }
                return flag;
            }
            else{
                correctAnswers =((CorrectOrderQuestion) erwthsh).getLista_lejewn_swsth_seira();
                return apanthsh2.equals(correctAnswers);
            }
        }
    }
}
