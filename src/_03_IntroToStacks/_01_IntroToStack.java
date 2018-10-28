package _03_IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double> doubles = new Stack<Double>();
		Random r = new Random();
		Double min = 0.0;
		Double max = 100.0;
		Double rand;
		
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for (int i = 0; i < 100; i++) {
			rand = (Math.random()*((max-min)+1))+min;
			doubles.push(rand);		
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		String str1 = JOptionPane.showInputDialog("Enter two numbers between 0 and 100, inclusive.  SMALL NUMBER:");
		String str2 = JOptionPane.showInputDialog("Enter two numbers between 0 and 100, inclusive.  LARGE NUMBER:");
		int n1 = Integer.parseInt(str1);
		int n2 = Integer.parseInt(str2);
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		for (int i = 0; i < 100; i++) {
			doubles.pop();
			if (doubles.get(i).intValue() >= n1 && doubles.get(i).intValue() <= n2) {
				System.out.println(doubles.get(i));
			}
			
		}
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
