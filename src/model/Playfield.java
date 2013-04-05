package model;

public class Playfield {
	int[][][] Playfield;
	int middle;
	int playfieldLength;
	
	public Playfield(int i, int j) {
		Playfield = new int[i][j][];
		middle = i/2;
	}
	
	public int[][][] getPlayfield() {
		return Playfield;
	}
	
	public int getStartMiddle() {
		return middle;
	}
	
	public void deleteRow(int rowNumber) {
		for(int i = 0; i <= middle*2; i++) {
			for(int j = 1;j <= 7; j++) {
				Playfield[i][rowNumber][j] = 0;
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
