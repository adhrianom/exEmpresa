
package model;

import javax.swing.JOptionPane;

public class Restaurante extends Empresa {
    private String comida;
    private double preco;

    public Restaurante() {
    }

    public Restaurante(String comida, double preco) {
        this.comida = comida;
        this.preco = preco;
    }

    public Restaurante(String comida, double preco, String nome, String endereco, String cidade, String estado, int cep, int fone) {
        super(nome, endereco, cidade, estado, cep, fone);
        this.comida = comida;
        this.preco = preco;
    }


    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void leitura(){
       setComida(JOptionPane.showInputDialog("Qual o prato que você deseja?"));
       setPreco(Double.parseDouble(JOptionPane.showInputDialog("Preço médio: R$ ")));
    }
       public void imprimir(){
           JOptionPane.showMessageDialog(null, "O prato que você escolheu foi " + getComida() + ", com o preço de R$ " + getPreco());
       }
       
   
}
