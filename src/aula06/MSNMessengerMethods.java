package aula06;

// se tornou uma classe abstrata, logo, você irá definir a maneira que os métodos serão executados por outras classes.
public class MSNMessengerMethods {
    public void enviarMensagem(String mensagem) {
        validarConexaoInternet();
        System.out.println(mensagem);
    }

    public void receberMensagem(String mensagem) {
        validarConexaoInternet();
        System.out.println(mensagem);
    }

    public void validarConexaoInternet() {
        System.out.println("Validando se está conectado a internet.");
    }

    public void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico de mensagem");
    }
}
