package omar.cursos.practicas;

public class Main {

    public static void main(String[] args) {

        final short enteroCorto = 120; //32767;

        int enteroNormal = 3023;
        long enteroLargo;
        float decimalCorto = 24.45f;
        double decimalLargo = 23.355343434;
        char caracter = 'a';
        boolean esValido = true;



        enteroNormal = 14 % 2; //Modulo es el residuo
        enteroLargo = 500L;

        nuevoTema("Variables y constantes");
        System.out.println(enteroCorto);
        System.out.println(enteroNormal);
        System.out.println(enteroLargo);
        System.out.println(decimalCorto);
        System.out.println(decimalLargo);
        System.out.println(caracter);
        System.out.println(esValido);





        // Arreglos
        String[] nombres = new String[]{"Omar", "Mary", "Ricardo", "Claudia"};

        /*System.out.println();
        System.out.println("Arreglos:");*/
        nuevoTema("Arreglos");
        System.out.println(nombres[0]);
        System.out.println(nombres[1]);
        System.out.println(nombres[2]);
        System.out.println(nombres[3]);




        // Ciclos y condiciones
        /*System.out.println();
        System.out.println("Ciclos y condiciones:");*/
        nuevoTema("Ciclos y condiciones");

        if(enteroLargo > 1000){
            System.out.println("enteroLargo es mayor");
        }else if (enteroLargo == 500) {
            System.out.println("Es igual");
        } else {
            System.out.println("enteroLargo no es mayor");
        }





        // Operador ternario
        System.out.println(enteroLargo > 1000? "Es mayor" : "No es mayor");




        // for
        for (int i = 0; i<3; i++){
            System.out.println("Posicion: " + i);
        }

        // for each
        for (String nombre : nombres){
            System.out.println(nombre);
        }




        // switch
        /*System.out.println();
        System.out.println("Switch:");*/

        nuevoTema("Switch");

        int index = (int)(Math.random() *5);
        String nombreAleatorio = index < 4? nombres[index] : "Anonimo";
        System.out.println("El valor de index: " + index);
        switch (nombreAleatorio){
            case "Omar":
                System.out.println("Soy yo");
                break;
            case "Mary":
            case "Ricardo":
            case "Claudia":
                System.out.println("Es: " + nombreAleatorio);
                break;
            default:
                System.out.println("Esta persona no existe en nuestro listado.");

        }




    }// Fin metodo Main



    //Metodo
    public static void nuevoTema(String title){
        System.out.println("\n\n=====>" + title + ":");
    }

}





























