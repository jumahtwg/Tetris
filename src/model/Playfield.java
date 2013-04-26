package model;



public class Playfield {
	enum EnumStatus {up, right, down, left };
	enum EnumColor {empty, green, yellow, red, white, purple, orange, blue}
	private static final int THREE = 3;
	private EnumColor[][] playfield;
	private int middle;
	final private int playfieldWidth;
	final private int playfieldHeight;
	
	public Playfield(int height, int width) {
		playfieldHeight = height;
		playfieldWidth = width;
		playfield = new EnumColor[playfieldWidth][playfieldHeight];
		middle = playfieldWidth/2;
	}
	
	public EnumColor[][] getPlayfield() {
		return playfield;
	}
	
	public int getStartMiddle() {
		return middle;
	}
	
	public int getFieldWidth() {
		return playfieldWidth;
	}
	
	public void deleteRow(int rowNumber) {
		for(int i = 0; i <= playfieldWidth; i++) {
				playfield[i][rowNumber] = EnumColor.empty;
		}
		resetPlayfieldaD(rowNumber);
	}

	public void resetPlayfieldaD(int rowNumber){
		EnumColor[][] tmpPlayfield = new EnumColor[playfieldWidth][playfieldHeight];
		for (int i = 0 ;i <= playfieldWidth;i++) {
			for ( int j = playfieldHeight; j == 0; j--) {
				if(j == rowNumber) {
					tmpPlayfield[i][j] = playfield[i][j-1];
				}
				tmpPlayfield[i][j] = playfield[i][j];
			}
		}
		playfield = tmpPlayfield;
	}
	
	public void setBrick(EnumColor[][] brick, int x, int y) {
		for (int i = 0; i < THREE+1; i++) {
			for ( int j = 0; j < THREE+1; j++) {
				playfield[x-i][y-j] = brick[i][j];
			}
		}
	}
	
	public boolean getCheckCollision(EnumColor[][] brick, int x, int y) {
		for (int i = THREE; i == 0; i--) {
			for ( int j = 0; j <= THREE+1; j--) {
				if(brick[i][j] != EnumColor.empty) {
					if(playfield[x+i][y+j] != EnumColor.empty) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
