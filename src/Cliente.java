import gt.edu.miumg.fabricaDeCalzado.FabricaDeZapatos;
import gt.edu.miumg.fabricaDeCalzado.FabricaZapatosHombre;
import gt.edu.miumg.fabricaDeCalzado.FabricaZapatosMujer;
import gt.edu.miumg.fabricaDeCalzado.FabricaZapatosNiño;
import gt.edu.miumg.fabricaDeCalzado.Zapato;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Cliente {
    public static void main(String[] args) {
        // Crear fábricas para hombres, mujeres y niños
        FabricaDeZapatos fabricaHombre = new FabricaZapatosHombre();
        FabricaDeZapatos fabricaMujer = new FabricaZapatosMujer();
        FabricaDeZapatos fabricaNiño = new FabricaZapatosNiño();

        // Crear zapatos deportivos y formales para diferentes clientes
        Zapato zapatoDeportivoHombre = fabricaHombre.crearZapatoDeportivo();
        Zapato zapatoFormalHombre = fabricaHombre.crearZapatoFormal();

        Zapato zapatoDeportivoMujer = fabricaMujer.crearZapatoDeportivo();
        Zapato zapatoFormalMujer = fabricaMujer.crearZapatoFormal();

        Zapato zapatoDeportivoNiño = fabricaNiño.crearZapatoDeportivo();
        Zapato zapatoFormalNiño = fabricaNiño.crearZapatoFormal();

        // Mostrar los detalles de los zapatos creados
        System.out.println("Zapato Deportivo Hombre: " + zapatoDeportivoHombre.getDiseño());
        System.out.println("Zapato Formal Hombre: " + zapatoFormalHombre.getDiseño());

        System.out.println("Zapato Deportivo Mujer: " + zapatoDeportivoMujer.getDiseño());
        System.out.println("Zapato Formal Mujer: " + zapatoFormalMujer.getDiseño());

        System.out.println("Zapato Deportivo Niño: " + zapatoDeportivoNiño.getDiseño());
        System.out.println("Zapato Formal Niño: " + zapatoFormalNiño.getDiseño());
    }
}