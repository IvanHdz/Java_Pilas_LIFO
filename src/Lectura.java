/**
 *
 * @author Ivan
 */
import javax.swing.JOptionPane;

public class Lectura{
    private static int cuenta;
    private static int valores[];
    private static int i;
    
    public Lectura(){
    }

    public static int[] leerValores(int nVeces){
        valores = new int[1000];
        cuenta = 0;
        i = 0;
        for(int n = 0; n < valores.length; n++)
            valores[n] = -9999;

        do{
            if(cuenta >= nVeces)
                break;
            int numero = 0;
            boolean band = false;
            try{
                numero = Integer.parseInt(JOptionPane.showInputDialog(null, (new StringBuilder()).append("Inserte el valor ").append(cuenta + 1).append(" de la pila").toString()));
                band = true;
            }
            catch(NumberFormatException numberFormatException){
                JOptionPane.showMessageDialog(null, "La pila solo admite numeros enteros");
            }
            if(band){
                valores[cuenta] = numero;
                cuenta++;
            }
        }while(true);
        return valores;
    }
}