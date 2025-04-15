

package Principal.Principal;
import model.Empresa;
import model.Restaurante;
import javax.swing.JOptionPane;
public class ExEmpresa {

    public static void main(String[] args) {
        Empresa dados = new Empresa();
        Restaurante restaurante = new Restaurante();
        dados.leitura();
        dados.imprimir();
        
        restaurante.leitura();
        restaurante.imprimir();
        
        
    }
}
