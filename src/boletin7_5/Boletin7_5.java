package boletin7_5;

import javax.swing.JOptionPane;

public class Boletin7_5 {

    
    public static void main(String[] args) {
        MayorQue obj = new MayorQue();
        
        float n1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer número: "));
        float n2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo número: "));
        float n3 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el tercer número: "));
        
        obj.mayor(n1, n2, n3);
    }
    
}
