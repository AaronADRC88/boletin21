package boletin21;


import javax.swing.JOptionPane;

public class Boletin21 {

    public static void main(String[] args) {
        ParaFotocopiadora obx = new ParaFotocopiadora();
        int op;
        boolean creado = false;
        do {
            op = ParaFotocopiadora.menu();
            switch (op) {
                case 1:
                    obx.añadeCopias();
                    creado = true;
                    break;
                case 2:
                    if (creado) {
                       do{
                           obx.imprimeCola();
                       }while(obx.getCopia().isEmpty()==false);
                    } else {
                        JOptionPane.showMessageDialog(null, "Introduce elementos para imprimir", "ERROR!!", JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                case 3:
                    if (op == 3 && op == 0) {
                        System.exit(0);
                    }
            }
        } while (op != 3 && op != 0);
    }
}
