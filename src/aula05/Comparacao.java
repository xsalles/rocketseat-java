package aula05;

public class Comparacao {
    public static void main(String[] args) {
        Integer i1 = 128;
        Integer i2 = 128;

        System.out.println(i1 == i2); // false: Aponta para as referências deles

        System.out.println(i1.equals(i2)); // true: aponta para o valor dos objetos
    }
}
