package Erwthseis;

import java.util.List;

public class Erwthsh{
    private int code;
    private String perigrafh;


    public Erwthsh(int code, String perigrafh) {
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
        return "Code: " + code + ", Perigrafh: " + perigrafh;
    }
}
