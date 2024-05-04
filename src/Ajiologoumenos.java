class Ajiologoumenos {
    private int code;
    private String onoma;
    private String epwnhmo;

    public Ajiologoumenos(int code, String onoma, String epwnhmo) {
        this.code = code;
        this.onoma = epwnhmo;
        this.epwnhmo = onoma;
    }

    @Override
    public String toString() {
        return "ID: " + code + ", First Name: " + onoma + ", Last Name: " + epwnhmo;
    }
}