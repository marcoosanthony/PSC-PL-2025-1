public class Veiculo{

    private String marca;
    private String modelo;
    private int ano;
    public double velocidadeAtual;
    private boolean motorLigado;
    private double combustivel;

    public Veiculo (String marca, String modelo, int ano, double combustivel){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0;
        this.motorLigado = false;
        this.combustivel = combustivel;
    }

    public boolean getMotorLigado(){
        return this.motorLigado;
    }

    public void setVelocidadeAtual (double velocidadeAtual){
        this.velocidadeAtual = this.velocidadeAtual + velocidadeAtual;
    }

    public void ligarMotor(){
        if(this.motorLigado){
        System.out.println("O motor já está ligado.");
        } else {
            this.motorLigado = true;
            System.out.println("Motor ligado.");
        }
    } 
    public void desligarMotor(){
        if(this.motorLigado){
            this.motorLigado = false;
           System.out.println ("Motor desligado."); 
        } else {
            System.out.println("O motor ja está ligado");

        }
    }
    public void acelerar(){
        if(!this.motorLigado){
            System.out.println ("Não é possível acelerar com o motor desligado");
        } else {            
        } if(this.combustivel <= 0){
            System.out.println("Não há combustível.");
        } else {            
        }this.velocidadeAtual = this.velocidadeAtual + 10;
        this.combustivel -= 0.5;
        System.out.println ("A velocidade atual é " + this.velocidadeAtual);
    }
    public void frear (){
        if(this.velocidadeAtual > 0){
            this.velocidadeAtual -= 10;
            if(this.velocidadeAtual <10){
                this.velocidadeAtual = 0;
            }
        System.out.println ("A velocidade atual é " + this.velocidadeAtual);
        } else {
        System.out.println ("O carro já está parado.");
        }
    }
    public void exibirInfo() { 
        System.out.println("===== Informações do Veículo ====="); 
        System.out.println("Marca: " + this.marca); 
        System.out.println("Modelo: " + this.modelo); 
        System.out.println("Ano: " + this.ano); 
        System.out.println("Velocidade atual: " + this.velocidadeAtual + " km/h"); 
        System.out.println("Motor ligado: " + (this.motorLigado ? "Sim" : "Não")); 
        System.out.println("Combustível: " + this.combustivel + " litros"); 
        System.out.println("==================================="); } 
        
        public void abastecer(double litros) { 
            if (litros <= 0) { 
            System.out.println("Quantidade inválida para abastecimento."); 
            return; 
        } 
            if (this.motorLigado) { 
                System.out.println("Desligue o motor antes de abastecer."); 
            } else { this.combustivel += litros; 
                System.out.println("Abastecido com " + litros + " litros."); 
                System.out.println("Combustível atual: " + this.combustivel + " litros."); 
            } 
        } 
        
        public double statusCombustivel() { 
            return this.combustivel; 
        }
}

