package com.Zephon.gamesun;

import java.awt.Graphics;
import java.awt.Image;
/**
 * –––«¿‡
 */
import com.Zephon.util.GameUtil;

public class Star {
	Image img;
	double x,y;
	int width,height;
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(img,(int)x,(int)y,null);
	}
	
	
	public Star(Image img) {
		this.img=img;
		this.width=img.getWidth(null);
		this.height=img.getHeight(null);
	}
	
	public Star(String path,double x,double y) {
		// TODO Auto-generated constructor stub
		this(GameUtil.getImage(path));
		//this.img=GameUtil.getImage(path);
		this.x=x;
		this.y=y;
		
	}
	public Star() {
		// TODO Auto-generated constructor stub
	}
}
