package Erwthseis;

import java.util.List;

public class Erwthsh_PollaplhsEpiloghs extends Erwthsh{

    List<Object> apanthseis;
    List<Object> swstes_apanthseis;

    public Erwthsh_PollaplhsEpiloghs(int code, String perigrafh, List<Object> apanthseis, List<Object> swstes_apanthseis) {
        super(code, perigrafh);
        this.apanthseis = apanthseis;
        this.swstes_apanthseis = swstes_apanthseis;
    }

    public List<Object> getApanthseis() {
        return apanthseis;
    }

    public List<Object> getSwstes_apanthseis() {
        return swstes_apanthseis;
    }
}
