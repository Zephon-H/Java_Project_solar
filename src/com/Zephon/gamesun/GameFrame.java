package com.Zephon.gamesun;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.Zephon.util.GameUtil;

public class GameFrame extends Frame {		//GUI编程：AWT，swing等
	
	Image img=GameUtil.getImage("images/sun.jpg");
	
	
	/*
	 * 加载窗口
	 */
	public void launchFrame() {
		setVisible(true);
		setSize(500, 500);
		setLocation(100, 100);
		
		new PaintThread().start();
		
		//窗口关闭
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}
	
	private	double x=100,y=100;
	
	@Override
	public void paint(Graphics g) {
		//g.drawLine(100, 100, 200, 200);		//相对窗口原点
		//g.fillOval(100, 100, 200, 200);
		
		//Font font=new Font("宋体", Font.BOLD, 100);
		//g.setFont(font);
		//g.drawString("alksdjf", 150, 150);
		g.drawImage(img, (int)x, (int)y,null);
		x+=1;
		y+=3;
	}
	
	/**
	 * 定义一个重画窗口的线程
	 * @author 15284
	 *
	 */
	class PaintThread extends Thread{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			while(true) {
				repaint();//重画窗口
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
		GameFrame gf=new GameFrame();
		gf.launchFrame();
	}
}
