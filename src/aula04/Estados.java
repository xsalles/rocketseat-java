package aula04;

public enum Estados {
    PI("Piauí", "PI"),
    MA("Maranhão", "MA"),
    SP("São Paulo", "SP"),
    RJ("Rio de Janeiro", "RJ")
    ;

    private String nome;
    private String sigla;

    private Estados(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}
