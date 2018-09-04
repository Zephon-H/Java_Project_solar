package com.Zephon.gamesun;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;

import org.omg.PortableServer.POAPackage.AdapterAlreadyExists;

import com.Zephon.gamesun.GameFrame.PaintThread;
import com.Zephon.util.GameUtil;

/**
 * 测试窗口物体沿各种轨迹移动
 * @author 15284
 *
 */
public class GameFrame2 extends Frame {
	
	Image img=GameUtil.getImage("images/sun.jpg");
	
	public void lunchFrame() {
		setSize(500,500);
		setLocation(100,100);
		setVisible(true);
		new PaintThread().start();
		addWindowListener(new WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.exit(0);
			};
		});
	}

	private double degree=Math.PI/6;
	private double x=100,y=100;
	private double speed=10;
	
	@Override
	public void paint(Graphics g) {
		
		g.drawImage(img, (int)x,(int) y, 50, 50,null);
		//if(left)x-=10*Math.cos(degree);
		//else 
		if(speed>0)speed-=0.05;
		x+=speed*Math.cos(degree);
		y+=speed*Math.sin(degree);
		
		if(x>=500-55||x<=10)degree=Math.PI-degree;

		if(y>=500-50||y<=40)degree=-degree;

		
	}
	
	class PaintThread extends Thread{
		@Override
		public void run() {
			while(true) {
				repaint();
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		GameFrame2 gf=new GameFrame2();
		gf.lunchFrame();
	}
	
}
