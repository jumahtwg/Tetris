package model;

import imodel.IBricks;

public class LBrick implements IBricks {

	private EnumColor[][] brick;
	private EnumColor color;
	private EnumStatus status;
	
	/*
	 * standard constructor
	 */
	public LBrick() {
		color = EnumColor.yellow;
		brick = new EnumColor[THREE][THREE];
		brick[1][0] = color;
		brick[1][1] = color;
		brick[1][2] = color;
		brick[2][2] = color;
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
	
	public void clearBrick(EnumStatus status) {
		for (int i=0;i<THREE;i++) {
			for ( int j=0; j<THREE; j++) {
				brick[i][j] = EnumColor.empty;
			}
		}
	}


	public void rotateLEFT(EnumStatus status) {
		clearBrick(status);
		switch(status) {
		case up:
			brick[1][2] = color;
			brick[2][2] = color;
			brick[THREE][2] = color;
			brick[THREE][1] = color;
			setStatus(EnumStatus.left);
			break;
		case right:
			brick[1][0] = color;
			brick[1][1] = color;
			brick[1][2] = color;
			brick[2][2] = color;
			setStatus(EnumStatus.up);
			break;
		case down:
			brick[0][1] = color;
			brick[1][1] = color;
			brick[2][1] = color;
			brick[0][2] = color;
			setStatus(EnumStatus.right);
			break;
		case left:
			brick[1][1] = color;
			brick[2][1] = color;
			brick[2][2] = color;
			brick[2][THREE] = color;
			setStatus(EnumStatus.down);
			break;
		}
		
	}

	public void rotateRIGHT(EnumStatus status) {
		clearBrick(status);
		switch(status) {
		case up:
			brick[0][1] = color;
			brick[1][1] = color;
			brick[2][1] = color;
			brick[0][2] = color;
			setStatus(EnumStatus.right);
			break;
		case right:
			brick[1][1] = color;
			brick[2][1] = color;
			brick[2][2] = color;
			brick[2][THREE] = color;
			setStatus(EnumStatus.down);
			break;
		case down:
			brick[1][2] = color;
			brick[2][2] = color;
			brick[THREE][2] = color;
			brick[THREE][1] = color;
			setStatus(EnumStatus.left);
			break;
		case left:
			brick[1][0] = color;
			brick[1][1] = color;
			brick[1][2] = color;
			brick[2][2] = color;
			setStatus(EnumStatus.up);
			break;
		}
	}

}
