/**
 *
 * @author Ivan
 */
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ResultadoElementos extends JDialog{
    private JButton jButton1;
    private JLabel jLabel1;
    private JScrollPane jScrollPane1;
    private JTextArea jTextArea1;
    
    public ResultadoElementos(Frame parent, boolean modal, int elementos[]){
        super(parent, modal);
        initComponents();
        jTextArea1.append("\n");
        for(int i = elementos.length - 1; i >= 0; i--){
            jTextArea1.append("\t");
            jTextArea1.append(String.valueOf(elementos[i]));
            jTextArea1.append("\n");
            jTextArea1.append("\n");
        }
    }

    public ResultadoElementos(Ventana aThis, boolean b, int[] imprimir) {
        //super(parent, modal);
        initComponents();
        jTextArea1.append("\n");
        for(int i = imprimir.length - 1; i >= 0; i--){
            jTextArea1.append("\t");
            jTextArea1.append(String.valueOf(imprimir[i]));
            jTextArea1.append("\n");
            jTextArea1.append("\n");
        }
    }

    private void initComponents(){
        jLabel1 = new JLabel();
        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();
        jButton1 = new JButton();
        setDefaultCloseOperation(2);
        setTitle("Elementos de la pila");
        jLabel1.setFont(new Font("Arial Narrow", 0, 18));
        jLabel1.setText("Elementos dentro de la pila");
        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setFont(new Font("Arial Unicode MS", 0, 13));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);
        jButton1.setFont(new Font("Arial", 0, 11));
        jButton1.setText("Regresar");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt){
                jButton1ActionPerformed(evt);
            }

            final ResultadoElementos this$0;{
                this$0 = ResultadoElementos.this;
                //super();
                }
            }
        );
        
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(112, 112, 112).addComponent(jLabel1)).addGroup(layout.createSequentialGroup().addGap(160, 160, 160).addComponent(jButton1))).addContainerGap(111, 32767)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(86, 32767).addComponent(jScrollPane1, -2, -1, -2).addGap(84, 84, 84)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(37, 37, 37).addComponent(jLabel1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, 32767).addComponent(jScrollPane1, -2, 249, -2).addGap(56, 56, 56).addComponent(jButton1).addGap(27, 27, 27)));
        pack();
    }

    private void jButton1ActionPerformed(ActionEvent evt){
        setVisible(false);
    }
}