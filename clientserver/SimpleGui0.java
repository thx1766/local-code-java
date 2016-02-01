/*
adapted from http://www.cise.ufl.edu/~amyles/tutorials/tcpchat/
*/

/*
single key action from
http://stackoverflow.com/questions/11373101/how-to-set-a-single-key-mnemonic-in-button-in-java
*/

import java.lang.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.Action;

class SimpleGui0 {
	public static void main(String args[]) {
		//a button first
		JButton myButton = new JButton("Click this!");
		//myButton.setMnemonic(KeyEvent.VK_C);
		myButton.setMnemonic(KeyEvent.c);
		//button can be pressed by Alt-C

		//create a panel with flow layout
		//flow layout allows components to be at their preferred size
		JPanel myPane = new JPanel(new FlowLayout());
		myPane.add(myButton);
		// add the button to the pane

		//action
		Action buttonAction = new ButtonAction("CLICK ME", "This is a click me JButton");
		JButton button2 = new JButton(buttonAction);

		//the frame
		JFrame myFrame = new JFrame("Simple GUI 0");
		myFrame.setContentPane(myPane);
		//use myPane as the default pane
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Exit ptogram when frame is closed
		myFrame.setLocation(150, 150);
		//location at (150,150)
		myFrame.pack();
		//frame ready: pack for display
		myFrame.setVisible(true);
		//make it visible
	}
}
