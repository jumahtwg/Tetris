package view;

import java.util.Scanner;

import observer.IObserver;
import controller.Controller;
import controller.Controller.EnumMove;

public class TUI implements IObserver {
	
	private class TextInput implements Runnable {

		private Scanner scan;
		private Controller ctrl;
		
		public TextInput(Controller ctrl)  {
			this.ctrl = ctrl;
			scan = new Scanner(System.in);
		}
		
		public void run() {
			while (true) {		
				int input = scan.nextInt();
				
				switch (input) {
				case 4:
					ctrl.setMove(EnumMove.moveLeft);
					break;
				case 6:
					ctrl.setMove(EnumMove.moveRight);
					break;
				case 5:
					ctrl.setMove(EnumMove.moveDown);		
					break;
				default:
					break;
				}				
			}			
		}
		
	}
	
	private Thread inputThread;
	private Controller controller;
	
	public TUI(Controller controller) {
		super();
		this.controller = controller;
		this.inputThread = new Thread(new TextInput(controller));
		this.inputThread.setDaemon(true);
		this.inputThread.setName("InputThread");
		this.inputThread.start();

	}

	@Override
	public void updateInput() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateShowGameArray() {
		int[][] playfield = controller.getPlayfield();
		for (int i = 0; i <= controller.getySize()-1;i++) {
			System.out.println("");
			for ( int j = 0; j <= controller.getxSize()-1; j++) {
				System.out.print(playfield[i][j]);
			}
		}
		System.out.println("");
		
		
	}

	@Override
	public void updateBrickStatus() {
		// TODO Auto-generated method stub
		
	}

}
