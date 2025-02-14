//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color; 
import java.awt.Graphics;
// import java.awt.Graphics2D;
// import java.awt.Canvas;
// import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent; 
// import java.awt.event.ActionListener;
// import java.util.ArrayList;
// import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.JPanel;
// import java.awt.Component;
import java.awt.Font;

public class Tablet extends JPanel implements KeyListener, Runnable
{
	private boolean[] keys;

	private int x;
	private int y;
	private Color c = Color.WHITE; 
	Color j;
	Color k; 
	public Tablet(JFrame par)
	{
		// the keys array will store the key presses
		// [0]=left arrow
		// [1]=right arrow
		// [2]=up arrow
		// [3]=down arrow
		// [4]=space bar
		keys = new boolean[6];
		
		setBackground(Color.BLACK);

		// x and y will keep track of where the pen is
		// on the screen
		x = DrawIt.WIDTH/2;
		y = DrawIt.HEIGHT/2;

		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

	public void update(Graphics window)
	{
		paint(window);
	}
	public Color ColorSetter()
	{	
		if(keys[5])
		{
			j = getRandColor();
			c = j;
			return c; 
		}
		return c; 
	}
	public void paint( Graphics window )
	{
		window.setColor( Color.WHITE );
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("A+ Draw a Shape", 20,20);
		window.drawString("Use the arrow keys to draw.", 20,40);
		window.drawString("Use the space bar to clear the screen.", 20,60);

		// add in code to move the x and y
		// if the up arrow was pressed
			// take 1 away from y value

		if(keys[0])
		{
			x--; 
		}
		if(keys[1])
		{
			x++;
		}
		if(keys[2])
		{
			y--; 
		}
		if(keys[3])
		{
			y++; 
		}
		if(keys[4])
		{
			window.setColor(ColorSetter()); 
			window.fillRect(0,0,800,600); 
			x = DrawIt.WIDTH/2;
			y = DrawIt.HEIGHT/2;
		}
		if(keys[5])
		{
			window.setColor(ColorSetter()); 
		}
		// if the space bar was pressed
			// reset x and y to the center
			// draw a black rectangle the size of the screen

		window.setColor( ColorSetter());
		window.fillRect(x, y, 20, 20);
	}

	
	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A )
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_D )
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE || e.getKeyCode() == KeyEvent.VK_R)
		{
			keys[4] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SHIFT || e.getKeyCode() == KeyEvent.VK_Q)
		{
			keys[5] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_D)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_W)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_S)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE || e.getKeyCode() == KeyEvent.VK_R)
		{
			keys[4] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SHIFT || e.getKeyCode() == KeyEvent.VK_Q)
		{
			keys[5] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
		
	}

	public Color getRandColor()
	{
		int r = (int)(Math.random() * 256);
		int g = (int)(Math.random() * 256);
		int b = (int)(Math.random() * 256);
		k = new Color(r,g,b); 
		return k;
	}

	@SuppressWarnings("static-access")
	public void run()
	{
		try
		{
			while(true)
			{
				Thread.currentThread().sleep(5);
				repaint();
			}
		}catch(Exception e)
		{
		}
	}
}

