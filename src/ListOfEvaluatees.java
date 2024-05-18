import java.util.ArrayList;

public class ListOfEvaluatees extends ArrayList<Evaluatee> {
    
    boolean codeIsUnique(int code) {
        for(Evaluatee A : this) {
            if (A.getCode() == code) {
                return false;
            } 
        }
        return true;
    }

    Evaluatee getEvaluatee(int code){
        for (Evaluatee ev : this) {
            if(ev.getCode() == code) {
                return ev;
            }
        }
        return null;
    }
}

