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

        public boolean isCorrect() {
            if (erwthsh instanceof Erwthsh_PollaplhsEpiloghs) {
                // Εάν η ερώτηση είναι πολλαπλής επιλογής, ελέγχουμε αν η απάντηση είναι σωστή
                List<Object> swstesApanthseis = ((Erwthsh_PollaplhsEpiloghs) erwthsh).getSwstesApanthseis();
                return swstesApanthseis.containsAll((List<Object>) apanthsh) && ((List<Object>) apanthsh).containsAll(swstesApanthseis);
            } else if (erwthsh instanceof Erwthsh_SumplhrwshKenwn) {
                // Εάν η ερώτηση είναι συμπλήρωσης κενών, ελέγχουμε αν η απάντηση είναι ίδια με τις σωστές απαντήσεις
                List<Object> swstesApanthseis = ((Erwthsh_SumplhrwshKenwn) erwthsh).getListaLejewnSeSwsthSeira();
                return swstesApanthseis.equals(apanthsh);
            } else if (erwthsh instanceof Erwthsh_SkethLejh) {
                // Εάν η ερώτηση είναι σκέτη λέξη, ελέγχουμε αν η απάντηση είναι ίδια με τη σωστή απάντηση
                return erwthsh.getSwsthApanthsh().equals(apanthsh);
            } else {
                // Άγνωστος τύπος ερώτησης
                System.out.println("Unsupported question type.");
                return false;
            }
        }



    @Override
    public String toString() {
        return "Ajiologoumenos: " + ajiologoumenos.toString() + ", Erwthseis.Erwthsh: " + erwthsh.toString() + ", Apanthsh: " + apanthsh;
    }
}
