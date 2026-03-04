
public class ArrayFrecuencia {
    public static void main(String[] args) {
        int[] repetidos = new int[10];
        int[] frecuencia = new int[10];

        //introducimos valores random al array
        for (int i = 0; i < repetidos.length; i++) {
            repetidos[i] =(int) (Math.random()*9);
        }

        //lo mostramos
        System.out.println("Array:");

        for (int i = 0; i < repetidos.length; i++) {
            System.out.print(repetidos[i] + " ");
        }

        System.out.println();

        //si el valor del array es igual a la posicion que estamos mirando, el contador sube
        for (int i = 0; i < frecuencia.length; i++) {
            int contador = 0;
            for (int j = 0; j < repetidos.length; j++) {
                if (repetidos[j] == i) {
                    contador++;
                }
            }
            //cuando ya hemos comprobado todos lo añadimos a freciuencia
            frecuencia[i] = contador;
        }

        //mostramos el array de la frecuencia
        System.out.println("Frecuencia:");
        for (int i = 0; i < frecuencia.length; i++) {
            System.out.print(frecuencia[i] + " ");
        }
    }
}