import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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

        // Ερώτηση πολλαπλής επιλογής
        Lista_Erwthsewn.add(new Erwthsh(1, "Ποιος είναι ο πρωταθλητής του ΝΒΑ το 2023;", Tupoi_Erwthsewn.MULTIPLE_CHOICE, Arrays.asList("James", "Carry", "Antetokounmpo")));
        Lista_Erwthsewn.add(new Erwthsh(2, "Ποιο από τα παρακάτω είναι ζώο;", Tupoi_Erwthsewn.MULTIPLE_CHOICE, Arrays.asList("Patata", "Peristeri", "Pizza")));
        Lista_Erwthsewn.add(new Erwthsh(3, "Ποιο από τα παρακάτω δεν είναι φρούτο;", Tupoi_Erwthsewn.MULTIPLE_CHOICE, Arrays.asList("Mhlo", "Patata", "Portokali")));

        // Ερώτηση με μονή λέξη ως απάντηση
        Lista_Erwthsewn.add(new Erwthsh(4, "Ποιος είναι ο προπονητής της ομάδας Ρεάλ Μαδρίτης;", Tupoi_Erwthsewn.SINGLE_WORD, Arrays.asList("Zidane")));
        Lista_Erwthsewn.add(new Erwthsh(5, "Ποιος είναι ο υπάρχον πρόεδρος των Ηνωμένων Πολιτειών;", Tupoi_Erwthsewn.SINGLE_WORD, Arrays.asList("Mpainten")));
        Lista_Erwthsewn.add(new Erwthsh(6, "Ποια είναι η πρωτεύουσα της Ιταλίας;", Tupoi_Erwthsewn.SINGLE_WORD, Arrays.asList("Rwmh")));

        // Ερώτηση με κενά
        Lista_Erwthsewn.add(new Erwthsh(7, "Ο ________ είναι η μεγαλύτερη λίμνη στον κόσμο.", Tupoi_Erwthsewn.FILL_IN_THE_BLANKS, Arrays.asList("Kaspias")));
        Lista_Erwthsewn.add(new Erwthsh(8, "Ο ________ είναι ο πλανήτης που βρίσκεται πιο κοντά στον ήλιο.", Tupoi_Erwthsewn.FILL_IN_THE_BLANKS, Arrays.asList("Ermhs")));
        Lista_Erwthsewn.add(new Erwthsh(9, "Το χρώμα του ουρανού κατά τη διάρκεια της ημέρας είναι ________.", Tupoi_Erwthsewn.FILL_IN_THE_BLANKS, Arrays.asList("Mple","Kokkino?")));


        // Δημιουργία λίστας απαντήσεων
        List<Apanthsh> Lista_Apanthsewn = new ArrayList<>();
        Ajiologoumenos sampleAssessee = Lista_Ajiologoumenwn.get(0); // Παράδειγμα αξιολογουμένου
        Erwthsh sampleQuestion = Lista_Erwthsewn.get(0); // Παράδειγμα ερώτησης
        Lista_Apanthsewn.add(new Apanthsh(sampleAssessee, sampleQuestion, "Sample Response"));

        try(Scanner in = new Scanner(System.in)) {
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

                int choice = in.nextInt();
                in.nextLine(); //fix to bug me to extra \n

                if (choice == 1) {
                    System.out.print("Code: ");
                    int Code = in.nextInt();
                    System.out.print("Onoma: ");
                    String Onoma = in.nextLine();
                    System.out.print("Epwnhmo: ");
                    String Epwnhmo = in.nextLine();
                    Ajiologoumenos ajiologoumenos = new Ajiologoumenos(Code,Onoma,Epwnhmo);
                    Lista_Ajiologoumenwn.add(ajiologoumenos);
                }

                else if (choice == 2) {

                }

                else if (choice == 3) {

                }

                else if (choice == 4) {

                }

                else if (choice == 5) {

                }

                else if (choice == 6) {

                }

                else if (choice == 7) {

                }

                else if (choice == 8) {

                }

                else if (choice == 0) {
                    break;
                }

            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}