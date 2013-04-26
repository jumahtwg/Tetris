package model;

import imodel.IBricks;

public class SquareBrick implements IBricks {

	private controller.Controller.EnumColor[][] brick;
	private controller.Controller.EnumColor color;
	private EnumStatus status;
	
	/*
	 * standard constructor
	 */
	public SquareBrick() {
		status = EnumStatus.up;
		color = controller.Controller.EnumColor.green;
		brick = new controller.Controller.EnumColor[THREE][THREE];
		brick[1][1] = color;
		brick[1][2] = color;
		brick[2][1] = color;
		brick[2][2] = color;
		
	}
	public controller.Controller.EnumColor[][] getBrick() {
		return brick;
	}

	public controller.Controller.EnumColor getColor() {
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
