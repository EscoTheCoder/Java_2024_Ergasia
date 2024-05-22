import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ListOfQuestions
 */
public class ListOfQuestions extends ArrayList<Question> {
    Scanner in = new Scanner(System.in);

    boolean codeIsUnique(int code) {
        for (Question q : this) {
            if (q.getCode() == code) {
                return true;
            }
        }
        return false;
    }

    Question getQuestion(int code) {
        for (Question q : this) {
            if (q.getCode() == code) {
                return q;
            }
        }
        return null;
    }

    void addExercise(int code,String description,int type) {
        if (type == 1) {
            List<Object> apanthseis = new ArrayList<>();
            List<Object> swstes_apanthseis = new ArrayList<>();
            String option = "";
            int i = 1;

            System.out.println("Enter your choices (Type '.' to finish): ");
            while (!(option.equals("."))) {
                System.out.print(i + ")");
                option = in.nextLine().toUpperCase();
                if (!option.equals(".")) {
                    apanthseis.add(option);
                }
                i++;
            }

            if (apanthseis.get(0).equals(".")) {
                System.out.println("You can't give ansewers if you dont have some inputs already");
            
            } else {
                System.out.println("Correct answers (With a gap in between): ");
                while(swstes_apanthseis.size()<apanthseis.size()){
                    Integer x = in.nextInt();
                    if(x.equals(0)){
                        break;
                    }
                    else if (x<0 || x>=apanthseis.size()){
                        System.out.println("Error invalid number input");
                    }
                    else {
                        swstes_apanthseis.add(x);
                    }
                }
                this.add(new MultipleChoiceQuestion(code, description, 1, apanthseis, swstes_apanthseis));
            }

        } else if (type == 2) {

            System.out.print("Correct Answer: ");
            String Swsth_Apanthsh = in.nextLine().toUpperCase();
            this.add(new SingleChoiceQuestion(code, description, 2, Swsth_Apanthsh));

        } else {

            List<Object> lista_lejewn = new ArrayList<>();
            List<Object> lista_lejewn_se_swsth_seira = new ArrayList<>();
            String option = "";
            int j = 1;

            System.out.println("Enter your choices (Type '.' to finish): ");
            while (!(option.equals("."))) {
                System.out.print(j + ")");
                option = in.nextLine().toUpperCase();
                if (!option.equals(".")) {
                    lista_lejewn.add(option);
                }
                j++;
            }

            if (lista_lejewn.get(0).equals(".")) {
                System.out.println("You can't give answers if you dont have some inputs already");
            } else {
                System.out.print("Correct Answers (Separated by a space): ");
                while(lista_lejewn_se_swsth_seira.size()<lista_lejewn.size()) {
                    String x = in.nextLine().toUpperCase();
                    if (!lista_lejewn.contains(x)) {
                        System.out.println("Error invalid input");
                    } else {
                        lista_lejewn_se_swsth_seira.add(x.toUpperCase());
                    }
                }
                this.add(new CorrectOrderQuestion(code, description, 3, lista_lejewn, lista_lejewn_se_swsth_seira));
            }
        }
    }
}