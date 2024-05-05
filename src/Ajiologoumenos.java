class Ajiologoumenos {
    private int code;
    private String onoma;
    private String epwnhmo;

    public Ajiologoumenos(int code, String onoma, String epwnhmo) {
        this.code = code;
        this.onoma = onoma;
        this.epwnhmo = epwnhmo;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getOnoma() {
        return onoma;
    }

    public void setOnoma(String onoma) {
        this.onoma = onoma;
    }

    public String getEpwnhmo() {
        return epwnhmo;
    }

    public void setEpwnhmo(String epwnhmo) {
        this.epwnhmo = epwnhmo;
    }

    @Override
    public String toString() {
        return "ID: " + code + ", First Name: " + onoma + ", Last Name: " + epwnhmo;
    }
}