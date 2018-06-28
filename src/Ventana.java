/**
 *
 * @author Ivan
 */
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ventana extends JFrame{
    private Pila pila;
    private int size;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JLabel jLabel1;
    
    public Ventana(){
        initComponents();
        setDefaultCloseOperation(3);
        setTitle("Viruz Blog: Manejo de Pilas");
        setLocationRelativeTo(null);
        setSize(320, 400);
        jButton2.setEnabled(false);
        jButton7.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
    }

    private void initComponents(){
        jLabel1 = new JLabel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jButton6 = new JButton();
        jButton7 = new JButton();

        jLabel1.setFont(new Font("Arial Rounded MT Bold", 0, 24));
        jLabel1.setText("Manejo de Pilas en Java");
        jButton1.setFont(new Font("Arial Unicode MS", 0, 12));
        jButton1.setText("Crear Pila");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                jButton1ActionPerformed(evt);
            }
            final Ventana this$0;{
                this$0 = Ventana.this;
//                super();
                }
            }
        );
        
        jButton2.setFont(new Font("Arial Unicode MS", 0, 12));
        jButton2.setText("Agregar elementos a la pila");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                jButton2ActionPerformed(evt);
            }
            
            final Ventana this$0;{
                this$0 = Ventana.this;
                //super();
                }
            }
        );
        
        jButton3.setFont(new Font("Arial Unicode MS", 0, 12));
        jButton3.setText("Eliminar elementos de la pila");
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                jButton3ActionPerformed(evt);
            }

            final Ventana this$0;{
                this$0 = Ventana.this;
                //super();
            }
        }
        );
        
        jButton4.setFont(new Font("Arial Unicode MS", 0, 12));
        jButton4.setText("Mostrar todos los elementos de la pila");
        jButton4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt){
                jButton4ActionPerformed(evt);
            }

            final Ventana this$0;{
                this$0 = Ventana.this;
                //super();
                }
            }
        );
        
        jButton5.setFont(new Font("Arial Unicode MS", 0, 12));
        jButton5.setText("Eliminar la pila");
        jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                jButton5ActionPerformed(evt);
            }

            final Ventana this$0;{
                this$0 = Ventana.this;
               // super();
                }
            }
        );
        
        jButton6.setFont(new Font("Arial Unicode MS", 0, 12));
        jButton6.setText("Salir");
        jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                jButton6ActionPerformed(evt);
            }

            final Ventana this$0;{
                this$0 = Ventana.this;
                //super();
                }
            }
        );
        
        jButton7.setFont(new Font("Arial Unicode MS", 0, 12));
        jButton7.setText("Agregar solo un elemento a la pila");
        jButton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                jButton7ActionPerformed(evt);
            }

            final Ventana this$0;{
                this$0 = Ventana.this;
               // super();
                }
            }
        );
        
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap(67, 32767).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(jButton2, -1, -1, 32767).addComponent(jButton1, -1, -1, 32767).addComponent(jButton4, -1, -1, 32767).addComponent(jButton3, -1, -1, 32767).addComponent(jButton5, -1, -1, 32767).addComponent(jButton6, -1, -1, 32767).addComponent(jButton7, -1, 239, 32767)).addGap(70, 70, 70)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(jLabel1).addGap(49, 49, 49)))));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(32, 32, 32).addComponent(jLabel1).addGap(57, 57, 57).addComponent(jButton1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton7).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton3).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton4).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton5).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jButton6).addContainerGap(59, 32767)));
        pack();
    }

    private void jButton1ActionPerformed(ActionEvent evt){
        int nVeces = 0;
        boolean band = false;
        while(!band)
            try{
                String valor = JOptionPane.showInputDialog(null, "Inserte el tama\361o de la pila a crear:");
                nVeces = Integer.parseInt(valor);
                band = true;
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Inserte solo numeros enteros por favor");
            }
        
        pila = new Pila(nVeces);
        JOptionPane.showMessageDialog(null, "Pila creada satisfactoriamente");
        size = nVeces;
        jButton2.setEnabled(true);
        jButton7.setEnabled(true);
        jButton5.setEnabled(true);
    }

    private void jButton2ActionPerformed(ActionEvent evt){
        int valores[] = Lectura.leerValores(size);
        for(int i = 0; i < valores.length; i++)
            if(valores[i] != -9999)
                pila.apilar(valores[i]);

        System.out.println(size);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
    }

    private void jButton7ActionPerformed(ActionEvent evt){
        try{
            int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte el valor a agregar dentro de la pila"));
            pila.apilar(x);
            if(pila.llena())
                JOptionPane.showMessageDialog(null, "Elemento agregado correctamente");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "No es una opcion valida");
        }
        
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
    }

    private void jButton6ActionPerformed(ActionEvent evt){
        System.exit(0);
    }

    private void jButton4ActionPerformed(ActionEvent evt){
        (new ResultadoElementos(this, true, pila.imprimir())).setVisible(true);
    }

    private void jButton5ActionPerformed(ActionEvent evt){
        pila = null;
        JOptionPane.showMessageDialog(null, "La pila fue eliminada");
        jButton2.setEnabled(false);
        jButton7.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
    }

    private void jButton3ActionPerformed(ActionEvent evt){
        try{
            String mensaje = (new StringBuilder()).append("Se ha sacado ").append(String.valueOf(pila.desapilar())).append(" de la pila").toString();
            JOptionPane.showMessageDialog(this, mensaje);
        }
        catch(Exception ex) { }
    }
}