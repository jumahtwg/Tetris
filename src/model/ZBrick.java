package model;

import imodel.IBricks;

public class ZBrick implements IBricks {

	private int[][] brick;
	private int color;
	private EnumStatus status;
	
	ZBrick() {
		color = 6;
		brick = new int[3][3];
		brick[1][1] = color;
		brick[2][1] = color;
		brick[2][2] = color;
		brick[3][2] = color;
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
	
	public void setStatus(EnumStatus status) {
		this.status = status;
	}

	public void rotateLEFT(EnumStatus status) {
		for (int i=0;i<3;i++) {
			for ( int j=0; j<3; j++) {
				brick[i][j] = 0;
			}
		}
		switch(status) {
		case up:
			brick[2][0] = color;
			brick[2][1] = color;
			brick[1][1] = color;
			brick[1][2] = color;
			setStatus(EnumStatus.right);
			break;
		case right:
			brick[1][1] = color;
			brick[2][1] = color;
			brick[2][2] = color;
			brick[3][2] = color;
			setStatus(EnumStatus.down);
			break;
		case down:
			brick[2][0] = color;
			brick[2][1] = color;
			brick[1][1] = color;
			brick[1][2] = color;
			setStatus(EnumStatus.left);
			break;
		case left:
			brick[1][1] = color;
			brick[2][1] = color;
			brick[2][2] = color;
			brick[3][2] = color;
			setStatus(EnumStatus.up);
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
			brick[2][0] = color;
			brick[2][1] = color;
			brick[1][1] = color;
			brick[1][2] = color;
			setStatus(EnumStatus.right);
			break;
		case right:
			brick[1][1] = color;
			brick[2][1] = color;
			brick[2][2] = color;
			brick[3][2] = color;
			setStatus(EnumStatus.down);
			break;
		case down:
			brick[2][0] = color;
			brick[2][1] = color;
			brick[1][1] = color;
			brick[1][2] = color;
			setStatus(EnumStatus.left);
			break;
		case left:
			brick[1][1] = color;
			brick[2][1] = color;
			brick[2][2] = color;
			brick[3][2] = color;
			setStatus(EnumStatus.up);
			break;
		}		
	}

}
