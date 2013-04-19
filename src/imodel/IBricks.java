package imodel;

public interface IBricks {
	
	enum EnumStatus {up, right, down, left };
	public int[][] getBrick();
	public int getColor();
	public void rotateLEFT(EnumStatus stat);
	public void rotateRIGHT(EnumStatus stat);
	
	
}
