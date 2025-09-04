package aula03;

public class Sistema {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Pedro Sales");

        System.out.println(cliente.limiteCredito);

        cliente.solicitarLimiteDeCredito(200.0);

        System.out.println(cliente.limiteCredito);
    }
}
