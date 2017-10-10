
//Frances Manuel
//Per.4
// 9 - 5

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class KikoAdventure extends JComponent implements MouseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static String nameOfApp = "Kiko's Adventure!";

	int screen = 999;
	int HP = 100;
	int HPRes = 0;

	public KikoAdventure() {
		addMouseListener(this);
	}

	public int randDmg(int chance) {
		int Dmg = (int) (Math.random() * 3 + 1);
		return (Dmg * 10);
	}

	public void paint(Graphics g) {
		if (screen == 999) {
			StartingScreen(g);

		} else if (screen == 666) {
			Lose(g);
		} else if (screen == 0) {
			Set1(g);
			//
		} else if (screen == 1) {
			Check(g);
		} else if (screen == 2) {
			Leave(g);
		} else if (screen == 3) {
			Sleep(g);
			//
		} else if (screen == 11) {
			LeaveW(g);
		} else if (screen == 12) {
			Sleep(g);
		} else if (screen == 13) {

			//
		} else if (screen == 111) {
			FightW(g);
		} else if (screen == 112) {
			Fail2(g);
		} else if (screen == 113) {
			Lose(g);
			//
		} else if (screen == 1111) {
			FightW1(g);
		} else if (screen == 1112) {
			Lose(g);
		} else if (screen == 1113) {
			Lose(g);
			//
		} else if (screen == 121) {
			NightWakeW(g);
		} else if (screen == 121) {
			Fail(g);
		} else if (screen == 1211) {
			FailNight(g);
		} else if (screen == 122) {

		} else if (screen == 123) {

			//
		} else if (screen == 21) {
			Fail(g);
		} else if (screen == 22) {
			Fail2(g);
		} else if (screen == 23) {
			Fail(g);
			//
		} else if (screen == 31) {
			NightWake(g);
			//
		} else if (screen == 311) {
			FailNight(g);

			///
		} else if (screen == 3111) {
			// vv WINN!!!
		} else if (screen == 9999) {
			Win(g);
		}
	}

	// EXAMPLE
	// public void XOXOXOXOXOX(Graphics g) {
	// g.setFont(new Font("27", Font.LAYOUT_LEFT_TO_RIGHT, 27));
	// g.setColor(Color.WHITE);
	// g.drawString(" ", 10, 50);
	//
	// g.drawString("[ ]", 10, 130);
	// g.drawString("[ ]", 10, 170);
	// g.drawString("[ ]", 10, 210);

	public void Lose(Graphics g) {
		g.setFont(new Font("30B", Font.BOLD, 30));
		g.setColor(Color.RED);
		g.drawString("YOU HAVE NOT PASSED AP COMP. SCI A", 10, 50);
	}

	public void Fail(Graphics g) {
		g.setFont(new Font("30B", Font.BOLD, 30));
		g.setColor(Color.RED);
		g.drawString("You have been caught by Danker and are Un-Prepared for the AP Exam handed to you.", 10, 50);
	}

	public void FailNight(Graphics g) {
		g.setFont(new Font("30B", Font.BOLD, 30));
		g.setColor(Color.RED);
		g.drawString("You have been caught by Danker and are handed the AP Exam packet!", 10, 50);
		g.drawString("You feel super ready but its too dark to see anything and scored [0]", 10, 80);
	}

	public void Fail2(Graphics g) {
		g.setFont(new Font("30B", Font.BOLD, 30));
		g.setColor(Color.RED);
		g.drawString("The door has disappeared and in its place is a desk with a packet writtin \"AP EXAM\" on top.",
				10, 50);
		g.drawString("You are forced take it and Fail.", 10, 80);
	}

	public void Win(Graphics g) {
		g.setFont(new Font("30B", Font.BOLD, 30));
		g.setColor(Color.GREEN);
		g.drawString("You passed AP Comp Sci A !", 10, 50);
		// START //
		g.drawString("> Restart <", 10, 130);

	}

	public void StartingScreen(Graphics g) {
		g.setFont(new Font("27", Font.LAYOUT_LEFT_TO_RIGHT, 27));
		g.setColor(Color.CYAN);
		g.drawString("W o u l d   y o u   l i k e   t o   s t a r t   y o u r   j o u r n e y ?", 10, 50);

		// START //
		g.drawString("> B e g i n <", 10, 130);

	}

	public void Set1(Graphics g) {
		g.setFont(new Font("27", Font.LAYOUT_LEFT_TO_RIGHT, 27));
		g.setColor(Color.WHITE);
		g.drawString("You wake up in a quiet room with four white walls and a door", 10, 50);

		// 0 //

		g.drawString("[ Look at surroundings ]", 10, 130);
		g.drawString("[ Try leaving the door ]", 10, 170);
		g.drawString("[ Go back to sleep ]", 10, 210);

	}

	public void Check(Graphics g) {
		g.setFont(new Font("27", Font.LAYOUT_LEFT_TO_RIGHT, 27));
		g.setColor(Color.WHITE);

		g.drawString("There's nothing particular about that room other than a small object in the corner.", 10, 50);
		g.drawString("You found > Black Magic Marker <", 10, 350);
		// 1 //
		g.drawString("[ Try leaving the door ]", 10, 130);
		g.drawString("[ Go back to sleep ]", 10, 170);
		g.drawString("", 10, 210);
	}

	public void LeaveW(Graphics g) {
		g.setFont(new Font("27", Font.LAYOUT_LEFT_TO_RIGHT, 27));
		g.setColor(Color.WHITE);
		g.drawString("You start your Journy in a land of wildlife.  ", 10, 50);
		g.drawString("There's a |Dirt Trail| as well as surrounding |Tall Grass|", 10, 80);
		g.drawString("> Black Magic Marker <", 10, 350);
		// 2 //
		// 1 - 1 //
		g.drawString("[ Follow the |Dirt Trail| ]", 10, 130);
		g.drawString("[ Turn around to the door you came from ]", 10, 170);
		g.drawString("[ Look through the |Tall Grass| ]", 10, 210);
	}

	public void FightW(Graphics g) {

		g.setFont(new Font("27B", Font.BOLD, 27));
		g.setColor(Color.RED);
		g.drawString("Here comes the Danker!  He hands you a packet writting [AP EXAM] on top!", 10, 50);
		g.setFont(new Font("24", Font.CENTER_BASELINE, 24));
		g.setColor(Color.GREEN);
		HP = HP - 0;
		g.drawString("HP: " + HP, 10, 80);

		// 1 - 1 - 1 //
		g.drawString("[ Use > Black Magic Marker < ]", 10, 130);
		g.drawString("[ Give Up ]", 10, 170);
		g.drawString("[ Run! ]", 10, 210);
	}

	public void FightW1(Graphics g) {

		g.setFont(new Font("27B", Font.BOLD, 27));
		g.setColor(Color.RED);
		g.drawString("You write in answers!", 10, 50);
		g.setFont(new Font("24", Font.CENTER_BASELINE, 24));
		g.setColor(Color.GREEN);
		int Dmg = randDmg(3);
		HP = HP - Dmg;
	if (HP > 0) {
		g.drawString("HP: " + HP, 10, 80);
	} else if (HP <= 0) {
		g.drawString("HP: > RIP < " , 10, 80);
	}
		g.drawString("[ Use > Black Magic Marker < ]", 10, 130);
		g.drawString("[ Give Up ]", 10, 170);
		g.drawString("[ Run! ]", 10, 210);
	}

	public void Leave(Graphics g) {
		g.setFont(new Font("27", Font.LAYOUT_LEFT_TO_RIGHT, 27));
		g.setColor(Color.WHITE);
		g.drawString("You start your Journy in a land of wildlife.  ", 10, 50);
		g.drawString("There's a |Dirt Trail| as well as surrounding |Tall Grass|", 10, 80);
		// 2 //
		g.drawString("[ Follow the |Dirt Trail| ]", 10, 130);
		g.drawString("[ Turn around to the door you came from ]", 10, 170);
		g.drawString("[ Look through the |Tall Grass| ]", 10, 210);
	}

	public void Sleep(Graphics g) {
		g.setFont(new Font("27", Font.LAYOUT_LEFT_TO_RIGHT, 27));
		g.setColor(Color.WHITE);
		g.drawString("You go back to sleep", 10, 50);
		// 3 //
		// 1 - 2 //
		g.drawString("[ Wake up ]", 10, 130);

	}

	public void NightWake(Graphics g) {
		g.setFont(new Font("27", Font.LAYOUT_LEFT_TO_RIGHT, 27));
		g.setColor(Color.WHITE);

		g.drawString("You wake up in a room with four white walls and a door hearing crickets just outside", 10, 50);
		// 3 - 1 //
		// 1 - 2 - 1 //
		g.drawString("[ Try leaving the door ]", 10, 130);
		g.drawString("[ ]", 10, 170);
		g.drawString("[ ]", 10, 210);
	}

	public void NightWakeW(Graphics g) {
		g.setFont(new Font("27", Font.LAYOUT_LEFT_TO_RIGHT, 27));
		g.setColor(Color.WHITE);

		g.drawString("You wake up in a room with four white walls and a door hearing crickets just outside", 10, 50);
		g.drawString("> Black Magic Marker <", 10, 350);
		// 3 - 1 //
		// 1 - 2 - 1 //
		g.drawString("[ Try leaving the door ]", 10, 130);
		g.drawString("[ ]", 10, 170);
		g.drawString("[ ]", 10, 210);
	}

	public void FIXTHIS2(Graphics g) {
		g.setFont(new Font("27", Font.LAYOUT_LEFT_TO_RIGHT, 27));
		g.setColor(Color.WHITE);
		g.drawString("You start your Journy in a land of wildlife.  "
				+ "There's a |Dirt Trail| as well as surrounding |Tall Grass|", 10, 50);

		g.drawString("[ Follow the |Dirt Trail| ]", 10, 130);
		g.drawString("[ Go back through the door where you came from ]", 10, 170);
		g.drawString("[ Look through the |Tall Grass| ]", 10, 210);
	}

	public void FIXTHIS3(Graphics g) {
		g.setFont(new Font("27", Font.LAYOUT_LEFT_TO_RIGHT, 27));
		g.setColor(Color.WHITE);
		g.drawString("You go back to sleep", 10, 50);

		g.drawString("[ Wake up ]", 10, 130);
		// 1 - 1 - 1 //
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		//
		System.out.println("X:" + e.getX() + " Y:" + e.getY());
		System.out.println("screen: " + screen);
		if (e.getX() > 800 && e.getY() > 800) {
			screen = 999;
			HP = 100;
		} else if (e.getX() > 9 && e.getX() < 350 && e.getY() > 109 && e.getY() < 126 && (screen == 9999)) {
			screen = 999;
			HP = 100;
		} else if (e.getX() > 9 && e.getX() < 350 && e.getY() > 109 && e.getY() < 126 && (screen == 666)) {
			screen = 999;
			HP = 100;
		} else if (e.getX() > 9 && e.getX() < 350 && e.getY() > 109 && e.getY() < 126 && (screen == 999)) {
			screen = 0;
		} else if (e.getX() > 9 && e.getX() < 350 && e.getY() > 109 && e.getY() < 126 && (HP <= 0)) {
			screen = 9999;

			/// START ///
			//// ////
		} else if (e.getX() > 9 && e.getX() < 350 && e.getY() > 109 && e.getY() < 126 && (screen == 0)) {
			screen = 1;
		} else if (e.getX() > 9 && e.getX() < 350 && e.getY() > 149 && e.getY() < 176 && (screen == 0)) {
			screen = 2;
		} else if (e.getX() > 9 && e.getX() < 350 && e.getY() > 189 && e.getY() < 226 && (screen == 0)) {
			screen = 3;
			//// 0 ////
			//// ////
		} else if (e.getX() > 9 && e.getX() < 350 && e.getY() > 109 && e.getY() < 126 && (screen == 1)) {
			screen = 11;
		} else if (e.getX() > 9 && e.getX() < 350 && e.getY() > 149 && e.getY() < 176 && (screen == 1)) {
			screen = 12;
		} else if (e.getX() > 9 && e.getX() < 350 && e.getY() > 189 && e.getY() < 226 && (screen == 1)) {
			screen = 13;
			//// 1 ////
		} else if (e.getX() > 9 && e.getX() < 350 && e.getY() > 109 && e.getY() < 126 && (screen == 12)) {
			screen = 121;
		} else if (e.getX() > 9 && e.getX() < 350 && e.getY() > 109 && e.getY() < 126 && (screen == 121)) {
			screen = 1211;
			/// 1 - 2 ///

		} else if (e.getX() > 9 && e.getX() < 350 && e.getY() > 109 && e.getY() < 126 && (screen == 11)) {
			screen = 111;
		} else if (e.getX() > 9 && e.getX() < 350 && e.getY() > 149 && e.getY() < 176 && (screen == 11)) {
			screen = 112;
		} else if (e.getX() > 9 && e.getX() < 350 && e.getY() > 189 && e.getY() < 226 && (screen == 11)) {
			screen = 113;
			/// 1 - 1 ///
		} else if (e.getX() > 9 && e.getX() < 350 && e.getY() > 109 && e.getY() < 126 && (screen == 111)) {
			screen = 1111;
		} else if (e.getX() > 9 && e.getX() < 350 && e.getY() > 149 && e.getY() < 176 && (screen == 111)) {
			screen = 666;
		} else if (e.getX() > 9 && e.getX() < 350 && e.getY() > 189 && e.getY() < 226 && (screen == 111)) {
			screen = 666;
			/// 1 - 1 - 1 ///
			//// ////
		} else if (e.getX() > 9 && e.getX() < 350 && e.getY() > 109 && e.getY() < 126 && (screen == 2)) {
			screen = 21;
		} else if (e.getX() > 9 && e.getX() < 350 && e.getY() > 149 && e.getY() < 176 && (screen == 2)) {
			screen = 22;
		} else if (e.getX() > 9 && e.getX() < 350 && e.getY() > 189 && e.getY() < 226 && (screen == 2)) {
			screen = 23;
			//// 2 ////
		} else if (e.getX() > 9 && e.getX() < 350 && e.getY() > 109 && e.getY() < 126 && (screen == 21)) {
			screen = 211;
		} else if (e.getX() > 9 && e.getX() < 350 && e.getY() > 149 && e.getY() < 176 && (screen == 21)) {
			screen = 212;
		} else if (e.getX() > 9 && e.getX() < 350 && e.getY() > 189 && e.getY() < 226 && (screen == 21)) {
			screen = 213;
			///
		} else if (e.getX() > 9 && e.getX() < 350 && e.getY() > 109 && e.getY() < 126 && (screen == 1111)) {
			screen = 1111;
		} else if (e.getX() > 9 && e.getX() < 350 && e.getY() > 149 && e.getY() < 176 && (screen == 1112)) {
			screen = 666;
		} else if (e.getX() > 9 && e.getX() < 350 && e.getY() > 189 && e.getY() < 226 && (screen == 1113)) {
			screen = 666;
			///

			/// 2 - 1 ///
			//// ////
		} else if (e.getX() > 9 && e.getX() < 350 && e.getY() > 109 && e.getY() < 126 && (screen == 3)) {
			screen = 31;
		} else if (e.getX() > 9 && e.getX() < 350 && e.getY() > 149 && e.getY() < 176 && (screen == 3)) {
			screen = 32;
		} else if (e.getX() > 9 && e.getX() < 350 && e.getY() > 189 && e.getY() < 226 && (screen == 3)) {
			screen = 33;
			//// 3 ////
		} else if (e.getX() > 9 && e.getX() < 350 && e.getY() > 109 && e.getY() < 126 && (screen == 31)) {
			screen = 311;
		} else if (e.getX() > 9 && e.getX() < 350 && e.getY() > 109 && e.getY() < 126 && (screen == 311)) {
			screen = 666;

			///
			System.out.println("screen: " + screen);
		}
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	public static void main(String[] args) {
		JFrame frame = new JFrame(nameOfApp);
		frame.getDefaultCloseOperation();
		frame.add(new KikoAdventure());
		frame.setSize(1620, 980);
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.black);
	}

}