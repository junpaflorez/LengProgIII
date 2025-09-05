
import java.util.Scanner;

public class Practica1{

    public void saludo(){
        System.out.println("Hola soy un saludo");
    }
    
    public void trianguloInvertido(Integer size){
        for (int fila = 1; fila <= size; fila++) {
            for (int columna = 1; columna <= size - fila ; columna++) {
                System.out.print("*"); 
            }
            System.out.println("");
        }
    }

    public void triangulo(Integer size){
        for (int fila = 1; fila <= size; fila++) {
            for (int columna = 1; columna <= fila ; columna++) {
                System.out.print("*"); 
            }
            System.out.println("");
        }
    }

    public Integer suma(Integer numero1, Integer numero2){
        return numero1 + numero2;
    }

    public static void metodoStatico(){
        System.out.println("Soy un metodo estatico");
    }

    public static void main(String[] args){
        System.out.println("hola mundo");
        Practica1 practica1 = new Practica1();
        practica1.saludo();
        practica1.triangulo(7);
        Integer resultado = practica1.suma(3,5);
        System.out.println("el resultado es: " + resultado);
        metodoStatico();
        Utils utils = new Utils();
        System.out.print(utils.horaFeliz());


        System.out.println();
        Conejo rabbit = new Conejo();
        rabbit.pintarConejo();

        rabbit.cambiarCara("(=O.o=)");
        System.out.println("Escribe tu nombre para ser saludado");
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();
        rabbit.saludo(nombre);
        rabbit.pintarConejo();
    }

}
