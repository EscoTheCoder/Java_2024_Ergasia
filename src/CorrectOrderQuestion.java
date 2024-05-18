import java.util.List;

public class CorrectOrderQuestion extends Question {

    List<Object> lista_lejewn;
    List<Object> lista_lejewn_swsth_seira;
   

    public CorrectOrderQuestion(int code, String perigrafh, int t,List<Object> lista_lejewn, List<Object> lista_lejewn_swsth_seira) {
        super(code, perigrafh);
        this.lista_lejewn = lista_lejewn;
        this.lista_lejewn_swsth_seira = lista_lejewn_swsth_seira;
        this.type =3;
    }

    public List<Object> getLista_lejewn() {
        return lista_lejewn;
    }

    public List<Object> getLista_lejewn_swsth_seira() {
        return lista_lejewn_swsth_seira;
    }
}
