package gt.edu.miumg.fabricaDeCalzado;

public class FabricaZapatosNiño implements FabricaDeZapatos{

    @Override
    public Zapato crearZapatoDeportivo() {
        return new ZapatoDeportivoNiño();
    }

    @Override
    public Zapato crearZapatoFormal() {
        return new ZapatoFormalNiño();
    }
}
