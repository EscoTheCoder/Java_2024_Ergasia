import java.util.List;

public class Question{
    private int code;
    private String perigrafh;
    int type = 0;
    

    public Question(int code, String perigrafh) {
        this.code = code;
        this.perigrafh = perigrafh;
    }

    public int getCode() {
        return code;
    }

    public String getPerigrafh() {
        return perigrafh;
    }


    @Override
    public String toString() {
        return "Code: " + code + ", Description: " + perigrafh;
    }
}
