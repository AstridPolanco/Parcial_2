package gt.edu.miumg.fabricaDeCalzado;

public class ZapatoDeportivoHombre implements Zapato{

    @Override
    public String getMaterialSuela() {
        return "Goma flexible para hombre";
    }

    @Override
    public String getTipoTejido() {
        return "Malla transpirable para hombre";
    }

    @Override
    public String getDiseño() {
        return "Diseño deportivo para hombre";
    }
}
