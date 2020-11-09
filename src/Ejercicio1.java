import java.util.*;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Que dia de la semana quieres consultar? ");
        int diaSemana = consola.nextInt();
        switch(diaSemana){
            case 1: case 2: case 4:
                System.out.println("Tienes FOL a primera hora");
                break;
            case 3:
                System.out.println("Tienes PROGRAMACION a primera hora");
                break;
            case 5:
                System.out.println("Tienes COMPUTER SYSTEMS a primera hora");
                break;
            default:
                System.out.println("No se reconoce ese dia como dia lectivo");
        }
    }
}
