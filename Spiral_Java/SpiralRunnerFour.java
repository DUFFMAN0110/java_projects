package Spiral_Java;

import javax.swing.JOptionPane;
public class SpiralRunnerFour{
    public static void main(String[] args){
        int spiral = Integer.parseInt(JOptionPane.showInputDialog("Enter a spiral size"));
        Spiral spin = new Spiral(spiral);
        JOptionPane.showMessageDialog(null,"Here is your sprial\n" + spin);
    }
}
