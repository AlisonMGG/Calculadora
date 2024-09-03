
package calculadora;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



    public class ventana extends JFrame{
    JPanel panelInicio = new JPanel();
    JTextField txtValor1 = new JTextField();
    JTextField txtValor2 = new JTextField();
    JLabel lblresultado = new JLabel("total");
    int valor1 = 0;
    public ventana(){
    this.setVisible(true);                          //HACE VICIBLE LA VENTANA.
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);   //BOTON PARA CERRAR VENTANA.
      
    }   
    
    public void insertarPanel(){                    //PARA CREAR UN PANEL,  NOS PERMITE REUTILIZAR LA VENTANA
        
        this.getContentPane().add(panelInicio);
        //panelInicio.setBackground(Color.blue);    //APLICA COLOR AL PANEL
       
        panelInicio.setLayout(null);                //DESACTIVA LA ORGANISACIOIN AUTOMATICA
    }      
    
    public void insertarEtiquetas(){
        JLabel lblValor1 = new JLabel("Ingrese el primer valor :");
        lblValor1.setBounds(20, 20, 160, 15);
        panelInicio.add(lblValor1);

       JLabel lblValor2 = new JLabel("ingrese el segundo valor :");
        lblValor2.setBounds(20, 65, 160, 15);
        panelInicio.add(lblValor2);
        
        
        lblresultado.setBounds(50, 180, 45, 40);
        panelInicio.add(lblresultado);
    }
    
    
    public void insertarTexto(){       
       
        txtValor1.setBounds(180, 16, 225, 25);
        panelInicio.add(txtValor1);
        txtValor1.repaint();

        txtValor2.setBounds(180, 60, 225, 25);
        panelInicio.add(txtValor2);
        txtValor2.repaint();
        
    }
    
    public void insertatBoton(){
//        try{
//            
//        }catch (InterruptedException e);
        JButton btSumar = new JButton("sumar");
        btSumar.setBounds(100, 100, 80, 40);
        panelInicio.add(btSumar);
        btSumar.repaint();
        
        ActionListener sumando = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            
                String valor1 = txtValor1.getText();
                String valor2 = txtValor2.getText();
                
                               if (valor1.equals("")|| valor2.equals("") ) {
                    JOptionPane.showMessageDialog(null, "deve llenar todos los campos");
                }else{
                                   
                    int resultadosuma = Integer.parseInt(valor1) + Integer.parseInt(valor2);
                    lblresultado.setText("Total: " + String.valueOf(resultadosuma));
                    
                }
                
            }
        };
        btSumar.addActionListener(sumando);
       
        JButton btnSum = new JButton ("+");
        panelInicio.add(btnSum);
        btnSum.setBounds(200, 100, 50, 40);
        btnSum.repaint();

        ActionListener suma2 = new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if (txtValor1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null , "Deve ingresar un valor" );
                    
                }else{
                    valor1 += Integer.parseInt(txtValor1.getText());
                    txtValor1.setText("");
                }
                
            }
        };
        
        btnSum.addActionListener(suma2);
        
        JButton btnigual = new JButton("=");
        panelInicio.add(btnigual);
        btnigual.setBounds(300, 100, 50, 40);
        
        
         ActionListener resultado = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtValor1.setText(String.valueOf(valor1));
                
            }
        };
        
        btnigual.addActionListener(resultado);
        
        
        JButton btn1 = new JButton("1");
        btn1.setBounds(220, 180, 50, 30);
        panelInicio.add(btn1);
        btn1.repaint();
        
        ActionListener agregar1 = new ActionListener() {
            @Override                                       //cuando se oprima el boton aparesca en el espacio
            public void actionPerformed(ActionEvent e) {
               String union = txtValor1.getText() + "1";
               txtValor1.setText(union);
            }
       
        };
        
        btn1.addActionListener(agregar1);
        
        JButton btn2 = new JButton("2");
        btn2.setBounds(280, 180, 50, 30);
        panelInicio.add(btn2);
        btn2.repaint();
        
         ActionListener agregar2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                String union = txtValor1.getText() + "2";
                txtValor1.setText(union);
                
            }
        };
         
         btn2.addActionListener(agregar2);
        
    }
}
