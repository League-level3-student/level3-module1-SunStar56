package _03_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
	JFrame frame;
	JPanel panel;
	JLabel label;
	Stack<Character> chars;
	Stack<Character> deletedChars;
	String CharString;

	public _02_TextUndoRedo() {
		chars = new Stack<Character>();
		deletedChars = new Stack<Character>();
		createUI(chars);

	}

	public static void main(String[] args) {
		new _02_TextUndoRedo();

	}

	public void createUI(Stack<Character> chars) {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel("");
		frame.add(label);
		frame.setVisible(true);
		frame.addKeyListener(this);
		frame.pack();

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			deletedChars.push(chars.peek());
			System.out.println(deletedChars);
			chars.pop();
			System.out.println(chars);
			for (int i = 0; i < chars.size() - 1; i++) {
				System.out.println(chars.get(i));
				CharString = CharString + Character.toString(chars.get(i));
			}
			label.setText(CharString);
		} else {
			label.setText(label.getText() + e.getKeyChar() + "");
			frame.pack();
			Character c = e.getKeyChar();
			chars.push(c);
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}

}
/*
 * Create a JFrame with a JPanel and a JLabel.
 * 
 * Every time a key is pressed, add that character to the JLabel. It should look
 * like a basic text editor.
 * 
 * Make it so that every time the BACKSPACE key is pressed, the last character
 * is erased from the JLabel. Save that deleted character onto a Stack of
 * Characters.
 * 
 * Choose a key to be the Undo key. Make it so that when that key is pressed,
 * the top Character is popped off the Stack and added back to the JLabel.
 * 
 */