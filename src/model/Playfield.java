package model;



public class Playfield {
	private static final int FOUR = 4;
	private int[][] playfield;
	private int middle;
	final private int playfieldWidth;
	final private int playfieldHeight;
	
	public Playfield(int height, int width) {
		playfieldHeight = height;
		playfieldWidth = width;
		playfield = new int[playfieldWidth][playfieldHeight];
		middle = (playfieldWidth/2) - 2;
	}
	
	public int[][] getPlayfield() {
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
				playfield[i][rowNumber] = 0;
		}
		resetPlayfieldaDelete(rowNumber);
	}

	public void resetPlayfieldaDelete(int rowNumber){
		int[][] tmpPlayfield = new int[playfieldWidth][playfieldHeight];
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
	
	public void setBrick(int[][] brick, int x, int y) {
		for (int i = 0; i < FOUR; i++) {
			for ( int j = 0; j < FOUR; j++) {
				playfield[x+i][y+j] = brick[i][j];
			}
		}
	}
	
	public boolean getCheckCollision(int[][] brick, int x, int y) {
		for (int i = FOUR; i == 0; i--) {
			for ( int j = 0; j <= FOUR+1; j--) {
				if(brick[i][j] != 0) {
					if(playfield[x+i][y+j] != 0) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
