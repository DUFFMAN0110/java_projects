package Game_Java;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player2 extends JFrame implements KeyListener{
    private int x; 
    private int y;
    private boolean[] keys; 
    private final int SIZE;
    private JPanel player = new JPanel() {


            @Override
            public void paintComponent(Graphics g)
            {
                super.paintComponents(g);

                setBackground(Color.white);
                g.setColor(Color.WHITE);
                g.drawRect(x,y,SIZE, SIZE);
            }
        }; 
    private Rectangle rect = new Rectangle(x,y,50,50)
    {

    }; 
    {
        x = 50; 
        y = 50; 
        SIZE = 35;
    }

    public Player2(){
         
    

        player.setBackground(Color.white);
        player.setBounds(rect);

        this.setTitle("MyGame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setLayout(null); 
        this.setSize(500,500);
        this.getContentPane().setBackground(Color.black); 
        this.setVisible(true); 

        this.add(player); 

        this.addKeyListener(this);
        
        

    }
    // public void paintComponent(){
    //     if(keys[0]){
    //         x--; 
    //     }
    //     if(keys[1]){
    //         x++; 
    //     }
    //     if(keys[2]){
    //         y--; 
    //     }
    //     if(keys[3]){
    //         y++; 
    //     }
    // }
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        try{
        if((e.getKeyCode() == KeyEvent.VK_A && e.getKeyCode() == KeyEvent.VK_W) || 
            (e.getKeyCode() == KeyEvent.VK_LEFT && e.getKeyCode() == KeyEvent.VK_UP)){

            x--;
            y--; 

        }
        else if(e.getKeyCode() == KeyEvent.VK_S && e.getKeyCode() == KeyEvent.VK_A 
            || e.getKeyCode() == KeyEvent.VK_LEFT && e.getKeyCode() == KeyEvent.VK_DOWN){
              x--;
              y++;
        }
        else if(e.getKeyCode() == KeyEvent.VK_W && e.getKeyCode() == KeyEvent.VK_D 
            || e.getKeyCode() == KeyEvent.VK_RIGHT && e.getKeyCode() == KeyEvent.VK_UP){
            
            y--; 
            x++; 
        }
        else if(e.getKeyCode() == KeyEvent.VK_S && e.getKeyCode() == KeyEvent.VK_D 
            || e.getKeyCode() == KeyEvent.VK_RIGHT && e.getKeyCode() == KeyEvent.VK_DOWN){
            y++; 
            x++; 
        }
    }catch(Exception ec){
        System.out.println("This is not working\n");
    }finally{
        System.out.println(e.getKeyCode());
    }
}

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
        // if(e.getKeyCode() == KeyEvent.VK_A || e.getKeyCode() == KeyEvent.VK_LEFT ){
        //     keys[0] = false;  
        // }
        // if(e.getKeyCode() == KeyEvent.VK_D || e.getKeyCode() == KeyEvent.VK_RIGHT){
        //     keys[1] = false;  
        // }
        // if(e.getKeyCode() == KeyEvent.VK_W || e.getKeyCode() == KeyEvent.VK_UP){
        //     keys[2] = false; 
        // }
        // if(e.getKeyCode() == KeyEvent.VK_S || e.getKeyCode() == KeyEvent.VK_DOWN){
        //     keys[3] = false; 
        // }
        System.out.println("Unimplemented method 'keyPressed'");
    }

}
    