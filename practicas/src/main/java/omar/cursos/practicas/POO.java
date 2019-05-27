package omar.cursos.practicas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class POO {

    public static void main(String[] args) {


        //Objetos
        Casa miCasa = new Casa("Independencia", 'd', (short) 32,
                2000000, 1104537600000L, 3.5f,
                320.43455432343, false);

        System.out.println(miCasa);

        Casa maryCasa = new Casa("Reforma", (short) 543, 3500000, true);
        System.out.println(maryCasa);

        Casa claudiaCasa = new Casa("Roma", (short) 12, 1200000, false);
        System.out.println(claudiaCasa);


        //Listas
        Main.nuevoTema("Listas");
        List<Casa> casaList = new ArrayList<>();
        casaList.add(miCasa);
        casaList.add(maryCasa);
        casaList.add(claudiaCasa);

        casaList.remove(1);
        casaList.set(1, miCasa);

        //Imprimiendo Lista
        for (Casa currentCasa : casaList) {
            System.out.println(currentCasa);
        }


        //Diccionarios
        Main.nuevoTema("Diccionarios");
        Map<String, Casa> casaMap = new HashMap<>();
        casaMap.put("omar", miCasa);
        casaMap.put("mary", maryCasa);
        casaMap.put("claudia", claudiaCasa);


        System.out.println(casaMap.size());
        casaMap.remove("omar");
        System.out.println(casaMap.size());


        casaMap.put("mary", claudiaCasa);


        //Imprimiendo diccionario
        System.out.println(casaMap.get("mary"));


        //Herencia
        Main.nuevoTema("Herencia");


        Apartamento apartamentoPlaya = new Apartamento("Malecon", 'B', (short) 101,
                2600000, 1009843200000L, 6.3f,
                180.23424234234, true, (short) 5);

        System.out.println(apartamentoPlaya);


        //Polimorfismo
        Main.nuevoTema("Polimorfismo");

        venderPropiedad(miCasa);
        venderPropiedad(apartamentoPlaya);
        Casa apartamentoCiudad = new Apartamento("Principal", 'f', (short) 913,
                19500000, 1009843200000L, 4.35f,
                145.654, false, (short) 2);
        venderPropiedad(apartamentoCiudad);

        Casa casaNueva = new Casa();
        casaNueva.setCalle("Cortes");
        casaNueva.setHipotecada(true);
        casaNueva.setImpuesto(2.1f);
        System.out.println(casaNueva);


        //Equals y hashCode
        Main.nuevoTema("Equals y hashCode");

        Casa miSegundaCasa = new Casa("Independencia", 'd', (short) 32,
                2000000, 1104537600000L, 3.5f,
                320.43455432343, false);
        System.out.println(miCasa.equals(miSegundaCasa));
        Casa miTerceraCasa = new Casa();
        System.out.println(casaMap.containsValue(claudiaCasa));


    }


    private static void venderPropiedad(Casa casa) {

        if (casa.isHipotecada()) {
            System.out.println("Imposible vender!");
        } else {
            System.out.println("En venta.");
        }

    }


}
