package SixthClass;

import java.net.URI;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String vote = JOptionPane.showInputDialog("Voting Booth! Would you like a john cena video to wait?");
		if (vote.equalsIgnoreCase("yes")) {
			playVideo("https://www.youtube.com/watch?v=XOeZq9dE3kU");
		} else {
			playVideo("https://www.youtube.com/watch?v=GVN17U3Vg34");
		}
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
