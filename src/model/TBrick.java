package model;

import imodel.IBricks;

public class TBrick implements IBricks {
	
	private int[][] brick;
	private int color;
	private EnumStatus status;
	
	TBrick() {
		color = 4;
		brick = new int[3][3];
		brick[1][1] = color;
		brick[0][2] = color;
		brick[1][2] = color;
		brick[1][3] = color;
		status = EnumStatus.up;
		
	}
	public int[][] getBrick() {
		return brick;
	}

	public int getColor() {
		return color;
	}
	
	public EnumStatus getStatus() {
		return status;
	}

	public void rotateLEFT(EnumStatus status) {
		for (int i=0;i<3;i++) {
			for ( int j=0; j<3; j++) {
				brick[i][j] = 0;
			}
		}
		switch(status) {
		case up:
			brick[1][0] = color;
			brick[0][1] = color;
			brick[1][1] = color;
			brick[1][2] = color;
			status = EnumStatus.left;

			break;
		case right:
			brick[1][1] = color;
			brick[0][2] = color;
			brick[1][2] = color;
			brick[1][3] = color;
			status = EnumStatus.up;
			
			break;
		case down:
			brick[1][0] = color;
			brick[1][1] = color;
			brick[2][1] = color;
			brick[1][2] = color;
			status = EnumStatus.left;
			break;
		case left:
			brick[0][1] = color;
			brick[1][1] = color;
			brick[2][1] = color;
			brick[1][2] = color;
			status = EnumStatus.down;
			break;
		}
	}
		
	public void rotateRIGHT(EnumStatus status) {
		for (int i=0;i<3;i++) {
			for ( int j=0; j<3; j++) {
				brick[i][j] = 0;
			}
		}
		switch(status) {
		case up:
			brick[1][0] = color;
			brick[1][1] = color;
			brick[2][1] = color;
			brick[1][2] = color;
			status = EnumStatus.right;
			break;
		case right:
			brick[0][1] = color;
			brick[1][1] = color;
			brick[2][1] = color;
			brick[1][2] = color;
			status = EnumStatus.down;
			break;
		case down:
			brick[1][0] = color;
			brick[0][1] = color;
			brick[1][1] = color;
			brick[1][2] = color;
			status = EnumStatus.left;
			break;
		case left:
			brick[1][1] = color;
			brick[0][2] = color;
			brick[1][2] = color;
			brick[1][3] = color;
			status = EnumStatus.up;
			break;
		}
	}
}
