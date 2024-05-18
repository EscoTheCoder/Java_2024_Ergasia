import java.util.List;

public class MultipleChoiceQuestion extends Question {

    List<Object> apanthseis;
    List<Object> swstes_apanthseis;
    
    public MultipleChoiceQuestion(int code, String perigrafh,int t, List<Object> apanthseis, List<Object> swstes_apanthseis) {
        super(code, perigrafh);
        this.apanthseis = apanthseis;
        this.swstes_apanthseis = swstes_apanthseis;
        this.type =1;
    }

    public List<Object> getApanthseis() {
        return apanthseis;
    }

    public List<Object> getSwstes_apanthseis() {
        return swstes_apanthseis;
    }
}
