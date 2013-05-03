package model;

import imodel.IBricks;


public class TBrick implements IBricks {
	
	private int[][] brick;
	private int color;
	private String status;
	
	/*
	 * standard constructor
	 */
	public TBrick() {
		color = 4;
		brick = new int[THREE][THREE];
		brick[1][1] = color;
		brick[0][2] = color;
		brick[1][2] = color;
		brick[1][THREE] = color;
		status = "up";
		
	}
	public int[][] getBrick() {
		return brick;
	}

	public int getColor() {
		return color;
	}
	

	public void setDirection(String status) {
		this.status= status;
	}
	
	public void clearBrick(String status) {
		for (int i=0;i<THREE;i++) {
			for ( int j=0; j<THREE; j++) {
				brick[i][j] = 0;
			}
		}
	}
	
	public void rotateLEFT() {
		clearBrick(status);
		switch(status) {
		case "up":
			brick[1][0] = color;
			brick[0][1] = color;
			brick[1][1] = color;
			brick[1][2] = color;
			setDirection("left");
			break;
		case "right":
			brick[1][1] = color;
			brick[0][2] = color;
			brick[1][2] = color;
			brick[1][THREE] = color;
			setDirection("up");
			
			break;
		case "down":
			brick[1][0] = color;
			brick[1][1] = color;
			brick[2][1] = color;
			brick[1][2] = color;
			setDirection("left");
			break;
		case "left":
			brick[0][1] = color;
			brick[1][1] = color;
			brick[2][1] = color;
			brick[1][2] = color;
			setDirection("down");
			break;
		}
	}
		
	public void rotateRIGHT() {
		clearBrick(status);
		switch(status) {
		case "up":
			brick[1][0] = color;
			brick[1][1] = color;
			brick[2][1] = color;
			brick[1][2] = color;
			setDirection("right");
			break;
		case "right":
			brick[0][1] = color;
			brick[1][1] = color;
			brick[2][1] = color;
			brick[1][2] = color;
			setDirection("down");
			break;
		case "down":
			brick[1][0] = color;
			brick[0][1] = color;
			brick[1][1] = color;
			brick[1][2] = color;
			setDirection("left");
			break;
		case "left":
			brick[1][1] = color;
			brick[0][2] = color;
			brick[1][2] = color;
			brick[1][THREE] = color;
			setDirection("up");
			break;
		}
	}
}
