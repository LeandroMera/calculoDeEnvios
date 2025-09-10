import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Mayorista
        //Menos de 5 paquetes NO VENDE
        //Entre 5 / 15 sale 10usd el envio
        //Mas de 15usd Envio Gratis


        int cantidadDePaquetes;
        double cantidadTotal, diferencia;
        Scanner tcl = new Scanner(System.in);

        //Preguntar cuantos paquetes son
        System.out.println("Ingrese la cantidad de paquetes: ");
        cantidadDePaquetes = tcl.nextInt();

        //evalucaion de los casos
        if(cantidadDePaquetes < 5){
            if(cantidadDePaquetes < 0){
                System.out.println("No numeros negativos");
            }
            System.out.printf("No se permiten ventas al por menor");
        } else{

            System.out.println("Ingrese el monto total de la compra");
            tcl=new Scanner(System.in);
            cantidadTotal = tcl.nextDouble();

            if(cantidadDePaquetes >= 5 && cantidadDePaquetes <= 15){
                System.out.println("El valor de envio es de 10Usd");
            }else{
                System.out.println("El valor de envio es gratis....Gracias vuelva pronto");
            }

            if(cantidadTotal < 100){
                diferencia = 100 - cantidadTotal;
                System.out.println("El monto no aplica las promociones. necesitas comprar: " + diferencia + " para obtener la promo.");
            }
        }
    }
}