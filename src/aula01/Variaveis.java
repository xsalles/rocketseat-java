package aula01;

public class Variaveis {
    public static void main(String[] args) {
        String BR = "Brasil";
        BR = "Estados Unidos";
        // aqui ela muda

        final String EUA = "Estados Unidos";
        // com o final, ela se torna constante

        // chamando o metodo somar
        Methods método = new Methods();

        método.somar(1, 1); // 2
    }
}
