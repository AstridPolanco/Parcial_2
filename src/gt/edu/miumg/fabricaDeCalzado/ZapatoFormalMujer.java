package gt.edu.miumg.fabricaDeCalzado;

public class ZapatoFormalMujer implements Zapato{

    @Override
    public String getMaterialSuela() {
        return "Cuero rigido para mujer";
    }

    @Override
    public String getTipoTejido() {
        return "Cuero elegante para mujer";
    }

    @Override
    public String getDiseño() {
        return "Diseño formal para mujer";
    }
}
