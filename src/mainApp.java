import java.util.*;

public class mainApp {
    public static void main(String[] args) {
        // Dhmiourgia listas Ajiologoumenwn
        List<Ajiologoumenos> Lista_Ajiologoumenwn = new ArrayList<>();
        Lista_Ajiologoumenwn.add(new Ajiologoumenos(1, "Nikolas", "P"));
        Lista_Ajiologoumenwn.add(new Ajiologoumenos(2, "Stavros", "R"));
        Lista_Ajiologoumenwn.add(new Ajiologoumenos(3, "Bill", "I"));
        Lista_Ajiologoumenwn.add(new Ajiologoumenos(4, "Panos", "S"));

        // Dhmiourgia listas Erwthsewn
        List<Erwthsh> Lista_Erwthsewn = new ArrayList<>();

        // Erwthsh_PollaplhsEpiloghs
        Lista_Erwthsewn.add(new Erwthsh_PollaplhsEpiloghs(1, "Poioi einai protathlites NBA?", Arrays.asList("James".toUpperCase(), "Carry".toUpperCase(), "Antetokounmpo".toUpperCase()), Arrays.asList(1, 3)));
        Lista_Erwthsewn.add(new Erwthsh_PollaplhsEpiloghs(2, "Poia apo ta parakatw einai zwa?", Arrays.asList("Patata".toUpperCase(), "Peristeri".toUpperCase(), "Skulos".toUpperCase()), Arrays.asList(2, 3)));
        Lista_Erwthsewn.add(new Erwthsh_PollaplhsEpiloghs(3, "Poia apo ta parakatw den einai frouta;", Arrays.asList("Mhlo".toUpperCase(), "Patata".toUpperCase(), "Portokali".toUpperCase(), "Trapezi".toUpperCase()), Arrays.asList(2, 4)));

        // Erwthsh_SkethLejh
        Lista_Erwthsewn.add(new Erwthsh_SkethLejh(4, "Poios einai o proponhths ths REAL MADRITIS?", "Zidane".toUpperCase()));
        Lista_Erwthsewn.add(new Erwthsh_SkethLejh(5, "Poios einai o Prothipourgos ths Amerikhs?", "Mpainten".toUpperCase()));
        Lista_Erwthsewn.add(new Erwthsh_SkethLejh(6, "Poia einai h Prwtevousa ths Italias?", "Rwmh".toUpperCase()));

        // Erwthsh_SumplhrwshKenwn
        Lista_Erwthsewn.add(new Erwthsh_SumplhrwshKenwn(7, "H ? einai h megalhterh ? ston kosmo.", Arrays.asList("Kaspias".toUpperCase(), "Limnh".toUpperCase()), Arrays.asList("Kaspias".toUpperCase(), "Limnh".toUpperCase())));
        Lista_Erwthsewn.add(new Erwthsh_SumplhrwshKenwn(8, "O ? einai o ? pou vrisketai pio konta ston Hlio.", Arrays.asList("Planhths".toUpperCase(), "Ermhs".toUpperCase()), Arrays.asList("Ermhs".toUpperCase(), "Planhths".toUpperCase())));
        Lista_Erwthsewn.add(new Erwthsh_SumplhrwshKenwn(9, "To ? tou ouranoun thn hmera einai ? .", Arrays.asList("Mple".toUpperCase(), "Xrwma".toUpperCase()), Arrays.asList("Xrwma".toUpperCase(), "Mple".toUpperCase())));


        // Dhmiourgia Lista Apanthsewn
        List<Apanthsh> Lista_Apanthsewn = new ArrayList<>();

        try (Scanner in = new Scanner(System.in)) {
            for (; ; ) {
                System.out.println("\n1. Eisagwgh neou ajiologoumenou: ");
                System.out.println("2. Eisagwgh neas erwthshs: ");
                System.out.println("3. Eisagwgh neas apanthshs: ");
                System.out.println("4. Emfanish twn erwthsewn: ");
                System.out.println("5. Emfanish twn apanthsewn enos ajiologoumenou: ");
                System.out.println("6. Emfanish to plithos twn apanthsewn ana ajiologoumenou: ");
                System.out.println("7. Ypologismos tou posostou swstwn apanthsewn mias erwthshs: ");
                System.out.println("8. Emfanish tou posostou twn swstwn apanthsewn ana ajiologoumeno: ");
                System.out.println("0. Exit\n");

                System.out.print(">");
                int choice = in.nextInt();
                in.nextLine(); //fix to bug me to extra \n

                switch (choice) {

                    case 1: {
                        System.out.println("To code prepei na einai megalhtero tou "+Lista_Ajiologoumenwn.size());
                        System.out.print("Code: ");
                        int Code = in.nextInt();
                        while(Code<=Lista_Ajiologoumenwn.size()){
                            System.out.println("To code prepei na einai megalhtero tou "+Lista_Ajiologoumenwn.size());
                            System.out.print("Code: ");
                            Code = in.nextInt();
                        }

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
                        System.out.println("Tupoi Erwthsewn  = "+Tupoi_Erwthsewn.Pollaplhs_Epologhs +" - "+Tupoi_Erwthsewn.Sketh_Lejh +" - "+Tupoi_Erwthsewn.Sumplhrwsh_Kenwn+"\n");

                        System.out.print("Dwse Tupo Erwthshs: ");
                        String tupos_erwthshs = in.nextLine().toUpperCase();
                        //elegxos egkurothtas gia swsto Tupo Erwthshs
                        while (!tupos_erwthshs.equals(Tupoi_Erwthsewn.Pollaplhs_Epologhs.toString().toUpperCase()) &&
                                !tupos_erwthshs.equals(Tupoi_Erwthsewn.Sketh_Lejh.toString().toUpperCase()) &&
                                !tupos_erwthshs.equals(Tupoi_Erwthsewn.Sumplhrwsh_Kenwn.toString().toUpperCase())) {
                            System.out.print("Janadwse ton Tupo Erwthshs: ");
                            tupos_erwthshs = in.nextLine().toUpperCase();
                        }


                        if (tupos_erwthshs.equals(Tupoi_Erwthsewn.Pollaplhs_Epologhs.toString().toUpperCase())) {
                            System.out.println("To code prepei na einai megalhtero tou "+Lista_Erwthsewn.size());
                            System.out.print("Code: ");
                            int Code = in.nextInt();
                            while(Code<=Lista_Erwthsewn.size()){
                                System.out.println("To code prepei na einai megalhtero tou "+Lista_Erwthsewn.size());
                                System.out.print("Code: ");
                                Code = in.nextInt();
                            }

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
                                option = in.nextLine().toUpperCase();
                                if(!option.equals(".")) {
                                    apanthseis.add(option);
                                }
                                i++;
                            }

                            if(apanthseis.get(0).equals(".")){
                                System.out.println("Den mporeis na dwseis apanthseis an den exeis orisei pithana apotelesmata");
                                break;
                            }
                            else{
                                System.out.print("Swstes Apanthseis (Diaxwrismenes me keno): ");
                                String[] correctAnswersArray = in.nextLine().toUpperCase().split(" ");
                                for (String correctAnswer : correctAnswersArray) {
                                    swstes_apanthseis.add(Integer.parseInt(correctAnswer));
                                }
                                Lista_Erwthsewn.add(new Erwthsh_PollaplhsEpiloghs(Code, Perigrafh, apanthseis, swstes_apanthseis));
                            }



                        }
                        else if (tupos_erwthshs.equals(Tupoi_Erwthsewn.Sketh_Lejh.toString().toUpperCase())) {
                            System.out.println("To code prepei na einai megalhtero tou "+Lista_Erwthsewn.size());
                            System.out.print("Code: ");
                            int Code = in.nextInt();
                            while(Code<=Lista_Erwthsewn.size()){
                                System.out.println("To code prepei na einai megalhtero tou "+Lista_Erwthsewn.size());
                                System.out.print("Code: ");
                                Code = in.nextInt();
                            }

                            in.nextLine(); //fix to bug me to extra \n

                            System.out.print("Perigrafh: ");
                            String Perigrafh = in.nextLine();

                            System.out.print("Swsth Apanthsh: ");
                            String Swsth_Apanthsh = in.nextLine().toUpperCase();
                            Lista_Erwthsewn.add(new Erwthsh_SkethLejh(Code, Perigrafh, Swsth_Apanthsh));

                        }
                        else if (tupos_erwthshs.equals(Tupoi_Erwthsewn.Sumplhrwsh_Kenwn.toString().toUpperCase())) {
                            System.out.println("To code prepei na einai megalhtero tou "+Lista_Erwthsewn.size());
                            System.out.print("Code: ");
                            int Code = in.nextInt();
                            while(Code<=Lista_Erwthsewn.size()){
                                System.out.println("To code prepei na einai megalhtero tou "+Lista_Erwthsewn.size());
                                System.out.print("Code: ");
                                Code = in.nextInt();
                            }

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
                                option = in.nextLine().toUpperCase();
                                if(!option.equals(".")) {
                                    lista_lejewn.add(option);
                                }
                                j++;
                            }

                            if(lista_lejewn.get(0).equals(".")){
                                System.out.println("Den mporeis na dwseis apanthseis an den exeis orisei pithana apotelesmata");
                                break;
                            }
                            else{
                                System.out.print("Swstes Apanthseis (Diaxwrismenes me keno): ");
                                Object[] correctAnswersArray = in.nextLine().toUpperCase().split(" ");
                                for (Object correctAnswer : correctAnswersArray) {
                                    if(lista_lejewn.contains(correctAnswer)) {
                                        lista_lejewn_se_swsth_seira.add(correctAnswer);
                                    }
                                }
                                Lista_Erwthsewn.add(new Erwthsh_SumplhrwshKenwn(Code, Perigrafh, lista_lejewn, lista_lejewn_se_swsth_seira));
                            }
                        }
                        break;
                    }




                    case 3: {
                        // Emfanishs Listas Ajiologoumenwn
                        System.out.println("Diathesimoi Ajiologoumenoi:");
                        for (Ajiologoumenos ajio : Lista_Ajiologoumenwn) {
                            System.out.println(ajio.toString());
                        }

                        // Epilogh Ajiologoumenou
                        System.out.print("Epilejte Ajiologoumeno (kwdikos): ");
                        int selectedAssesseeCode = in.nextInt();
                        in.nextLine(); // new line bug

                        Ajiologoumenos selectedAssessee = null;
                        for (Ajiologoumenos ajio : Lista_Ajiologoumenwn) {
                            if (ajio.getCode() == selectedAssesseeCode) {
                                selectedAssessee = ajio;
                                break;
                            }
                        }

                        if (selectedAssessee == null) {
                            System.out.println("Lathos Kwdikos Ajiologoumenou.");
                            break;
                        }

                        // Emfanish Diathesimwn Erwthsewn
                        System.out.println();
                        System.out.println("Diathesimes Erwthseis:");
                        for (Erwthsh erwt : Lista_Erwthsewn) {
                            System.out.println(erwt.toString());
                        }

                        // Epilogh Erwthshs
                        System.out.println();
                        System.out.print("Epilejte Erwthsh (Kwdikos): ");
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
                            System.out.println("Lathos Kwdikos Erwthshs.");
                            break;
                        }

                        // Emfanish epilogwn analoga me ton tupo ths Erwthshs
                        if (selectedQuestion instanceof Erwthsh_PollaplhsEpiloghs || selectedQuestion instanceof Erwthsh_SumplhrwshKenwn) {
                            // Erwthsh_PollaplhsEpiloghs H Erwthsh_SumplhrwshKenwn
                            System.out.println("Diathesismes Epiloges:");
                            List<Object> options = selectedQuestion instanceof Erwthsh_PollaplhsEpiloghs ?
                                    ((Erwthsh_PollaplhsEpiloghs) selectedQuestion).getApanthseis() :
                                    ((Erwthsh_SumplhrwshKenwn) selectedQuestion).getLista_lejewn();
                            for (Object option : options) {
                                System.out.println(option.toString());
                            }
                        }

                        // Eisagwgh apanthshs analoga me ton tupo ths Erwthshs
                        if (selectedQuestion instanceof Erwthsh_PollaplhsEpiloghs) {
                            // Erwthsh_PollaplhsEpiloghs
                            Erwthsh_PollaplhsEpiloghs question_pollaplhs = (Erwthsh_PollaplhsEpiloghs) selectedQuestion;
                            List<Object> options = question_pollaplhs.getApanthseis();
                            List<Object> answers = new ArrayList<>();
                            String option;
                            System.out.println("Eisagetai thn Apanthsh (Plhktorogiste '.' gia na termatisete): ");
                            while (!(option = in.nextLine()).equals(".")) {
                                try {
                                    int answerNumber = Integer.parseInt(option);
                                    if (answerNumber >= 1 && answerNumber <= options.size()) {
                                        answers.add(answerNumber);
                                    } else {
                                        System.out.println("Mh egkurh epilogh. Dokimste jana.");
                                    }
                                } catch (NumberFormatException e) {
                                    System.out.println("Parakalo eisagetai egkurw arithmo.");
                                }
                            }
                            Lista_Apanthsewn.add(new Apanthsh(selectedAssessee, selectedQuestion, answers));
                        }
                        else if (selectedQuestion instanceof Erwthsh_SumplhrwshKenwn) {
                            // Erwthsh sumplhrwshs kenwn
                            Erwthsh_SumplhrwshKenwn question = (Erwthsh_SumplhrwshKenwn) selectedQuestion;
                            List<Object> options = question.getLista_lejewn();
                            List<Object> answers = new ArrayList<>();
                            String option;
                            System.out.println("Eisagetai thn Apanthsh (Plhktorogiste '.' gia na termatisete): ");
                            while (!(option = in.nextLine().toUpperCase()).equals(".")) {
                                if (options.contains(option)) {
                                    answers.add(option);
                                } else {
                                    System.out.println("Mh egkirh epilogh. Dokimste jana.");
                                }
                            }
                            Lista_Apanthsewn.add(new Apanthsh(selectedAssessee, selectedQuestion, answers));
                        }

                        else if (selectedQuestion instanceof Erwthsh_SkethLejh) {
                            // Erwthsh me monh lejh ws apanthsh
                            System.out.print("Eisagetai thn Apanthsh: ");
                            String answer = in.nextLine().toUpperCase();
                            Lista_Apanthsewn.add(new Apanthsh(selectedAssessee, selectedQuestion, answer));
                        }
                        else {
                            System.out.println("Mh upostirizomenos tupos erwthshs.");
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
                                if (answer.getAjiologoumenos().equals(ajio) && answer.isCorrect()) { //isCorrect() method tis class Apanthsh
                                    correctAnswersCount++;
                                }
                            }
                            correctAnswersCountPerAssessee.put(ajio, correctAnswersCount);
                        }

                        List<Map.Entry<Ajiologoumenos, Integer>> sortedCorrectAnswersCountPerAssessee = new ArrayList<>(correctAnswersCountPerAssessee.entrySet());
                        sortedCorrectAnswersCountPerAssessee.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

                        System.out.println("Plithos swstwn apanthsewn ana ajiologoumeno:");
                        for (Map.Entry<Ajiologoumenos, Integer> entry : sortedCorrectAnswersCountPerAssessee) {
                            System.out.println(entry.getKey().getOnoma() + ": " + entry.getValue());
                        }
                        break;
                    }



