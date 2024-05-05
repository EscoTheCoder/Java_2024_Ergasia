package Erwthseis;

import java.util.List;

public class Erwthsh_SumplhrwshKenwn extends Erwthsh{

    List<Object> lista_lejewn;
    List<Object> lista_lejewn_swsth_seira;

    public Erwthsh_SumplhrwshKenwn(int code, String perigrafh, List<Object> lista_lejewn, List<Object> lista_lejewn_swsth_seira) {
        super(code, perigrafh);
        this.lista_lejewn = lista_lejewn;
        this.lista_lejewn_swsth_seira = lista_lejewn_swsth_seira;
    }

    public List<Object> getLista_lejewn() {
        return lista_lejewn;
    }

    public List<Object> getLista_lejewn_swsth_seira() {
        return lista_lejewn_swsth_seira;
    }
}
