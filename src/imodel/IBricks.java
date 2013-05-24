package imodel;



public interface IBricks {
	
	int[][] getBrick();
	/*
	 * get the color or empty
	 */
	int getColor();
	/*
	 * rotate the brick to the left side
	 */
	void rotateLEFT();
	/*
	 * rotate the brick to the right side
	 */
	void rotateRIGHT();
	/*
	 * set the enum status (color or empty)
	 */
	void setDirection(int status);
	/*
	 * variable against magic numbers
	 */
	static final int THREE = 3;
	static final int FOUR = 4;
	static final int SQUAREBRICK = 1;
	static final int LBRICK = 2;
	static final int REVLBRICK = 3;
	static final int TBRICK = 4;
	static final int SBRICK = 5;
	static final int ZBRICK = 6;
	static final int IBRICK = 7;
	
	
	
	
}
