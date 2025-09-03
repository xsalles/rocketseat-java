package exercicio01;

import java.time.LocalDate;
import java.util.Scanner;

public class ContaCorrente {
    public Integer numeroDaConta;
    public Integer numeroDaAgencia;
    public String nomeCliente;
    public LocalDate dataNascimento;
    public Double saldoDaConta;


    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setNumeroDaAgencia(Integer numeroDaAgencia) {
        this.numeroDaAgencia = numeroDaAgencia;
    }

    public void setNumeroDaConta(Integer numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public void setSaldoDaConta(Double saldoDaConta) {
        this.saldoDaConta = saldoDaConta;
    }

    public Double getSaldoDaConta() {
        return saldoDaConta;
    }

    public Integer getNumeroDaConta() {
        return numeroDaConta;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public Integer getNumeroDaAgencia() {
        return numeroDaAgencia;
    }

    public double sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Digite um valor válido, por favor");
            return this.getSaldoDaConta();
        }

        if (valor > saldoDaConta) {
            System.out.println("O valor que você quer sacar é maior do que você possui na conta, tente novamente");
            return this.getSaldoDaConta();
        }

		setSaldoDaConta(this.saldoDaConta - valor);

        return this.getSaldoDaConta();
    }

	public double depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Digite um valor válido, por favor");
        }

        setSaldoDaConta(this.saldoDaConta + valor);

        return this.getSaldoDaConta();
	}

    public String transferir(double valor, Integer numeroDaConta) {
        if (valor <= 0) {
            System.out.println("Digite um valor válido, por favor");
            return "Tente novamente.";
        }

        this.sacar(valor);

        return "Sua transferência para a conta de número: " + numeroDaConta + " foi realizada com sucesso. Agora seu saldo é de:" + this.getSaldoDaConta();
    }

    public String cancelarConta() {
        return "Conta Cancelada";
    }
}
