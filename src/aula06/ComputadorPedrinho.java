package aula06;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        MSNMessengerMethods msnMessengerApplication = new MSNMessengerMethods();

        msnMessengerApplication.enviarMensagem("mensagem");
        msnMessengerApplication.receberMensagem("mensagem"); // nem tudo precisa estar visível, encapsulamento
       // msnMessengerApplication.salvarHistoricoMensagem();
     //   msnMessengerApplication.validarConexaoInternet();

    }
}
