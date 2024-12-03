import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.println("Dime un numero:");
        int a = teclado.nextInt();
        System.out.println("Dime el siguiente numero:");
        int b = teclado.nextInt();
        int multiplicacion= a*b;
        System.out.println("Resultado de la multiplicacion es= "+ multiplicacion);
        float div= a/b;
        System.out.println("Resultado de la division es= "+ div);
        teclado.close();
    }
}
