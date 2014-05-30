import java.awt.Graphics;

import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


public class DongHuaDouji extends JFrame {
	
	public DongHuaDouji() {
		add(new DongHua());
	}
	
	public static void main(String[] args){
		DongHuaDouji frame = new DongHuaDouji();
		frame.setTitle("豆机演示");
		frame.setLocation(800,200);
		frame.setSize(500,550);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	static class DongHua extends JPanel {
		Polygon polygon;
		JButton button1;
		JButton button2;
		int delay = 1000;
		Timer timer;
		int x = 245;
		int y = 75; 
		int count = 0;
		int left = 0,right = 0;
		int[] slots = new int[8];
		public DongHua(){
				polygon = new Polygon();
			    button1 = new JButton("加快");
				button2 = new JButton("减慢");
				add(button1);
				add(button2);
		        timer = new Timer(delay,new TimerListener());
		        timer.start();
		        button1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e){
						if(delay>100){
							delay = delay - 100;
							timer.setDelay(delay);
						}
						if(10<delay&&delay<=100){
							delay = delay - 10;
							timer.setDelay(delay);
						}
					}
				});
		        button2.addActionListener(new ActionListener() {
		        	public void actionPerformed(ActionEvent e){
		        		delay = delay +50;
		        		timer.setDelay(delay);
		        	}
		        });
		}

        class TimerListener implements ActionListener{
        	public void actionPerformed(ActionEvent e) {
        		repaint();
        	}
        }
	  protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		polygon.addPoint(225, 50);
		polygon.addPoint(225, 80);
		polygon.addPoint(50, 430);
		polygon.addPoint(50, 480);
		polygon.addPoint(450, 480);
		polygon.addPoint(450, 430);
		polygon.addPoint(275, 80);
		polygon.addPoint(275, 50);
		g.drawPolyline(polygon.xpoints,polygon.ypoints,8);
		g.drawLine(100, 480, 100, 430);
		g.drawLine(150, 480, 150, 430);
		g.drawLine(200, 480, 200, 430);
		g.drawLine(250, 480, 250, 430);
		g.drawLine(300, 480, 300, 430);
		g.drawLine(350, 480, 350, 430);
		g.drawLine(400, 480, 400, 430);
		g.drawOval(95, 425, 10, 10);
		g.drawOval(145, 425, 10, 10);
		g.drawOval(195, 425, 10, 10);
		g.drawOval(245, 425, 10, 10);
		g.drawOval(295, 425, 10, 10);
		g.drawOval(345, 425, 10, 10);		
		g.drawOval(395, 425, 10, 10);
		g.drawOval(245, 125, 10, 10);
	    g.drawOval(220, 175, 10, 10);
		g.drawOval(270, 175, 10, 10);
		g.drawOval(195, 225, 10, 10);
		g.drawOval(245, 225, 10, 10);
		g.drawOval(295, 225, 10, 10);
		g.drawOval(170, 275, 10, 10);
		g.drawOval(220, 275, 10, 10);
		g.drawOval(270, 275, 10, 10);
		g.drawOval(320, 275, 10, 10);
		g.drawOval(145, 325, 10, 10);
		g.drawOval(195, 325, 10, 10);
		g.drawOval(245, 325, 10, 10);
	    g.drawOval(295, 325, 10, 10);
		g.drawOval(345, 325, 10, 10);
		g.drawOval(120, 375, 10, 10);
		g.drawOval(170, 375, 10, 10);
		g.drawOval(220, 375, 10, 10);
		g.drawOval(270, 375, 10, 10);
		g.drawOval(320, 375, 10, 10);
		g.drawOval(370, 375, 10, 10);
		
		for(int i=0;i<slots.length;i++){
			for(int j = slots[i],k = 0;j>0;j--){
				g.fillOval(50*(i+1)+10*(k%3+1), 480-(k/3+1)*10, 10, 10);
				k++;
			}		
		}
		g.fillOval(x, y, 10, 10);
		count++;
		y += 10;
		double rand = Math.random();
		while(rand == 0.5)
			rand = Math.random();
		if(count>1&&count%5 == 0){
			
			if(rand>0.5){
				x -= 25;
				left++;
			}
			else{
				x +=25;
				right++;
			}
		}	
	    if(y+25>480){
	    	slots[right] = slots[right]+1;
			x = 245;
			y = 75;
			count = 0;
			left = right = 0;
	    }
	  }
	}
}