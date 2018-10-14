package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener {

	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
		ArrayList<Song> songList = new ArrayList<Song>();
		Song demo = new Song("demo.mp3");
		songList.add(demo);
		Random r = new Random();
		r.nextInt(2);
		createUI(songList);
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */

	}

	public static void main(String[] args) {
		new _06_IPodShuffle();

	}

	public void createUI(ArrayList songs) {
		JFrame frame = new JFrame();
		JButton button = new JButton("Surprise Me!");
		frame.add(button);
		frame.setVisible(true);
		button.addActionListener(this);
		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}