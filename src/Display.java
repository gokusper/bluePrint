package bluePrint.src;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.*;

public class Display extends JFrame implements MouseListener{

	private JFrame frame;
	
//	private ArrayList<Card> cards;
	
	public Display(){
//		cards = new ArrayList<Card>();
		frame = new JFrame("The Manager");
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
	}
	
	/*
	 * returns -1 if Card at index1 is seen as less than Card at
	 * index2, 0 if equal, and 1 if greater than
	 */
	public int compare(int index1, int index2){
		return 0;
	}
	
	public static void main(String[] args){
		Display display = new Display();
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
