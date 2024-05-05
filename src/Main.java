import Erwthseis.Erwthsh;
import Erwthseis.Erwthsh_PollaplhsEpiloghs;
import Erwthseis.Erwthsh_SkethLejh;
import Erwthseis.Erwthsh_SumplhrwshKenwn;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Δημιουργία λίστας αξιολογουμένων
        List<Ajiologoumenos> Lista_Ajiologoumenwn = new ArrayList<>();
        Lista_Ajiologoumenwn.add(new Ajiologoumenos(1, "Nikolas", "P"));
        Lista_Ajiologoumenwn.add(new Ajiologoumenos(2, "Stavros", "R"));
        Lista_Ajiologoumenwn.add(new Ajiologoumenos(3, "Bill", "I"));
        Lista_Ajiologoumenwn.add(new Ajiologoumenos(4, "Panos", "S"));

        // Δημιουργία λίστας ερωτήσεων
        List<Erwthsh> Lista_Erwthsewn = new ArrayList<>();

        // Ερωτήσεις πολλαπλής επιλογής
        Lista_Erwthsewn.add(new Erwthsh_PollaplhsEpiloghs(1, "Poioi einai protathlites NBA?", Arrays.asList("James", "Carry", "Antetokounmpo"), Arrays.asList(1, 3)));
        Lista_Erwthsewn.add(new Erwthsh_PollaplhsEpiloghs(2, "Poia apo ta parakatw einai zwa?", Arrays.asList("Patata", "Peristeri", "Skulos"), Arrays.asList(2, 3)));
        Lista_Erwthsewn.add(new Erwthsh_PollaplhsEpiloghs(3, "Poia apo ta parakatw den einai frouta;", Arrays.asList("Mhlo", "Patata", "Portokali", "Trapezi"), Arrays.asList(2, 4)));

        // Ερώτηση με μονή λέξη ως απάντηση
        Lista_Erwthsewn.add(new Erwthsh_SkethLejh(4, "Poios einai o proponhths ths REAL MADRITIS?", "Zidane"));
        Lista_Erwthsewn.add(new Erwthsh_SkethLejh(5, "Poios einai o Prothipourgos ths Amerikhs?", "Mpainten"));
        Lista_Erwthsewn.add(new Erwthsh_SkethLejh(6, "Poia einai h Prwtevousa ths Italias?", "Rwmh"));

        // Ερώτηση με κενά
        Lista_Erwthsewn.add(new Erwthsh_SumplhrwshKenwn(7, "H ? einai h megalhterh ? ston kosmo.", Arrays.asList("Kaspias", "Limnh"), Arrays.asList("Kaspias", "Limnh")));
        Lista_Erwthsewn.add(new Erwthsh_SumplhrwshKenwn(8, "O ? einai o ? pou vrisketai pio konta ston Hlio.", Arrays.asList("Planhths", "Ermhs"), Arrays.asList("Ermhs", "Planhths")));
        Lista_Erwthsewn.add(new Erwthsh_SumplhrwshKenwn(9, "To ? tou ouranoun thn hmera einai ? .", Arrays.asList("Mple", "Xrwma"), Arrays.asList("Xrwma", "Mple")));


        // Δημιουργία λίστας απαντήσεων
        List<Apanthsh> Lista_Apanthsewn = new ArrayList<>();
