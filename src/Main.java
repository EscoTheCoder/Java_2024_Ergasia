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
        Lista_Erwthsewn.add(new Erwthsh_PollaplhsEpiloghs(1, "Ποιος είναι ο πρωταθλητής του ΝΒΑ το 2023;", Arrays.asList("James", "Carry", "Antetokounmpo"), Arrays.asList(1, 3)));
        Lista_Erwthsewn.add(new Erwthsh_PollaplhsEpiloghs(2, "Ποιο από τα παρακάτω είναι ζώο;", Arrays.asList("Patata", "Peristeri", "Skulos"), Arrays.asList(2, 3)));
        Lista_Erwthsewn.add(new Erwthsh_PollaplhsEpiloghs(3, "Ποιο από τα παρακάτω δεν είναι φρούτο;", Arrays.asList("Mhlo", "Patata", "Portokali", "Trapezi"), Arrays.asList(2, 4)));

        // Ερώτηση με μονή λέξη ως απάντηση
        Lista_Erwthsewn.add(new Erwthsh_SkethLejh(4, "Ποιος είναι ο προπονητής της ομάδας Ρεάλ Μαδρίτης;", "Zidane"));
        Lista_Erwthsewn.add(new Erwthsh_SkethLejh(5, "Ποιος είναι ο υπάρχον πρόεδρος των Ηνωμένων Πολιτειών;", "Mpainten"));
        Lista_Erwthsewn.add(new Erwthsh_SkethLejh(6, "Ποια είναι η πρωτεύουσα της Ιταλίας;", "Rwmh"));

        // Ερώτηση με κενά
        Lista_Erwthsewn.add(new Erwthsh_SumplhrwshKenwn(7, "Ο ? είναι η μεγαλύτερη ? στον κόσμο.", Arrays.asList("Kaspias", "Limnh"), Arrays.asList("Kaspias", "Limnh")));
        Lista_Erwthsewn.add(new Erwthsh_SumplhrwshKenwn(8, "Ο ? είναι ο ? που βρίσκεται πιο κοντά στον ήλιο.", Arrays.asList("Planhths", "Ermhs"), Arrays.asList("Ermhs", "Planhths")));
        Lista_Erwthsewn.add(new Erwthsh_SumplhrwshKenwn(9, "Το ? του ουρανού κατά τη διάρκεια της ημέρας είναι ? .", Arrays.asList("Mple", "Xrwma"), Arrays.asList("Xrwma", "Mple")));


        // Δημιουργία λίστας απαντήσεων
        List<Apanthsh> Lista_Apanthsewn = new ArrayList<>();
        Ajiologoumenos sampleAssessee = Lista_Ajiologoumenwn.get(0); // Παράδειγμα αξιολογουμένου
        Erwthsh sampleQuestion = Lista_Erwthsewn.get(0); // Παράδειγμα ερώτησης
        Lista_Apanthsewn.add(new Apanthsh(sampleAssessee, sampleQuestion, "Sample Response"));

        try (Scanner in = new Scanner(System.in)) {
            for (; ; ) {
                System.out.println("1. Εισαγωγή νέου αξιολογούμενου: ");
                System.out.println("2. Εισαγωγή νέας ερώτηση: ");
                System.out.println("3. Εισαγωγή νέας απάντησης: ");
                System.out.println("4. Εμφάνιση των ερωτήσεων: ");
                System.out.println("5. Εμφάνιση των απαντήσεων ενός αξιολογούμενου: ");
                System.out.println("6. Εμφάνιση το πλήθος των σωστών απαντήσεων ανά αξιολογούμενο: ");
                System.out.println("7. Υπολογισμός του ποσοστού σωστών απαντήσεων μιας ερώτησης: ");
                System.out.println("8. Εμφάνιση του ποσοστού των σωστών απαντήσεων ανά αξιολογούμενο: ");
                System.out.println("0. Exit");

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

                        System.out.println("Diathesimoi Ajiologoumenoi:");
                        for (Ajiologoumenos ajio : Lista_Ajiologoumenwn) {
                            System.out.println(ajio.toString());
                        }

                        //Epilogh Ajiologoumenou
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
                            continue;
                        }

                        // Diathesimes Erwthseis
                        System.out.println("Diathesimes Erwthseis:");
                        for (Erwthsh erwt : Lista_Erwthsewn) {
                            System.out.println(erwt.toString());
                        }

                        // Epilogh Erwthshs
                        System.out.print("Epeleje Erwthseis.Erwthsh (code): ");
                        int Code_Erwthshs = in.nextInt();
                        in.nextLine(); // bug me to \n

                        Erwthsh selectedQuestion = null;
                        for (Erwthsh erwt : Lista_Erwthsewn) {
                            if (erwt.getCode() == Code_Erwthshs) {
                                selectedQuestion = erwt;
                                break;
                            }
                        }

                        if (selectedQuestion == null) {
                            System.out.println("Lathos Code Erwthshs..");
                            continue;
                        }


                        if (selectedQuestion instanceof Erwthsh_PollaplhsEpiloghs || selectedQuestion instanceof Erwthsh_SumplhrwshKenwn) {
                            List<Object> answers = new ArrayList<>();
                            String option;
                            System.out.println("Enter the answer(s) (Type '.' to finish): ");
                            while (!(option = in.nextLine()).equals(".")) {
                                answers.add(option);
                            }

                            Lista_Apanthsewn.add(new Apanthsh(Epelegmenos_Ajiologoumenos, selectedQuestion, answers));
                        } else if (selectedQuestion instanceof Erwthsh_SkethLejh) {

                            System.out.print("Enter the answer: ");
                            String answer = in.nextLine();


                            Lista_Apanthsewn.add(new Apanthsh(Epelegmenos_Ajiologoumenos, selectedQuestion, answer));
                        } else {
                            System.out.println("Unsupported question type.");
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
                        System.out.print("Epeleje Ajiologoumeno (code): ");
                        int Code_Ajiologoumenou = in.nextInt();
                        in.nextLine(); // bug me to \n


                        Ajiologoumenos selectedAssessor = null;
                        for (Ajiologoumenos ajio : Lista_Ajiologoumenwn) {
                            if (ajio.getCode() == Code_Ajiologoumenou) {
                                selectedAssessor = ajio;
                                break;
                            }
                        }

                        if (selectedAssessor == null) {
                            System.out.println("Lathos Code Ajiologoumenou.");
                        }
                        else {
                            // Emfanhsh apanthsewn twn Ajiologoumenwn
                            System.out.println("Answers of " + selectedAssessor.getOnoma() + ":");
                            for (Apanthsh answer : Lista_Apanthsewn) {
                                if (answer.getAjiologoumenos().equals(selectedAssessor)) {
                                    System.out.println(answer.getErwthsh().getPerigrafh() + " - " + answer.getApanthsh());
                                }
                            }
                        }
                        break;
                    }


                    case 6: {

//                        //Xrhsh lejikou-hashmap gia apothikeush Ajiologoumenou - plithos swston apanthsewn
//                        Map<Ajiologoumenos, Integer> correctAnswersCountPerAssessee = new HashMap<>();
//                        for (Apanthsh apanthsh : Lista_Apanthsewn) {
//                            Ajiologoumenos ajiologoumenos = apanthsh.getAjiologoumenos();
//                            boolean correct = isCorrect(apanthsh); // Υποθέτουμε ότι υπάρχει μια μέθοδος isCorrect που επιστρέφει true αν η απάντηση είναι σωστή
//                            correctAnswersCountPerAssessee.merge(ajiologoumenos, isCorrect ? 1 : 0, Integer::sum);
//                        }
//
//                        // Ταξινόμηση του Map με βάση τον αριθμό των σωστών απαντήσεων
//                        List<Map.Entry<Ajiologoumenos, Integer>> sortedList = new ArrayList<>(correctAnswersCountPerAssessee.entrySet());
//                        sortedList.sort(Map.Entry.<Ajiologoumenos, Integer>comparingByValue().reversed());
//
//                        // Εμφάνιση του πλήθους των σωστών απαντήσεων ανά αξιολογούμενο
//                        System.out.println("Πλήθος σωστών απαντήσεων ανά αξιολογούμενο:");
//                        for (Map.Entry<Ajiologoumenos, Integer> entry : sortedList) {
//                            System.out.println(entry.getKey() + ": " + entry.getValue());
//                        }

                    }


                    case 7: {
                        break;
                    }

                    case 8: {
                        break;
                    }

                    case 0:
                        break;

                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