                    case 7: {
                        // Dhmiourgis hashmap gia thn apothikeush tou posostou twn swstws apanthsewn ana erwthsh
                        Map<Erwthsh, Double> correctAnswersPercentagePerQuestion = new HashMap<>();

                        // Ypologismos tou posostou swstwn apanthsewn gia kathe xrhsth
                        for (Erwthsh question : Lista_Erwthsewn) {
                            int totalAnswers = 0;
                            int correctAnswers = 0;
                            for (Apanthsh answer : Lista_Apanthsewn) {
                                if (answer.getErwthsh().equals(question)) {
                                    totalAnswers++;
                                    if (answer.isCorrect()) {
                                        correctAnswers++;
                                    }
                                }
                            }
                            // Ypologismos tou posostou kai apothikeush sto hashmap
                            double percentage;
                            if (totalAnswers > 0) {
                                percentage = ((double) correctAnswers / totalAnswers) * 100;
                            } else {
                                percentage = 0;
                            }
                            correctAnswersPercentagePerQuestion.put(question, percentage);
                        }

                        // Tajinomhsh tou hashmap me bash tou posostou swstwn apanthsewn
                        List<Map.Entry<Erwthsh, Double>> sortedCorrectAnswersPercentagePerQuestion = new ArrayList<>(correctAnswersPercentagePerQuestion.entrySet());
                        sortedCorrectAnswersPercentagePerQuestion.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

                        // Emfanhsh tou posostou swstwn apanthsewn ana erwthsh
                        System.out.println("Pososto swstwn apanthsewn ana erwthsh:");
                        for (Map.Entry<Erwthsh, Double> entry : sortedCorrectAnswersPercentagePerQuestion) {
                            System.out.println(entry.getKey().toString() + ": " + entry.getValue() + "%");
                        }
                        break;
                    }



