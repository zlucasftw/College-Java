import java.util.Scanner;

public class ExercicioArray10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeros, numeroDigitado;

        System.out.print("Quantos números serão lidos? ");
        numeros = sc.nextInt();

        int[] arrayNumeros = new int[numeros];

        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.print("Digite um número: ");
            numeroDigitado = sc.nextInt();
            arrayNumeros[i] = numeroDigitado;
        }

        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.print(arrayNumeros[i] + " ");
        }

        sc.close();
    }
}
