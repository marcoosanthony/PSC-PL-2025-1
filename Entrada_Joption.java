
import javax.swing.JOptionPane;

public class Entrada_Joption {

public static void main (String[] args){
    String nome = JOptionPane.showInputDialog("Digite seu nome");
    String idade = JOptionPane.showInputDialog("Digite sua idade");
    Double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));

    int idadeStr = Integer.parseInt(idade);
}
    JOptionPane.showMessageDialog(null, altura, nome, idadeStr);{
}