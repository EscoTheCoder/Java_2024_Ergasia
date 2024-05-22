//Omada Xrhswtwn 012
//p3230173 - p3230170

import java.util.*;

public class mainApp {
    public static void main(String[] args) {
        // Creating Evaluatee list
        ListOfEvaluatees EvaluateesList = new ListOfEvaluatees();
        EvaluateesList.add(new Evaluatee(1, "Nikolas", "P"));
        EvaluateesList.add(new Evaluatee(2, "Stavros", "R"));
        EvaluateesList.add(new Evaluatee(3, "Bill", "I"));
        EvaluateesList.add(new Evaluatee(4, "Panos", "S"));

        // Creating Questions list
        ListOfQuestions QuestionsList = new ListOfQuestions();

        // MultipleChoiceQuestion
        QuestionsList.add(new MultipleChoiceQuestion(1, "Poioi einai protathlites NBA?",1, Arrays.asList("James".toUpperCase(), "Carry".toUpperCase(), "Antetokounmpo".toUpperCase()), Arrays.asList(1, 3)));
        QuestionsList.add(new MultipleChoiceQuestion(2, "Poia apo ta parakatw einai zwa?",1, Arrays.asList("Patata".toUpperCase(), "Peristeri".toUpperCase(), "Skulos".toUpperCase()), Arrays.asList(2, 3)));
        QuestionsList.add(new MultipleChoiceQuestion(3, "Poia apo ta parakatw den einai frouta;",1, Arrays.asList("Mhlo".toUpperCase(), "Patata".toUpperCase(), "Portokali".toUpperCase(), "Trapezi".toUpperCase()), Arrays.asList(2, 4)));

        // SingleChoiceQuestion
        QuestionsList.add(new SingleChoiceQuestion(4, "Poios einai o proponhths ths REAL MADRITIS?",2, "Zidane".toUpperCase()));
        QuestionsList.add(new SingleChoiceQuestion(5, "Poios einai o Prothipourgos ths Amerikhs?",2, "Biden".toUpperCase()));
        QuestionsList.add(new SingleChoiceQuestion(6, "Poia einai h Prwtevousa ths Italias?",2, "Rome".toUpperCase()));

        // Erwthsh_SumplhrwshKenwn
        QuestionsList.add(new CorrectOrderQuestion(7, "H ? einai h megalhterh ? ston kosmo.",3, Arrays.asList("Kaspias".toUpperCase(), "Limnh".toUpperCase()), Arrays.asList("Kaspias".toUpperCase(), "Limnh".toUpperCase())));
        QuestionsList.add(new CorrectOrderQuestion(8, "O ? einai o ? pou vrisketai pio konta ston Hlio.",3, Arrays.asList("Planhths".toUpperCase(), "Ermhs".toUpperCase()), Arrays.asList("Ermhs".toUpperCase(), "Planhths".toUpperCase())));
        QuestionsList.add(new CorrectOrderQuestion(9, "To ? tou ouranoun thn hmera einai ? .", 3,Arrays.asList("Mple".toUpperCase(), "Xrwma".toUpperCase()), Arrays.asList("Xrwma".toUpperCase(), "Mple".toUpperCase())));


        // CorrectOrderQuestion
        List<Answer> Lista_Apanthsewn = new ArrayList<>();

        try (Scanner in = new Scanner(System.in)) {
            for (; ; ) {
                System.out.println("\n1. Add new Evaluatee: ");
                System.out.println("2. Add new Question: ");
                System.out.println("3. Add new Answer: ");
                System.out.println("4. Show List of Questions: ");
                System.out.println("5. Show the answers of an Evaluatee: ");
                System.out.println("6. Show each evaluatee's number of CorrectAnswers/answers: ");
                System.out.println("7. Percentage of a question answered correctly: ");
                System.out.println("8. Correct answers per evaluatee: ");
                System.out.println("0. Exit\n");

                System.out.print(">");
                int choice = in.nextInt();
                in.nextLine(); //fix to bug me to extra \n

                switch (choice) {

                    case 1: {
                        System.out.println("Select a unique code");
                        System.out.print("Code: ");
                        int Code = in.nextInt();
                        while(!EvaluateesList.codeIsUnique(Code)) {
                            System.out.println("Invalid.Code already exists,try another.");
                            System.out.print("Code: ");
                            Code = in.nextInt();
                        }

                        in.nextLine(); //fix to bug me to extra \n
                        System.out.print("Name: ");
                        String Onoma = in.nextLine();
                        System.out.print("Surname: ");
                        String Epwnhmo = in.nextLine();
                        Evaluatee evaluatee = new Evaluatee(Code, Onoma, Epwnhmo);
                        EvaluateesList.add(evaluatee);
                        break;
                    }




                    case 2: {
                        int type;
                        System.out.println("Select Question type:");
                        System.out.println("1)Multiple Choice Question");
                        System.out.println("2)Single Word Question");
                        System.out.println("3)Correct Order Question");
                        System.out.println("Select a number from 1 to 3.");
                        System.out.println("Type: ");
                        type = in.nextInt();
                        //Guarantee one of the choices
                        while (type <1 && type > 3) {
                            System.out.println("Select Question type:");
                            System.out.println("1)Multiple Choice Question");
                            System.out.println("2)Single Word Question");
                            System.out.println("3)Correct Order Question");
                            System.out.println("Select a number from 1 to 3.");
                            System.out.println("Type: ");
                            type = in.nextInt();
                        }

                        System.out.println("Select a unique code");
                        System.out.print("Code: ");
                        int Code = in.nextInt();
                        while(QuestionsList.codeIsUnique(Code)){
                            System.out.println("Code must be unique");
                            System.out.print("Code: ");
                            Code = in.nextInt();
                        }

                        in.nextLine(); //fix to bug me to extra \n
                        System.out.print("Description: ");
                        String description = in.nextLine();
                        QuestionsList.addExercise(Code, description, type);



                        break;
                    }




                    case 3: {
                        // Emfanishs Listas Ajiologoumenwn
                        System.out.println("Available Evaluatee's:");
                        for (Evaluatee ajio : EvaluateesList) {
                            System.out.println(ajio.toString());
                        }

                        // Epilogh Ajiologoumenou
                        System.out.print("Choose Evaluatee (code): ");
                        int selectedEvaluateeCode = in.nextInt();
                        in.nextLine(); // new line bug

                        Evaluatee selectedEvaluatee = null;
                        selectedEvaluatee = EvaluateesList.getEvaluatee(selectedEvaluateeCode);

                        if (selectedEvaluatee == null) {
                            System.out.println("Wrong Code.");
                            break;
                        }

                        // Emfanish Diathesimwn Erwthsewn
                        System.out.println();
                        System.out.println("Available Questions:");
                        for (Question question : QuestionsList) {
                            System.out.println(question.toString());
                        }

                        // Epilogh Erwthshs
                        System.out.println();
                        System.out.print("Select Question by typing its code: ");
                        int selectedQuestionCode = in.nextInt();
                        in.nextLine(); // Ανάγνωση newline

                        Question selectedQuestion = null;
                        selectedQuestion = QuestionsList.getQuestion(selectedQuestionCode);

                        if (selectedQuestion == null) {
                            System.out.println("Wrong Question Code.");
                            break;
                        }
                        //System.out.println(selectedQuestion.type);
                        // Emfanish epilogwn analoga me ton tupo ths Erwthshs
                        if (selectedQuestion.type ==1 || selectedQuestion.type ==3) {
                            // Erwthsh_PollaplhsEpiloghs H Erwthsh_SumplhrwshKenwn
                            System.out.println("Available Chooses:");
                            List<Object> options = selectedQuestion instanceof MultipleChoiceQuestion ?
                                    ((MultipleChoiceQuestion) selectedQuestion).getApanthseis() :
                                    ((CorrectOrderQuestion) selectedQuestion).getLista_lejewn();
                            for (Object option : options) {
                                System.out.println(option.toString());
                            }
                        }

                        // Eisagwgh apanthshs analoga me ton tupo ths Erwthshs

                        if (selectedQuestion.type == 1) {
                            // Erwthsh_PollaplhsEpiloghs
                            MultipleChoiceQuestion question_pollaplhs = (MultipleChoiceQuestion) selectedQuestion;
                            List<Object> options = question_pollaplhs.getApanthseis();
                            List<Object> answers = new ArrayList<>();
                            String option;
                            System.out.println("Enter your answer (Type '.' to finish): ");
                            while (!(option = in.nextLine()).equals(".")) {
                                try {
                                    int answerNumber = Integer.parseInt(option);
                                    if (answerNumber >= 1 && answerNumber <= options.size()) {
                                        answers.add(answerNumber);
                                    } else {
                                        System.out.println("Invalid choice. Try again.");
                                    }
                                } catch (NumberFormatException e) {
                                    System.out.println("Please enter a valid number.");
                                }
                            }
                            Lista_Apanthsewn.add(new Answer(selectedEvaluatee, selectedQuestion, answers));
                        }
                        else if (selectedQuestion.type ==3) {
                            // Erwthsh sumplhrwshs kenwn
                            CorrectOrderQuestion question = (CorrectOrderQuestion) selectedQuestion;
                            List<Object> options = question.getLista_lejewn();
                            List<Object> answers = new ArrayList<>();
                            String option;
                            System.out.println("Select the answer in the correct order: ");
                            while (answers.size()<options.size()) {
                                option=in.nextLine().toUpperCase();
                                if (options.contains(option)) {
                                    answers.add(option);
                                } else {
                                    System.out.println("Invalid option");
                                }
                            }
                            Lista_Apanthsewn.add(new Answer(selectedEvaluatee, selectedQuestion, answers));
                        }

                        else if (selectedQuestion.type == 2) {
                            // Erwthsh me monh lejh ws apanthsh
                            System.out.print("Enter your answer: ");
                            String answer = in.nextLine().toUpperCase();
                            Lista_Apanthsewn.add(new Answer(selectedEvaluatee, selectedQuestion, answer));
                        }
                        else {
                            System.out.println("Unsupported question type.");
                        }
                        break;
                    }




                    case 4: {
                        for(Question q : QuestionsList){
                            System.out.println(q.toString());
                        }
                        System.out.println();
                        break;
                    }



                    case 5: {
                        System.out.println("Available Evaluatee's:");
                        for (Evaluatee ajio : EvaluateesList) {
                            System.out.println(ajio.toString());
                        }

                        //Epilogh Ajiologoumenou
                        System.out.println();
                        System.out.print("Choose Evaluatee (code): ");
                        int Code_Ajiologoumenou = in.nextInt();
                        in.nextLine(); // bug me to \n


                        Evaluatee SelectedEvaluatee = null;
                        SelectedEvaluatee = EvaluateesList.getEvaluatee(Code_Ajiologoumenou);

                        if (SelectedEvaluatee == null) {
                            System.out.println("Wrong Code.");
                        }
                        else {
                            // Emfanhsh apanthsewn twn Ajiologoumenwn
                            System.out.println();
                            System.out.println("Answers of " + SelectedEvaluatee.getOnoma() + ":");
                            for (Answer answer : Lista_Apanthsewn) {
                                if (answer.getEvaluatee().equals(SelectedEvaluatee)) {
                                    System.out.println(answer);
                                }
                            }
                        }
                        break;
                    }



                    case 6: {
                        Map<Evaluatee, Integer> correctAnswersCountPerEvaluatee = new HashMap<>();

                        for (Evaluatee ajio : EvaluateesList) {
                            int correctAnswersCount = 0;
                            for (Answer answer : Lista_Apanthsewn) {
                                if (answer.getEvaluatee().equals(ajio) && answer.isCorrect()) { //isCorrect() method tis class Apanthsh
                                    correctAnswersCount++;
                                }
                            }
                            correctAnswersCountPerEvaluatee.put(ajio, correctAnswersCount);
                        }

                        List<Map.Entry<Evaluatee, Integer>> sortedCorrectAnswersCountPerEvaluatee = new ArrayList<>(correctAnswersCountPerEvaluatee.entrySet());
                        sortedCorrectAnswersCountPerEvaluatee.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

                        System.out.println("Correct Answers Per Evaluatee:");
                        for (Map.Entry<Evaluatee, Integer> entry : sortedCorrectAnswersCountPerEvaluatee) {
                            System.out.println(entry.getKey().getOnoma() + ": " + entry.getValue());
                        }
                        break;
                    }



                    case 7: {
                        // Dhmiourgis hashmap gia thn apothikeush tou posostou twn swstws apanthsewn ana erwthsh
                        Map<Question, Double> correctAnswersPercentagePerQuestion = new HashMap<>();

                        // Ypologismos tou posostou swstwn apanthsewn gia kathe xrhsth
                        for (Question question : QuestionsList) {
                            int totalAnswers = 0;
                            int correctAnswers = 0;
                            for (Answer answer : Lista_Apanthsewn) {
                                if (answer.getQuestion().equals(question)) {
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
                        List<Map.Entry<Question, Double>> sortedCorrectAnswersPercentagePerQuestion = new ArrayList<>(correctAnswersPercentagePerQuestion.entrySet());
                        sortedCorrectAnswersPercentagePerQuestion.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

                        // Emfanhsh tou posostou swstwn apanthsewn ana erwthsh
                        System.out.println("Pososto swstwn apanthsewn ana erwthsh:");
                        for (Map.Entry<Question, Double> entry : sortedCorrectAnswersPercentagePerQuestion) {
                            System.out.println(entry.getKey().toString() + ": " + entry.getValue() + "%");
                        }
                        break;
                    }



                    case 8: {
                        // Dhmiourgia hashmap gia thn apothikeush tou posostou twn swstwn apanthsewn ana Ajiologoumeno
                        Map<Evaluatee, Double> correctAnswersPercentagePerEvaluatee = new HashMap<>();

                        // Ypologismos tou posostou swstwn apanthsewn gia kathe Ajiologoumeno
                        for (Evaluatee ajio : EvaluateesList) {
                            int totalAnswers = 0;
                            int correctAnswers = 0;
                            for (Answer answer : Lista_Apanthsewn) {
                                if (answer.getEvaluatee().equals(ajio)) {
                                    totalAnswers++;
                                    if (answer.isCorrect()) {
                                        correctAnswers++;
                                    }
                                }
                            }
                            // Ypologismos tou posostou kai apothikeush sto hashmap
                            double percentage = totalAnswers > 0 ? ((double) correctAnswers / totalAnswers) * 100 : 0;
                            correctAnswersPercentagePerEvaluatee.put(ajio, percentage);
                        }

                        // Tajinomhsh tou hashmap vasei tou posostou swstwn apanthsewn
                        List<Map.Entry<Evaluatee, Double>> sortedCorrectAnswersPercentagePerEvaluatee = new ArrayList<>(correctAnswersPercentagePerEvaluatee.entrySet());
                        sortedCorrectAnswersPercentagePerEvaluatee.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

                        // Emfanhsh tou posostou swstwn apanthsewn ana ajiologoumeno
                        System.out.println("Percentage of correct answers per Evaluatee:");
                        for (Map.Entry<Evaluatee, Double> entry : sortedCorrectAnswersPercentagePerEvaluatee) {
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