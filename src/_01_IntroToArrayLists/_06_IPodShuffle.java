package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener {
	JFrame frame;
	
	JButton button;
	Song demo;
	boolean shuffling;
	ArrayList<Song> songList;
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
		songList = new ArrayList<Song>();
		demo = new Song("demo.mp3");
		songList.add(demo);
		shuffling = false;
		createUI(songList);
		
		}
		
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */

	

	public static void main(String[] args) {
		new _06_IPodShuffle();
		
	}

	public void createUI(ArrayList songs) {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("Surprise Me!");
		frame.add(button);
		frame.setVisible(true);
		button.addActionListener(this);
		frame.pack();

	}
	public void shuffleSongs(ArrayList<Song> songs) {
		Random r = new Random();
		int rand = r.nextInt(songs.size());
		r.nextInt(2);
		songs.get(rand).play();
		System.out.println("boopmoop");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			shuffleSongs(songList);
			System.out.println("moop");
		}
		

	}
}