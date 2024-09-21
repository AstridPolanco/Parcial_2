package gt.edu.miumg.fabricaDeCalzado;

public class FabricaZapatosMujer implements FabricaDeZapatos{

    @Override
    public Zapato crearZapatoDeportivo() {
        return new ZapatoDeportivoMujer();
    }

    @Override
    public Zapato crearZapatoFormal() {
        return new ZapatoFormalMujer();
    }
}
