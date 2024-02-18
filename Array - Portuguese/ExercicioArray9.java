public class ExercicioArray9 {
    public static void main(String[] args) {

        int potencia;

        int[] numeros = {2, 4, 5, 2, -1};

        for (int i = 0; i < numeros.length; i++) {
            potencia = numeros[i] * numeros[i];
            System.out.print(potencia + " ");
        }
    }
}
