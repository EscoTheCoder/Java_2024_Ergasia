import Erwthseis.Erwthsh;
import Erwthseis.Erwthsh_PollaplhsEpiloghs;
import Erwthseis.Erwthsh_SkethLejh;
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
            return erwthsh instanceof Erwthsh_SkethLejh && apanthsh.equalsIgnoreCase(((Erwthsh_SkethLejh) erwthsh).getApanthsh());
        }
        else {
            // An h apanthsh einai Lista elegxoume tis epiloges tou xrhsth me tis swstes apanthseis
            List<Object> correctAnswers;
            if(erwthsh instanceof Erwthsh_PollaplhsEpiloghs){
                correctAnswers =((Erwthsh_PollaplhsEpiloghs) erwthsh).getSwstes_apanthseis();
                boolean flag=true;
                for(Object item : correctAnswers){
                    if (!apanthsh2.contains(item)){
                        flag=false;
                    }
                }
                return flag;
            }
            else{
                correctAnswers =((Erwthsh_SumplhrwshKenwn) erwthsh).getLista_lejewn_swsth_seira();
                return apanthsh2.equals(correctAnswers);
            }
        }
    }
}
