package model;

import imodel.IBricks;

public class SquareBrick implements IBricks {

	private EnumColor[][] brick;
	private EnumColor color;
	private EnumStatus status;
	
	SquareBrick() {
		status = EnumStatus.up;
		color = EnumColor.green;
		brick = new EnumColor[THREE][THREE];
		brick[1][1] = color;
		brick[1][2] = color;
		brick[2][1] = color;
		brick[2][2] = color;
		
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
	

	public void rotateLEFT(EnumStatus status) {
		//squareBrick => do nothing
		
	}
	public void rotateRIGHT(EnumStatus status) {
		//squareBrick => do nothing
		
	}
	@Override
	public void setStatus(EnumStatus status) {
		this.status = status;
		
	}

}
