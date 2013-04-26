package model;

public class Playfield {
	enum EnumColor {empty, green, yellow, red, white, purple, orange, blue};
	private EnumColor[][][] playfield;
	private int middle;
	private int playfieldLength;
	
	public Playfield(int i, int j) {
		playfield = new EnumColor[i][j][];
		middle = i/2;
	}
	
	public EnumColor[][][] getPlayfield() {
		return playfield;
	}
	
	public int getStartMiddle() {
		return middle;
	}
	
	public int getFieldLength() {
		return playfieldLength;
	}
	
	public void deleteRow(int rowNumber) {
		for(int i = 0; i <= middle*2; i++) {
			for(int j = 1;j <= 7; j++) {
				playfield[i][rowNumber][j] = EnumColor.empty;
			}
		}
	}
	public void deleteBrick(EnumColor color, int x, int y) {
		
	}
	
	public void setBrick(EnumColor color, int x, int y) {
		
	}
	
	public boolean checkCollision() {
		return true;
	}
}
