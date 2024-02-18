public class ExercicioArray7 {
    public static void main(String[] args) {

        int pares = 2;

        int[] inteiro = new int[100];

        for (int i = 0; i < inteiro.length; i++) {
            inteiro[i] = pares;
            System.out.print(inteiro[i] + " ");
            pares += 2;
        }
    }
}
