package com.Zephon.gamesun;

import java.awt.Color;
import java.awt.Graphics;

import com.Zephon.util.GameUtil;

/**
 * ����
 * @author 15284
 *
 */
public class Planet extends Star {
	//����ͼƬ�����꣬��������ĳ����Բ���У����ᡢ���ᡢ�ٶȡ��Ƕȣ�����ĳ��Star��
	private double longAxis;//������
	private double shortAxis;//�̰���
	private double speed;//�ٶ�
	private double degree;
	Star center;
	boolean statelite;
	
	
	public Planet(Star center,String path, double longAxis, double shortAxis, double speed ) {
		//super();�ܻᱻ���ã�������Ҫ��Star����ӿչ�����
		super(GameUtil.getImage(path));
		//this.img=GameUtil.getImage(path);
		this.longAxis = longAxis;
		this.shortAxis = shortAxis;
		this.x=center.x+longAxis;
		this.y=center.y;
		this.speed = speed;
		this.center = center;
	}
	public Planet(Star center,String path, double longAxis, double shortAxis, double speed ,boolean statelite) {
		this(center,path,longAxis,shortAxis,speed);
		this.statelite=statelite;
	}
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		super.draw(g);
		move();
		if(!statelite)
		drawTrace(g);
	}
	
	public void drawTrace(Graphics g) {
		// TODO Auto-generated method stub
		Color c=g.getColor();
		g.setColor(Color.blue);
		double _x,_y,_width,_height;
		_width=longAxis*2;
		_height=shortAxis*2;
		_x=center.x+center.width/2-longAxis;
		_y=center.y+center.height/2-shortAxis;
		g.drawOval((int)_x, (int)_y, (int)_width,(int) _height);
		g.setColor(c);
	}
	
	public void move() {
		// TODO Auto-generated method stub
		//������Բ�켣����
		x=center.x+center.width/2+longAxis*Math.cos(degree);//Χ��̫������ת���������Ͻ�ת
		y=center.y+center.height/2+shortAxis*Math.sin(degree);
		degree+=speed;
	}

	public Planet(String path, double x, double y) {
		super(path, x, y);
		// TODO Auto-generated constructor stub
	}
	

}
