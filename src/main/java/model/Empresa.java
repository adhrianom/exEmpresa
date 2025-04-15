
package model;
import javax.swing.JOptionPane;
public class Empresa {
    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private int cep;
    private int fone;

    public Empresa() {
        
    }

    public Empresa(String nome, String endereco, String cidade, String estado, int cep, int fone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.fone = fone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getFone() {
        return fone;
    }

    public void setFone(int fone) {
        this.fone = fone;
    }
    
   public void leitura(){
       setNome(JOptionPane.showInputDialog("Qual seu nome?"));
       setEndereco(JOptionPane.showInputDialog("Qual a sua rua?"));
       setCidade(JOptionPane.showInputDialog("Qual sua cidade?"));
       setEstado(JOptionPane.showInputDialog("Qual seu estado?"));
       setCep(Integer.parseInt(JOptionPane.showInputDialog("Qual seu CEP?")));
       setFone(Integer.parseInt(JOptionPane.showInputDialog("Qual é seu número de telefone?")));
   }
    
   public void imprimir(){
       JOptionPane.showMessageDialog(null, "Seu nome é " 
               + getNome() 
               + ", seu endereço é " 
               + getEndereco() + ", na cidade de " 
               +  getCidade() + ", do estado " 
               + getEstado() + ", no CEP: " 
               + getCep() + ", seu telefone é o " 
               + getFone()); 
       
   }
    
}
