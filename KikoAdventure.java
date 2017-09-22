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
		
		int screen = 0;
		
		public KikoAdventure() {
			addMouseListener(this);
		}
		
		public void paint(Graphics g) {
			if (screen == 0) {
				startingScreen(g);
			} else if (screen == 1) {
				Check(g);
			} else if (screen == 2) {
				Leave(g);
			} else if (screen == 3) {
				Sleep(g);
			} else if (screen == 11) {
				Leave(g);
			}
		}
			
		public void startingScreen(Graphics g) {
			g.setFont(new Font("27", Font.LAYOUT_LEFT_TO_RIGHT, 27));
			g.setColor(Color.WHITE);
			g.drawString("You wake up in a quiet room with four white walls and a door", 10, 50);
			
			g.drawString("[ Look at surroundings ]", 10, 130);
			g.drawString("[ Try leaving the door ]", 10, 170);
			g.drawString("[ Go back to sleep ]", 10, 210);
		}
		public void Check(Graphics g) {
			g.setFont(new Font("27", Font.LAYOUT_LEFT_TO_RIGHT, 27));
			g.setColor(Color.WHITE);
			
			g.drawString("You find > Black Magic Stick <", 10, 50);
			
			g.drawString("[ Try leaving the door ]", 10, 130);
			g.drawString("[ Go back to sleep ]", 10, 170);
			g.drawString("", 10, 210);
		}
		public void Leave(Graphics g) {
			g.setFont(new Font("27", Font.LAYOUT_LEFT_TO_RIGHT, 27));
			g.setColor(Color.WHITE);
			g.drawString("You start your Journy in a land of wildlife.  "
					+ "There's a |Dirt Trail| as well as surrounding |Tall Grass|", 10, 50);
			
			g.drawString("[ Follow the |Dirt Trail| ]", 10, 130);
			g.drawString("[ Go back through the door where you came from ]", 10, 170);
			g.drawString("[ Look through the |Tall Grass| ]", 10, 210);
		}
		public void Sleep(Graphics g) {
			g.setFont(new Font("27", Font.LAYOUT_LEFT_TO_RIGHT, 27));
			g.setColor(Color.WHITE);
			g.drawString("You go back to sleep", 10, 50);
			
			g.drawString("[ Look at surroundings ]", 10, 130);
			g.drawString("[ Try leaving the door ]", 10, 170);
			g.drawString("[ Go back to sleep ]", 10, 210);
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println(e.getX() + " " + e.getY());
			if (e.getX()> 9 && e.getX()< 350 && e.getY()> 109 && e.getY()< 126 && (screen == 0)) {
				screen = 1;
			} else if (e.getX()> 9 && e.getX()< 350 && e.getY()> 149 && e.getY()< 176 && (screen == 0)) {
				screen = 2;
			} else if (e.getX()> 9 && e.getX()< 350 && e.getY()> 189 && e.getY()< 226 && (screen == 0)) {
				screen = 3;
			} else if (e.getX()> 9 && e.getX()< 350 && e.getY()> 109 && e.getY()< 126 && (screen == 1)) {
				screen = 11;
			} else if (e.getX()> 9 && e.getX()< 350 && e.getY()> 149 && e.getY()< 176 && (screen == 1)) {
				screen = 21;
			} else if (e.getX()> 9 && e.getX()< 350 && e.getY()> 189 && e.getY()< 226 && (screen == 1)) {
				screen = 31;
			repaint();
		}
}
			

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		public static void main(String[] args) {
			JFrame frame = new JFrame(nameOfApp);
			frame.getDefaultCloseOperation();
			frame.add(new KikoAdventure());
			frame.setSize(800, 300);
			frame.setVisible(true);
			frame.getContentPane().setBackground(Color.DARK_GRAY);
		}

	}