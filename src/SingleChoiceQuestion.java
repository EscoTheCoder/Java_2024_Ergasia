public class SingleChoiceQuestion extends Question {

    private String apanthsh;
    

    public SingleChoiceQuestion(int code, String perigrafh,int t, String apanthsh) {
        super(code, perigrafh);
        this.apanthsh = apanthsh;
        this.type =2;
    }

    public String getApanthsh() {
        return apanthsh;
    }
}
