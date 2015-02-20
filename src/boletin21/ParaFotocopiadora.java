package boletin21;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ParaFotocopiadora {

    private String texto;
    private int noCopias;

    ArrayList<ParaFotocopiadora> copia = new ArrayList();

    public ParaFotocopiadora(String texto, int noCopias) {
        this.texto = texto;
        this.noCopias = noCopias;
    }

    @Override
    public String toString() {
        return   "texto=" + texto + "\nnoCopias=" + noCopias ;
    }

    public ParaFotocopiadora() {
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getNoCopias() {
        return noCopias;
    }

    public void setNoCopias(int noCopias) {
        this.noCopias = noCopias;
    }

    public ArrayList<ParaFotocopiadora> getCopia() {
        return copia;
    }

    public void setCopia(ArrayList<ParaFotocopiadora> copia) {
        this.copia = copia;
    }

    public void añadeCopias() {
        int confirm;
        do {
            String imprime = JOptionPane.showInputDialog("introduce texto a imprimir");
            int veces = Integer.parseInt(JOptionPane.showInputDialog("introduce nºde copias que deseas"));
            copia.add(new ParaFotocopiadora(imprime,veces));
            confirm = JOptionPane.showConfirmDialog(null, "¿Imprimr algo más?", "", JOptionPane.YES_OPTION,JOptionPane.QUESTION_MESSAGE);
        } while (confirm == 0);

    }

    public void imprimeCola() {
        for (int i = 0; i < copia.size(); i++) {
            JOptionPane.showMessageDialog(null, "imprimiendo" + copia.remove(i));
            
          
        }
    }

    public static int menu() {
        int op = JOptionPane.showOptionDialog(null, "Selecciona una opción", "", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new Object[]{"añade copias", "imprime copias", "salir"}, "salir");
        return op + 1;
    }

}
