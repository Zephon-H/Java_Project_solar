package com.Zephon.gamesun;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import com.Zephon.util.*;
/**
 * Ì«ÑôÏµÖ÷´°¿Ú
 * @author 15284
 *
 */
public class GameFrame3 extends MyFrame {
	//Image img=GameUtil.getImage("images/sun.jpg");
	Image bg=GameUtil.getImage("images/bg.jpg");
	Star sun=new Star("images/sun.jpg",Constant.GAME_WIDTH/2,Constant.GAME_HEIGHT/2);
	Planet earth=new Planet(sun,"images/earth.jpg",(int)150,(int)100,0.1);
	Planet mars=new Planet(sun, "images/Mars.jpg", (int)200, (int)150, 0.13);
	Planet moon=new Planet(earth, "images/Moon.jpg", (int)10, (int)10, 0.2,true);
	
	/*private double degree=Math.PI/3;
	private double degree1=Math.PI/3;
	private double x=100,y=100;
	private double x1=200,y1=100;*/
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(bg, 0, 0,null);
		//g.setColor(Color.blue);
		//g.drawOval(210, 310, 200, 100);
		sun.draw(g);
		earth.draw(g);
		mars.draw(g);
		moon.draw(g);
		
	/*	g.setColor(Color.blue);
		g.drawOval(210, 150, 200, 100);
		g.drawOval(185, 130, 250, 150);
		
		g.drawImage(img, (int)x, (int)y, 30, 30, null);
		
		g.drawImage(img, (int)x1, (int)y1, 30, 30, null);
		
		x=300+100*Math.cos(degree);
		y=190+50*Math.sin(degree);
		
		x1=295+130*Math.cos(degree1);
		y1=190+80*Math.sin(degree1);
		
		degree+=0.1;
		degree1+=0.15;*/
	}
	
	
	public static void main(String[] args) {
		GameFrame3 gf=new GameFrame3();
		gf.lunchFrame();
		}
	
}