                    case 8: {
                        // Dhmiourgia hashmap gia thn apothikeush tou posostou twn swstwn apanthsewn ana Ajiologoumeno
                        Map<Ajiologoumenos, Double> correctAnswersPercentagePerAssessee = new HashMap<>();

                        // Ypologismos tou posostou swstwn apanthsewn gia kathe Ajiologoumeno
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
                            // Ypologismos tou posostou kai apothikeush sto hashmap
                            double percentage = totalAnswers > 0 ? ((double) correctAnswers / totalAnswers) * 100 : 0;
                            correctAnswersPercentagePerAssessee.put(ajio, percentage);
                        }

                        // Tajinomhsh tou hashmap vasei tou posostou swstwn apanthsewn
                        List<Map.Entry<Ajiologoumenos, Double>> sortedCorrectAnswersPercentagePerAssessee = new ArrayList<>(correctAnswersPercentagePerAssessee.entrySet());
                        sortedCorrectAnswersPercentagePerAssessee.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

                        // Emfanhsh tou posostou swstwn apanthsewn ana ajiologoumeno
                        System.out.println("Pososto swstwn apanthsewn ana Ajiologoumeno:");
                        for (Map.Entry<Ajiologoumenos, Double> entry : sortedCorrectAnswersPercentagePerAssessee) {
                            System.out.println(entry.getKey().getOnoma() + ": " + entry.getValue() + "%");
                        }
                        break;
                    }


                    case 0:
                        System.out.println("Exiting...");
                        in.close();
                        return;
                }
            }
        }

        catch (Exception e) {
            System.out.println("Lathos epilogh to MENU den diathetei auth thn epilogh");
        }

    }

}
