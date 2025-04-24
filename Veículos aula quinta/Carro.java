public class Carro extends Veiculo { 
    public Carro(String marca, String modelo, int ano, double combustivel) { 
        super(marca, modelo, ano, combustivel); }
        public void ligarArCondicionado() { 
            if (getMotorLigado()) { 
                System.out.println("Ar-condicionado ligado."); 
            } else { 
                System.out.println("Ligue o motor primeiro para usar o ar-condicionado."); 
            } 
        } 
    } 