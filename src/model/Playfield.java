package model;



public class Playfield {
	private static final int FOUR = 4;
	private static final int THREE = 3;
	private int[][] playfield;
	private int middle;
	private final int playfieldWidth;
	private final int playfieldHeight;
	
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
	
	public void setBrick(int[][] brick, int color, int x, int y) {
		if (color == 7) {
			//TO-DO
			return;
		} else {
		if (x == 0) {
			for (int i = 0; i < THREE; i++) {
				for ( int j = 0; j < THREE; j++) {
					playfield[x+i][y+j] = brick[j][i];
				}
			}
		} else {
			deletebrick(brick, color, x-1, y);
			for (int i = 0; i < THREE; i++) {
				for ( int j = 0; j <= THREE; j++) {
					if (playfield[x+i][y+j] == 0) {
						playfield[x+i][y+j] = brick[j][i];
					} else {
						// do nothing
						return;
					}
				}
			}
		}
		}

	}
	
	public void deletebrick(int[][] brick, int color, int x, int y) {
		for (int i = 0; i < FOUR; i++) {
			for ( int j = 0; j < FOUR; j++) {
				if (playfield[x+i][y+j] == color) {
					playfield[x+i][y+j] = 0;
				} else {
					playfield[x+i][y+j] = brick[j][i];
				}
			}
		}
	}
	
	public boolean getCheckCollision(int[][] brick, int color, int x, int y) {
		if ((x + 2) == playfieldHeight) {
			return true;
		} else {
			for ( int j = 0; j <= THREE; j++) {
				if (brick[j][2] != 0 && playfield[x+2][y+j] != 0) {
						return true;
				}
			}
		}
		

		return false;
	}
}
