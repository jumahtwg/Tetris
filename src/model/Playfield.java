package model;

public class Playfield {
	enum EnumColor {empty, green, yellow, red, white, purple, orange, blue};
	private EnumColor[][][] Playfield;
	private int middle;
	private int playfieldLength;
	
	public Playfield(int i, int j) {
		Playfield = new EnumColor[i][j][];
		middle = i/2;
	}
	
	public EnumColor[][][] getPlayfield() {
		return Playfield;
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
				Playfield[i][rowNumber][j] = EnumColor.empty;
			}
		}
	}
	public void deleteBrick(int Color, int x, int y) {
		
	}
	
	public void setBrick(int Color, int x, int y) {
		
	}
	
	public boolean checkCollision() {
		return true;
	}
}
