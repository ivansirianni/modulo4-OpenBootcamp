public class Main {
    public static void main(String[] args) {
        //ejercicios modulo 4
        //Ex 1 --> usando IF
        int numeroIF = -2;

        if(numeroIF > 0){
            System.out.println("El número " + numeroIF + " es positivo");
        } else if(numeroIF < 0){
            System.out.println("El número " + numeroIF + " es negativo");
        } else {
            System.out.println("El número " + numeroIF + " es neutro");
        }

        //ex 2 --> Usando WHILE
        int numeroWhile = 0;
        System.out.println("El numeroWhile es menor que 3, vamos a sumar de 1 en 1 hasta 3");
        while(numeroWhile < 3){
            numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);
        }

        //ex 3 --> Usando DO WHILE
        System.out.println("Voy de 0 a 3 ejecutando solo una vez");
        do{
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 3;
        } while(numeroWhile < 3);

        //ex 4 -- Usando BUCLE FOR
        int numeroFor[] = {1, 2, 3};

        System.out.println("numeroFor es menor que 3, se ejecutará de 1 en 1 hasta llegar a 3");
        for(int i = 0; i < numeroFor.length; i++){
            System.out.println(numeroFor[i]);
        }

        //ex 5 --> Usando SWITCH CASE
        var estacion = "Elefante";

        System.out.println("Estaciones, switch cases. Que estacion es?");
        switch(estacion){
            case "verano":
                System.out.println("Es verano");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println(estacion + "? <-- Esa no es una estacion del año, por favor reviselo");
                break;
        }
    }
}