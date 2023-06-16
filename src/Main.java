
/*
En este ejercicio practicarás las estructuras de control, para ello deberás crear:
Usando un if, crear una condición que compare si la variable numero If es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
Crea un bucle While, este bucle tendrá que tener como condición que la variable
numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
Incrementar el valor de la variable en uno cada vez que se ejecute.
Mostrarlo por pantalla cada vez que se ejecute.
Para el bucle Do While, deberás crear la misma
estructura que en el While, pero solo se debe ejecutar una vez.
Para el bucle For, crea una variable numeroFor, esta variable
tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando
en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
Por último, para el Switch, deberás crear la variable estacion, y distintos
case para las cuatro estaciones del año.
Dependiendo del valor de la variable estacion se deberá mandar un mensaje
por consola informando de la estación en la que está. También habrá que poner un
default para cuando el valor de la variable no sea una estación.
 */



public class Main {
    public static void main(String[] args) {
        condicionalIf(5);
        condicionalWhile(1);
        condicionalDoWhile(6);
        condicionalFor();
        condicionalSwitch(3);



    }
    //Punto 1
    public static void condicionalIf(int numero) {
        if (numero > 0) {
            System.out.println("El numero es positivo");
        } else if (numero < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es 0");
        }
    }
    //Punto 2
    public static void  condicionalWhile(int numeroWhile) {
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("La variable numeroWhile vale: "+numeroWhile);
        }
    }
    //Punto 3
    public static void condicionalDoWhile(int numeroDoWhile) {
        do{
            numeroDoWhile++;
            System.out.println("La variable numeroDoWhile vale: "+numeroDoWhile);

        }while(numeroDoWhile < 1);

    }

    //Punto 4
    public static void condicionalFor() {
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("El valor de numeroFor es: "+numeroFor);

        }

    }
    //Punto 5
    public static void condicionalSwitch(int estacion) {
        switch (estacion) {
            case 1:
                System.out.println("La estacion es primavera");
                break;
            case 2:
                System.out.println("La estacion es verano");
                break;
            case 3:
                System.out.println("La estacion es otoño");
                break;
            case 4:
                System.out.println("La estacion es invierno");
                break;
            default:
                System.out.println("La estacion no existe");
        }
    }














}