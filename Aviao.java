public class Aviao {
    private int horasAtividade;

    public Aviao() {
        this.horasAtividade = 0;
    }

    public void fazVoo(int horas, Piloto piloto) {
        if (horasAtividade + horas > 200) {
            System.out.println("Voo de " + horas + " horas NÃO realizado. Avião precisa de revisão.");
        } else {
            horasAtividade += horas;
            piloto.adicionaHoras(horas);
            System.out.println("Voo de " + horas + " horas realizado com o piloto " + piloto.getNome() + ".");
        }
    }

    public void fazRevisao() {
        horasAtividade = 0;
        System.out.println("Revisão realizada. Horas de atividade zeradas.");
    }

    public void imprime() {
        System.out.println("Horas de atividade do avião: " + horasAtividade);
        if (horasAtividade >= 200) {
            System.out.println("Revisão necessária.");
        } else {
            System.out.println("Revisão não necessária.");
        }
    }
}

