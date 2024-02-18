public class ExercicioArray6 {
    public static void main(String[] args) {

        int numeros = 10;

        int[] inteiros = new int[10];

        for (int i = 0; i < inteiros.length; i++) {
            inteiros[i] = numeros;
            System.out.print(inteiros[i] + " ");
            numeros += 10;
        }
    }
}
