package aula02;

public class TiposWrapper {
    public static void main(String[] args) {
        double numeroDouble = 3.14;
        int numeroInt = (int) numeroDouble; // Erro de compilação, precisamos fazer um cast explicito

        System.out.println(numeroInt);

        // Transformar de String Wrapper para Int Wrapper

        String numeroStr = "123";

        Integer numeroConvertido = Integer.valueOf(numeroStr);

    }
}
