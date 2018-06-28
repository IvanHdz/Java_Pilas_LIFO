/**
 *
 * @author Ivan
 */
import javax.swing.JOptionPane;

public class Pila{
    private int numElementos;
    private int elementos[];
    private int indice;
    
    public Pila(int numElementos){
        this.numElementos = numElementos;
        indice = -1;
        elementos = new int[numElementos];
    }

    public boolean vacia(){
        return indice == -1;
    }

    public boolean llena(){
        return indice == numElementos - 1;
    }

    public void apilar(int elemento){
        indice++;
        try{
            elementos[indice] = elemento;
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "La pila se encuentra llena");
            indice--;
        }
    }

    public int desapilar(){
        int elemento = elementos[indice];
        indice--;
        return elemento;
    }

    public int numElementos(){
        return indice + 1;
    }

    public int[] imprimir(){
        int valores[] = new int[numElementos];
        for(int i = 0; i <= indice; i++)
            valores[i] = elementos[i];

        return valores;
    }
}