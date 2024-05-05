import Erwthseis.Erwthsh;
import Erwthseis.Erwthsh_PollaplhsEpiloghs;
import Erwthseis.Erwthsh_SumplhrwshKenwn;

import java.util.List;

public class Apanthsh {
    private Ajiologoumenos ajiologoumenos;
    private Erwthsh erwthsh;
    private String apanthsh;
    List<Object> apanthsh2;

    public Apanthsh(Ajiologoumenos ajiologoumenos, Erwthsh erwthsh, String apanthsh) {
        this.ajiologoumenos = ajiologoumenos;
        this.erwthsh = erwthsh;
        this.apanthsh = apanthsh;
    }

    public Apanthsh(Ajiologoumenos ajiologoumenos, Erwthsh erwthsh, List<Object> apanthsh2) {
        this.ajiologoumenos = ajiologoumenos;
        this.erwthsh = erwthsh;
        this.apanthsh2 = apanthsh2;
    }

    public Ajiologoumenos getAjiologoumenos() {
        return ajiologoumenos;
    }

    public Erwthsh getErwthsh() {
        return erwthsh;
    }

    public String getApanthsh() {
        return apanthsh;
    }



    @Override
    public String toString() {
        return "Ajiologoumenos: " + ajiologoumenos.toString() + ", Erwthseis.Erwthsh: " + erwthsh.toString() + ", Apanthsh: " + apanthsh;
    }
}
