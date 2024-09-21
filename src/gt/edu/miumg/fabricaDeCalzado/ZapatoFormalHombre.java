package gt.edu.miumg.fabricaDeCalzado;

public class ZapatoFormalHombre implements Zapato{

    @Override
    public String getMaterialSuela() {
        return "Cuero rigido para hombre";
    }

    @Override
    public String getTipoTejido() {
        return "Cuero elegante para hombre";
    }

    @Override
    public String getDiseño() {
        return "Diseño formal para hombre";
    }
}
