import java.util.Scanner;

public class PalavraInvertida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String palavra = sc.next();
       String[] palavraSub = palavra.split("");
        System.out.println("palavra invertida: ");
        for (int i = (palavraSub.length -1); i >= 0; i--) {
            System.out.print(palavraSub[i]);
        }
    }
}
