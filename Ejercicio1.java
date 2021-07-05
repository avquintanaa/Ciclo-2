import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = scanner.nextLine();
        System.out.println("Hola " + nombre);
    }
    
    //Crear funciones
    public static String saludar(String nombre){
        return "Hola " + nombre;
    }



}
