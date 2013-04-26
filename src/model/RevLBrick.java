package model;

import imodel.IBricks;

public class RevLBrick implements IBricks {
	
	private EnumColor[][] brick;
	private EnumColor color;
	private EnumStatus status;
	
	RevLBrick() {
		color = EnumColor.red;
		brick = new EnumColor[3][3];
		brick[2][0] = color;
		brick[2][1] = color;
		brick[2][2] = color;
		brick[1][2] = color;
		status = EnumStatus.up;
		
	}
	public EnumColor[][] getBrick() {
		return brick;
	}

	public EnumColor getColor() {
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
				brick[i][j] = EnumColor.empty;
			}
		}
		switch(status) {
		case up:
			brick[1][1] = color;
			brick[2][1] = color;
			brick[3][1] = color;
			brick[3][2] = color;
			setStatus(EnumStatus.left);
			break;
		case right:
			brick[2][0] = color;
			brick[2][1] = color;
			brick[2][2] = color;
			brick[1][2] = color;
			setStatus(EnumStatus.up);
			break;
		case down:
			brick[0][1] = color;
			brick[0][2] = color;
			brick[1][2] = color;
			brick[2][2] = color;
			setStatus(EnumStatus.right);
			break;
		case left:
			brick[1][1] = color;
			brick[1][2] = color;
			brick[1][3] = color;
			brick[2][1] = color;
			setStatus(EnumStatus.down);
			break;
		}
		
	}
	public void rotateRIGHT(EnumStatus status) {
		for (int i=0;i<3;i++) {
			for ( int j=0; j<3; j++) {
				brick[i][j] = EnumColor.empty;
			}
		}
		switch(status) {
		case up:
			brick[0][1] = color;
			brick[0][2] = color;
			brick[1][2] = color;
			brick[2][2] = color;
			setStatus(EnumStatus.right);
			break;
		case right:
			brick[1][1] = color;
			brick[1][2] = color;
			brick[1][3] = color;
			brick[2][1] = color;
			setStatus(EnumStatus.down);
			break;
		case down:
			brick[1][1] = color;
			brick[2][1] = color;
			brick[3][1] = color;
			brick[3][2] = color;
			setStatus(EnumStatus.left);
			break;
		case left:
			brick[2][0] = color;
			brick[2][1] = color;
			brick[2][2] = color;
			brick[1][2] = color;
			setStatus(EnumStatus.up);
			break;
		}
	}

}
