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

public class KikosAdventure extends JComponent implements MouseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static String nameOfApp = "Kiko's Adventure!";

	int screen = 999;

	public KikosAdventure() {
		addMouseListener(this);
	}
	 public int randDmg(int chance) {
	 int Dmg = (int)(Math.random() * 3 + 1);
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
		
		} else if (screen == 113) {
			
		// 
		} else if (screen == 121) {
			NightWakeW(g);
		} else if (screen == 122) {
			
		} else if (screen == 123) {
		
		//
		} else if (screen == 31) {
			NightWake(g);
		//
		} else if (screen == 311) {
		///
		} else if (screen == 3111) {
		
		
	}
}		
	
// EXAMPLE
// 	public void XOXOXOXOXOX(Graphics g) {	
//	g.setFont(new Font("27", Font.LAYOUT_LEFT_TO_RIGHT, 27));
//	g.setColor(Color.WHITE);
//	g.drawString("  ", 10, 50);
//
//	g.drawString("[  ]", 10, 130);
//	g.drawString("[  ]", 10, 170);
//	g.drawString("[  ]", 10, 210); 
	

	
	




	public void Lose(Graphics g) {
		g.setFont(new Font("30B", Font.BOLD, 30));
		g.setColor(Color.RED);
		g.drawString("YOU HAVE NOT FULFILLED YOUR DESTINY", 10, 50);

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
		g.drawString("Here comes the Danker!", 10, 50);
		g.setFont(new Font("24", Font.CENTER_BASELINE, 24));
		g.setColor(Color.GREEN);
		int Dmg1 = randDmg(3);
		int Dmg2 = randDmg(3);
		g.drawString("HP: " + (100 - Dmg1 + Dmg2), 10, 80);
		
		// 1 - 1 - 1 //
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
		
		if (e.getX()> 800 && e.getY()> 800) {
			screen = 999;
		} else if (e.getX()> 9 && e.getX()< 350 && e.getY()> 109 && e.getY()< 126 && (screen == 999)) {
			screen = 0;
		/// START ///
		//// ////
		} else if (e.getX()> 9 && e.getX()< 350 && e.getY()> 109 && e.getY()< 126 && (screen == 0)) {
			screen = 1;
		} else if (e.getX()> 9 && e.getX()< 350 && e.getY()> 149 && e.getY()< 176 && (screen == 0)) {
			screen = 2;
		} else if (e.getX()> 9 && e.getX()< 350 && e.getY()> 189 && e.getY()< 226 && (screen == 0)) {
			screen = 3;
		//// 0 ////
		//// ////
		} else if (e.getX()> 9 && e.getX()< 350 && e.getY()> 109 && e.getY()< 126 && (screen == 1)) {
			screen = 11;
		} else if (e.getX()> 9 && e.getX()< 350 && e.getY()> 149 && e.getY()< 176 && (screen == 1)) {
			screen = 12;
		} else if (e.getX()> 9 && e.getX()< 350 && e.getY()> 189 && e.getY()< 226 && (screen == 1)) {
			screen = 13;
		//// 1 ////
		} else if (e.getX()> 9 && e.getX()< 350 && e.getY()> 109 && e.getY()< 126 && (screen == 12)) {
			screen = 121;
		/// 1 - 2 ///
		
		} else if (e.getX()> 9 && e.getX()< 350 && e.getY()> 109 && e.getY()< 126 && (screen == 11)) {
			screen = 111;
		} else if (e.getX()> 9 && e.getX()< 350 && e.getY()> 149 && e.getY()< 176 && (screen == 11)) {
			screen = 112;
		} else if (e.getX()> 9 && e.getX()< 350 && e.getY()> 189 && e.getY()< 226 && (screen == 11)) {
			screen = 113;			
		/// 1 - 1 ///
		} else if (e.getX()> 9 && e.getX()< 350 && e.getY()> 109 && e.getY()< 126 && (screen == 111)) {
			screen = 1111;
		} else if (e.getX()> 9 && e.getX()< 350 && e.getY()> 149 && e.getY()< 176 && (screen == 111)) {
			screen = 1112;
		} else if (e.getX()> 9 && e.getX()< 350 && e.getY()> 189 && e.getY()< 226 && (screen == 111)) {
			screen = 1113;
		/// 1 - 1 - 1 ///
		//// ////
		} else if (e.getX()> 9 && e.getX()< 350 && e.getY()> 109 && e.getY()< 126 && (screen == 2)) {
			screen = 21;
		} else if (e.getX()> 9 && e.getX()< 350 && e.getY()> 149 && e.getY()< 176 && (screen == 2)) {
			screen = 22;
		} else if (e.getX()> 9 && e.getX()< 350 && e.getY()> 189 && e.getY()< 226 && (screen == 2)) {
			screen = 23;
		//// 2 ////
		} else if (e.getX()> 9 && e.getX()< 350 && e.getY()> 109 && e.getY()< 126 && (screen == 21)) {
			screen = 211;
		} else if (e.getX()> 9 && e.getX()< 350 && e.getY()> 149 && e.getY()< 176 && (screen == 21)) {
			screen = 212;
		} else if (e.getX()> 9 && e.getX()< 350 && e.getY()> 189 && e.getY()< 226 && (screen == 21)) {
			screen = 213;
		/// 2 - 1 ///
		//// ////
		} else if (e.getX()> 9 && e.getX()< 350 && e.getY()> 109 && e.getY()< 126 && (screen == 3)) {
			screen = 31;
		} else if (e.getX()> 9 && e.getX()< 350 && e.getY()> 149 && e.getY()< 176 && (screen == 3)) {
			screen = 32;
		} else if (e.getX()> 9 && e.getX()< 350 && e.getY()> 189 && e.getY()< 226 && (screen == 3)) {
			screen = 33;
		//// 3 ////
		} else if (e.getX()> 9 && e.getX()< 350 && e.getY()> 109 && e.getY()< 126 && (screen == 31)) {
			screen = 311;
		} else if (e.getX()> 9 && e.getX()< 350 && e.getY()> 149 && e.getY()< 176 && (screen == 31)) {
			screen = 312;
		} else if (e.getX()> 9 && e.getX()< 350 && e.getY()> 189 && e.getY()< 226 && (screen == 31)) {
			screen = 313;
		//// 3 - 1 ////
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
		frame.add(new KikosAdventure());
		frame.setSize(1620, 980);
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.black);
	}

}