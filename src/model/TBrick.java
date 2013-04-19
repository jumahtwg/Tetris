package model;

import imodel.IBricks;

public class TBrick implements IBricks {
	
	private int[][] brick;
	private int color;
	private int status;
	
	TBrick() {
		color = 4;
		brick = new int[3][3];
		brick[1][1] = color;
		brick[0][2] = color;
		brick[1][2] = color;
		brick[1][3] = color;
		status = 0;
		
	}
	public int[][] getBrick() {
		return brick;
	}

	public int getColor() {
		return color;
	}
	public void rotateLEFT(int status) {
		// TODO Auto-generated method stub
		
	}
	public void rotateRIGHT(int status) {
		for (int i=0;i<3;i++) {
			for ( int j=0; j<3; j++) {
				brick[i][j] = 0;
			}
		}
		switch(status) {
		case 0:
			brick[0][1] = color;
			brick[0][2] = color;
			brick[1][2] = color;
			brick[2][2] = color;
			status = 1;
			break;
		case 1:
			brick[1][1] = color;
			brick[1][2] = color;
			brick[1][3] = color;
			brick[2][1] = color;
			status = 2;
			break;
		case 2:
			brick[1][1] = color;
			brick[2][1] = color;
			brick[3][1] = color;
			brick[3][2] = color;
			status = 3;
			break;
		case 3:
			brick[1][1] = color;
			brick[0][2] = color;
			brick[1][2] = color;
			brick[1][3] = color;
			status = 0;
			break;
		}
	}
}
