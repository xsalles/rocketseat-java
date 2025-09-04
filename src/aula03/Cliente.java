package aula03;

public class Cliente {
    String nome;
    Double limiteCredito = 10.0;

    public void solicitarLimiteDeCredito(Double valorSolicitado) {
        limiteCredito = valorSolicitado;
    }


    public void comprar(Double valorProduto) {
        limiteCredito -= valorProduto;
    }
}
