package model;

import imodel.IBricks;


public class ZBrick implements IBricks {

	private int[][] brick;
	private int color;
	private String status;
	
	/*
	 * standard constructor
	 */
	public ZBrick() {
		color = 6;
		brick = new int[THREE][THREE];
		brick[1][1] = color;
		brick[2][1] = color;
		brick[2][2] = color;
		brick[THREE][2] = color;
		status = "up";
	}

	public int[][] getBrick() {
		return brick;
	}


	public int getColor() {
		return color;
	}
	
	public String getStatus() {
		return status;
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
			brick[2][0] = color;
			brick[2][1] = color;
			brick[1][1] = color;
			brick[1][2] = color;
			setDirection("right");
			break;
		case "right":
			brick[1][1] = color;
			brick[2][1] = color;
			brick[2][2] = color;
			brick[THREE][2] = color;
			setDirection("down");
			break;
		case "down":
			brick[2][0] = color;
			brick[2][1] = color;
			brick[1][1] = color;
			brick[1][2] = color;
			setDirection("left");
			break;
		case "left":
			brick[1][1] = color;
			brick[2][1] = color;
			brick[2][2] = color;
			brick[THREE][2] = color;
			setDirection("up");
			break;
		}		
	}

	public void rotateRIGHT() {
		clearBrick(status);
		switch(status) {
		case "up":
			brick[2][0] = color;
			brick[2][1] = color;
			brick[1][1] = color;
			brick[1][2] = color;
			setDirection("right");
			break;
		case "right":
			brick[1][1] = color;
			brick[2][1] = color;
			brick[2][2] = color;
			brick[THREE][2] = color;
			setDirection("down");
			break;
		case "down":
			brick[2][0] = color;
			brick[2][1] = color;
			brick[1][1] = color;
			brick[1][2] = color;
			setDirection("left");
			break;
		case "left":
			brick[1][1] = color;
			brick[2][1] = color;
			brick[2][2] = color;
			brick[THREE][2] = color;
			setDirection("up");
			break;
		}		
	}

}
