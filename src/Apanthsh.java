public class Apanthsh {
    private Ajiologoumenos assessee;
    private Erwthsh question;
    private String response;

    public Apanthsh(Ajiologoumenos assessee, Erwthsh question, String response) {
        this.assessee = assessee;
        this.question = question;
        this.response = response;
    }

    @Override
    public String toString() {
        return "Ajiologoumenos: " + assessee.toString() + ", Erwthsh: " + question.toString() + ", Apanthsh: " + response;
    }
}
