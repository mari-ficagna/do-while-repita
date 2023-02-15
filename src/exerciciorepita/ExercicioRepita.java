/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Mari (48) 99618-5728
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //JOptionPane.showMessageDialog(null, "Olá Mundo!" + "Boas vindas" + JOptionPane.ERROR_MESSAGE);
        
        
        /*int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número:"));
        JOptionPane.showInputDialog(null, "Você digitou o valor " + n);*/
        
        int n, s = 0;
        int ci = 0; // contador impar
        int cp = 0; // contadores par
        int ca = 0; // contador acima de 100
        int cc = 0;
        int cm;
        do {
           n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <br> <i>(valor 0 interrompe)</i></html>")); 
           s += n;
           cc++;
           if (n>100) {
               ca++;
           } else if (n%2 != 0) {
               ci++;  
           } else {
               cp++;
           }
        } while (n != 0);
        cm = cc -1;
        JOptionPane.showMessageDialog(null, "<html>Resultado final <br> <hr> Somatório vale " + s + "<br>Números ímpares: " + ci + "<br>Números Pares: " + (cp - 1) + "<br>Acima de 100: " +ca+ "<br>Média: " + (s/cm) + "</html>");
    }
    
}
