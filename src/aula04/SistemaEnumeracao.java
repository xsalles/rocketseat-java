package aula04;

public class SistemaEnumeracao {
    public static void main(String[] args) {
        System.out.println(Estados.MA.getSigla()); // MA
        System.out.println(Estados.MA.getNome()); // Maranhão

        for (Estados estados: Estados.values()) {
            System.out.println(estados.getSigla());
            System.out.println(estados.getNome());
        }
    }
}
