public class Piloto {
    private String nome;
    private int horasVoo;

    public Piloto(String nome) {
        this.nome = nome;
        this.horasVoo = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionaHoras(int horas) {
        this.horasVoo += horas;
    }

    public void imprime() {
        System.out.println("Piloto: " + nome);
        System.out.println("Horas de voo: " + horasVoo);
        if (horasVoo <= 200) {
            System.out.println("Tipo: Co-piloto");
        } else {
            System.out.println("Tipo: Comandante");
        }
        System.out.println();
    }
}
