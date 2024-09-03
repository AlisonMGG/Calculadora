
package calculadora;


public class Calculadora {


    public static void main(String[] args) {
        
      ventana inicio = new ventana();           //CREA UNA VENTANA
      inicio.setTitle("Calculadora Basica");    //TITULO DE LA VENTANA
      inicio.setBounds(420, 185, 450, 650);     //POCICION Y DIMENCIONES
      inicio.setResizable(false);               //LIMIA QUE EL USUARIO REDIMENCIONE
      inicio.insertarPanel();
      inicio.insertarEtiquetas();
      inicio.insertarTexto();
      inicio.insertatBoton();
    }
    
}
