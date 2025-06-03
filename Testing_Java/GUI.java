import javax.swing.JOptionPane; 


public class GUI {
    public static void main(String[] args){
        
        String name = JOptionPane.showInputDialog("Enter your name"); 
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age")); 
        JOptionPane.showMessageDialog(null, "Your are " + age+ " years old"); 

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are "+height+" cm tall"); 
        
        /*
         *  GUI JOptionPane::
            - import the javax.swing.JOptionPane

            Methods: 
                showInputDialog("") - this needs to be accessed statically it
                    shows the text inside the method and then allows for some sort of input 
                showMessageDialog("") - needs to be accessed statically, it 
                    shows the text inside of the method 
                Both have an 'OK' button and the showInputDialog has an additional 'Cancel' button
         */
        System.out.println(Math.PI);
    }
}