//        Ajiologoumenos sampleAssessee = Lista_Ajiologoumenwn.get(0); // Παράδειγμα αξιολογουμένου
//        Erwthsh sampleQuestion = Lista_Erwthsewn.get(0); // Παράδειγμα ερώτησης
//        Lista_Apanthsewn.add(new Apanthsh(sampleAssessee, sampleQuestion, "Sample Response"));

        try (Scanner in = new Scanner(System.in)) {
            for (; ; ) {
                System.out.println("\n1. Εισαγωγή νέου αξιολογούμενου: ");
                System.out.println("2. Εισαγωγή νέας ερώτηση: ");
                System.out.println("3. Εισαγωγή νέας απάντησης: ");
                System.out.println("4. Εμφάνιση των ερωτήσεων: ");
                System.out.println("5. Εμφάνιση των απαντήσεων ενός αξιολογούμενου: ");
                System.out.println("6. Εμφάνιση το πλήθος των σωστών απαντήσεων ανά αξιολογούμενο: ");
                System.out.println("7. Υπολογισμός του ποσοστού σωστών απαντήσεων μιας ερώτησης: ");
                System.out.println("8. Εμφάνιση του ποσοστού των σωστών απαντήσεων ανά αξιολογούμενο: ");
                System.out.println("0. Exit\n");

                System.out.println();
                System.out.print(">");
                int choice = in.nextInt();
                in.nextLine(); //fix to bug me to extra \n

                switch (choice) {

                    case 1: {
                        System.out.print("Code: ");
                        int Code = in.nextInt();
                        in.nextLine(); //fix to bug me to extra \n
                        System.out.print("Onoma: ");
                        String Onoma = in.nextLine();
                        System.out.print("Epwnhmo: ");
                        String Epwnhmo = in.nextLine();
                        Ajiologoumenos ajiologoumenos = new Ajiologoumenos(Code, Onoma, Epwnhmo);
                        Lista_Ajiologoumenwn.add(ajiologoumenos);
                        break;
                    }

                    case 2: {
                        System.out.print("Tupos Erwthshs: ");
                        String tupos_erwthshs = in.nextLine().toUpperCase();
                        //elegxos egkurothtas gia swsto Tupo Erwthshs
                        while (!tupos_erwthshs.equals(Tupoi_Erwthsewn.Pollaplhs_Epologhs.toString().toUpperCase()) &&
                                !tupos_erwthshs.equals(Tupoi_Erwthsewn.Sketh_Lejh.toString().toUpperCase()) &&
                                !tupos_erwthshs.equals(Tupoi_Erwthsewn.Sumplhrwsh_Kenwn.toString().toUpperCase())) {
                            System.out.print("Janadwse ton Tupo Erwthshs: ");
                            tupos_erwthshs = in.nextLine().toUpperCase();
                        }


                        if (tupos_erwthshs.equals(Tupoi_Erwthsewn.Pollaplhs_Epologhs.toString().toUpperCase())) {
                            System.out.print("Code: ");
                            int Code = in.nextInt();
                            in.nextLine(); //fix to bug me to extra \n

                            System.out.print("Perigrafh: ");
                            String Perigrafh = in.nextLine();

                            List<Object> apanthseis = new ArrayList<>();
                            List<Object> swstes_apanthseis = new ArrayList<>();
                            String option = "";
                            int i=1;

                            System.out.println("Epiloges (Plhkrologiste '.' gia na termatisete): ");
                            while (!(option.equals("."))){
                                System.out.print(i+")");
                                option = in.nextLine();
                                apanthseis.add(option);
                                i++;
                            }


                            System.out.print("Swstes Apanthseis (Diaxwrismenes me keno): ");
                            String[] correctAnswersArray = in.nextLine().split(" ");
                            for (String correctAnswer : correctAnswersArray) {
                                swstes_apanthseis.add(Integer.parseInt(correctAnswer));
                            }
                            Lista_Erwthsewn.add(new Erwthsh_PollaplhsEpiloghs(Code, Perigrafh, apanthseis, swstes_apanthseis));


                        }
                        else if (tupos_erwthshs.equals(Tupoi_Erwthsewn.Sketh_Lejh.toString().toUpperCase())) {
                            System.out.print("Code: ");
                            int Code = in.nextInt();
                            in.nextLine(); //fix to bug me to extra \n

                            System.out.print("Perigrafh: ");
                            String Perigrafh = in.nextLine();

                            System.out.print("Swsth Apanthsh: ");
                            String Swsth_Apanthsh = in.nextLine();
                            Lista_Erwthsewn.add(new Erwthsh_SkethLejh(Code, Perigrafh, Swsth_Apanthsh));

                        }
                        else if (tupos_erwthshs.equals(Tupoi_Erwthsewn.Sumplhrwsh_Kenwn.toString().toUpperCase())) {
                            System.out.print("Code: ");
                            int Code = in.nextInt();
                            in.nextLine(); //fix to bug me to extra \n

                            System.out.print("Perigrafh: ");
                            String Perigrafh = in.nextLine();

                            List<Object> lista_lejewn = new ArrayList<>();
                            List<Object> lista_lejewn_se_swsth_seira = new ArrayList<>();
                            String option="";
                            int j=1;

                            System.out.println("Epiloges (Plhkrologiste '.' gia na termatisete): ");
                            while (!(option.equals("."))){
                                System.out.print(j+")");
                                option = in.nextLine();
                                lista_lejewn.add(option);
                                j++;
                            }

                            System.out.print("Swstes Apanthseis (Diaxwrismenes me keno): ");
                            Object[] correctAnswersArray = in.nextLine().split(" ");
                            for (Object correctAnswer : correctAnswersArray) {
                                if(lista_lejewn.contains(correctAnswer)) {
                                    lista_lejewn_se_swsth_seira.add(correctAnswer);
                                }
                            }
                            Lista_Erwthsewn.add(new Erwthsh_SumplhrwshKenwn(Code, Perigrafh, lista_lejewn, lista_lejewn_se_swsth_seira));
                        }
                        break;
                    }

                    case 3: {
                        // Εμφάνιση λίστας αξιολογουμένων
                        System.out.println("Διαθέσιμοι αξιολογούμενοι:");
                        for (Ajiologoumenos ajio : Lista_Ajiologoumenwn) {
                            System.out.println(ajio.toString());
                        }

                        // Επιλογή αξιολογούμενου
                        System.out.print("Επιλέξτε αξιολογούμενο (κωδικός): ");
                        int selectedAssesseeCode = in.nextInt();
                        in.nextLine(); // Ανάγνωση newline

                        Ajiologoumenos selectedAssessee = null;
                        for (Ajiologoumenos ajio : Lista_Ajiologoumenwn) {
                            if (ajio.getCode() == selectedAssesseeCode) {
                                selectedAssessee = ajio;
                                break;
                            }
                        }

                        if (selectedAssessee == null) {
                            System.out.println("Λάθος κωδικός αξιολογούμενου.");
                            break;
                        }

                        // Εμφάνιση διαθέσιμων ερωτήσεων
                        System.out.println();
                        System.out.println("Διαθέσιμες ερωτήσεις:");
                        for (Erwthsh erwt : Lista_Erwthsewn) {
                            System.out.println(erwt.toString());
                        }

                        // Επιλογή ερώτησης
                        System.out.println();
                        System.out.print("Επιλέξτε ερώτηση (κωδικός): ");
                        int selectedQuestionCode = in.nextInt();
                        in.nextLine(); // Ανάγνωση newline

                        Erwthsh selectedQuestion = null;
                        for (Erwthsh erwt : Lista_Erwthsewn) {
                            if (erwt.getCode() == selectedQuestionCode) {
                                selectedQuestion = erwt;
                                break;
                            }
                        }

                        if (selectedQuestion == null) {
                            System.out.println("Λάθος κωδικός ερώτησης.");
                            break;
                        }

                        // Εμφάνιση επιλογών ανάλογα με τον τύπο της ερώτησης
                        if (selectedQuestion instanceof Erwthsh_PollaplhsEpiloghs || selectedQuestion instanceof Erwthsh_SumplhrwshKenwn) {
                            // Ερώτηση πολλαπλής επιλογής ή συμπλήρωσης κενών
                            System.out.println("Διαθέσιμες επιλογές:");
                            List<Object> options = selectedQuestion instanceof Erwthsh_PollaplhsEpiloghs ?
                                    ((Erwthsh_PollaplhsEpiloghs) selectedQuestion).getApanthseis() :
                                    ((Erwthsh_SumplhrwshKenwn) selectedQuestion).getLista_lejewn();
                            for (Object option : options) {
                                System.out.println(option.toString());
                            }
                        }

                        // Εισαγωγή απάντησης ανάλογα με τον τύπο της ερώτησης
                        if (selectedQuestion instanceof Erwthsh_PollaplhsEpiloghs) {
                            // Ερώτηση πολλαπλής επιλογής
                            Erwthsh_PollaplhsEpiloghs question_pollaplhs = (Erwthsh_PollaplhsEpiloghs) selectedQuestion;
                            List<Object> options = question_pollaplhs.getApanthseis();
                            List<Object> answers = new ArrayList<>();
                            String option;
                            System.out.println("Εισάγετε την απάντηση (πληκτρολογήστε '.' για να τερματίσετε): ");
                            while (!(option = in.nextLine()).equals(".")) {
                                try {
                                    int answerNumber = Integer.parseInt(option);
                                    if (answerNumber >= 1 && answerNumber <= options.size()) {
                                        answers.add(answerNumber);
                                    } else {
                                        System.out.println("Μη έγκυρη επιλογή. Δοκιμάστε ξανά.");
                                    }
                                } catch (NumberFormatException e) {
                                    System.out.println("Παρακαλώ εισάγετε έγκυρο αριθμό.");
                                }
                            }
                            Lista_Apanthsewn.add(new Apanthsh(selectedAssessee, selectedQuestion, answers));
                        }
                        else if (selectedQuestion instanceof Erwthsh_SumplhrwshKenwn) {
                            // Ερώτηση συμπλήρωσης κενών
                            Erwthsh_SumplhrwshKenwn question = (Erwthsh_SumplhrwshKenwn) selectedQuestion;
                            List<Object> options = question.getLista_lejewn();
                            List<Object> answers = new ArrayList<>();
                            String option;
                            System.out.println("Εισάγετε την απάντηση (πληκτρολογήστε '.' για να τερματίσετε): ");
                            while (!(option = in.nextLine()).equals(".")) {
                                if (options.contains(option)) {
                                    answers.add(option);
                                } else {
                                    System.out.println("Μη έγκυρη επιλογή. Δοκιμάστε ξανά.");
                                }
                            }
                            Lista_Apanthsewn.add(new Apanthsh(selectedAssessee, selectedQuestion, answers));
                        }

                        else if (selectedQuestion instanceof Erwthsh_SkethLejh) {
                            // Ερώτηση με μονή λέξη ως απάντηση
                            System.out.print("Εισάγετε την απάντηση: ");
                            String answer = in.nextLine();
                            Lista_Apanthsewn.add(new Apanthsh(selectedAssessee, selectedQuestion, answer));
                        }
                        else {
                            System.out.println("Μη υποστηριζόμενος τύπος ερώτησης.");
                        }
                        break;
                    }




                    case 4: {
                        for(Erwthsh er : Lista_Erwthsewn){
                            System.out.println(er.toString());
                        }
                        System.out.println();
                        break;
                    }

                    case 5: {
                        System.out.println("Diathesimoi Ajiologoumenoi:");
                        for (Ajiologoumenos ajio : Lista_Ajiologoumenwn) {
                            System.out.println(ajio.toString());
                        }

                        //Epilogh Ajiologoumenou
                        System.out.println();
                        System.out.print("Epeleje Ajiologoumeno (code): ");
                        int Code_Ajiologoumenou = in.nextInt();
                        in.nextLine(); // bug me to \n


                        Ajiologoumenos Epelegmenos_Ajiologoumenos = null;
                        for (Ajiologoumenos ajio : Lista_Ajiologoumenwn) {
                            if (ajio.getCode() == Code_Ajiologoumenou) {
                                Epelegmenos_Ajiologoumenos = ajio;
                                break;
                            }
                        }

                        if (Epelegmenos_Ajiologoumenos == null) {
                            System.out.println("Lathos Code Ajiologoumenou.");
                        }
                        else {
                            // Emfanhsh apanthsewn twn Ajiologoumenwn
                            System.out.println();
                            System.out.println("Answers of " + Epelegmenos_Ajiologoumenos.getOnoma() + ":");
                            for (Apanthsh answer : Lista_Apanthsewn) {
                                if (answer.getAjiologoumenos().equals(Epelegmenos_Ajiologoumenos)) {
                                    System.out.println(answer);
                                }
                            }
                        }
                        break;
                    }


                    case 6: {
                        Map<Ajiologoumenos, Integer> correctAnswersCountPerAssessee = new HashMap<>();

                        for (Ajiologoumenos ajio : Lista_Ajiologoumenwn) {
                            int correctAnswersCount = 0;
                            for (Apanthsh answer : Lista_Apanthsewn) {
                                if (answer.getAjiologoumenos().equals(ajio) && answer.isCorrect()) {
                                    correctAnswersCount++;
                                }
                            }
                            correctAnswersCountPerAssessee.put(ajio, correctAnswersCount);
                        }

                        List<Map.Entry<Ajiologoumenos, Integer>> sortedCorrectAnswersCountPerAssessee = new ArrayList<>(correctAnswersCountPerAssessee.entrySet());
                        sortedCorrectAnswersCountPerAssessee.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

                        System.out.println("Πλήθος σωστών απαντήσεων ανά αξιολογούμενο:");
                        for (Map.Entry<Ajiologoumenos, Integer> entry : sortedCorrectAnswersCountPerAssessee) {
                            System.out.println(entry.getKey().getOnoma() + ": " + entry.getValue());
                        }
                        break;
                    }



                    case 7: {
                        System.out.println("Διαθέσιμες ερωτήσεις:");
                        for (Erwthsh erwt : Lista_Erwthsewn) {
                            System.out.println(erwt.toString());
                        }

                        // Επιλογή ερώτησης
                        System.out.println();
                        System.out.print("Επιλέξτε ερώτηση (κωδικός): ");
                        int selectedQuestionCode = in.nextInt();
                        in.nextLine(); // Ανάγνωση newline

                        Erwthsh selectedQuestion = null;
                        for (Erwthsh erwt : Lista_Erwthsewn) {
                            if (erwt.getCode() == selectedQuestionCode) {
                                selectedQuestion = erwt;
                                break;
                            }
                        }

                        if (selectedQuestion == null) {
                            System.out.println("Λάθος κωδικός ερώτησης.");
                            break;
                        }

                        int totalAnswers = 0;
                        int correctAnswers = 0;

                        // Υπολογισμός ποσοστού σωστών απαντήσεων
                        for (Apanthsh answer : Lista_Apanthsewn) {
                            if (answer.getErwthsh().equals(selectedQuestion)) {
                                totalAnswers++;
                                if (answer.isCorrect()) {
                                    correctAnswers++;
                                }
                            }
                        }

                        double pososto = (double) correctAnswers / totalAnswers * 100;

                        System.out.println("Το ποσοστό σωστών απαντήσεων για την ερώτηση " + selectedQuestion.getPerigrafh() + " είναι: " + pososto + "%");
                        break;
                    }


                    case 8: {
                        // Δημιουργία χάρτη για την αποθήκευση του ποσοστού των σωστών απαντήσεων ανά αξιολογούμενο
                        Map<Ajiologoumenos, Double> correctAnswersPercentagePerAssessee = new HashMap<>();

                        // Υπολογισμός του ποσοστού σωστών απαντήσεων για κάθε αξιολογούμενο
                        for (Ajiologoumenos ajio : Lista_Ajiologoumenwn) {
                            int totalAnswers = 0;
                            int correctAnswers = 0;
                            for (Apanthsh answer : Lista_Apanthsewn) {
                                if (answer.getAjiologoumenos().equals(ajio)) {
                                    totalAnswers++;
                                    if (answer.isCorrect()) {
                                        correctAnswers++;
                                    }
                                }
                            }
                            // Υπολογισμός του ποσοστού και αποθήκευση στον χάρτη
                            double percentage = totalAnswers > 0 ? ((double) correctAnswers / totalAnswers) * 100 : 0;
                            correctAnswersPercentagePerAssessee.put(ajio, percentage);
                        }

                        // Ταξινόμηση του χάρτη βάσει του ποσοστού σωστών απαντήσεων
                        List<Map.Entry<Ajiologoumenos, Double>> sortedCorrectAnswersPercentagePerAssessee = new ArrayList<>(correctAnswersPercentagePerAssessee.entrySet());
                        sortedCorrectAnswersPercentagePerAssessee.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

                        // Εμφάνιση του ποσοστού σωστών απαντήσεων ανά αξιολογούμενο
                        System.out.println("Ποσοστό σωστών απαντήσεων ανά αξιολογούμενο:");
                        for (Map.Entry<Ajiologoumenos, Double> entry : sortedCorrectAnswersPercentagePerAssessee) {
                            System.out.println(entry.getKey().getOnoma() + ": " + entry.getValue() + "%");
                        }
                        break;
                    }


                    case 0:
                        System.out.println("Exiting...");
                        return;
                }
            }

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
