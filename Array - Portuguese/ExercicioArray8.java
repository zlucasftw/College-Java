public class ExercicioArray8 {
    public static void main(String[] args) {

        float soma, media;

        soma = 0;

        float[] numeros = {2.5f, 8.6f, 9.5f, 5.4f, 7.9f};

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        media = soma / 5;

        System.out.print(media);

    }
}
