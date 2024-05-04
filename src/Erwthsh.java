import java.util.List;

public class Erwthsh {
    private int code;
    private String description;

    public Erwthsh(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public Erwthsh(int code, String description, Tupoi_Erwthsewn tupoiErwthsewn, List<String> list) {
    }

    @Override
    public String toString() {
        return "Code: " + code + ", Description: " + description;
    }
}
