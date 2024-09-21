package gt.edu.miumg.fabricaDeCalzado;

public class FabricaZapatosHombre implements FabricaDeZapatos{

    @Override
    public Zapato crearZapatoDeportivo() {
        return new ZapatoDeportivoHombre();
    }

    @Override
    public Zapato crearZapatoFormal() {
        return new ZapatoFormalHombre();
    }
}
