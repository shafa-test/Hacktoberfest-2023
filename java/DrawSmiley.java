import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
class DrawSmiley extends JPanel
{
  public void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
          g.setColor( Color.BLACK );
g.fillOval( 15, 5, 60, 60 );
g.fillOval( 150, 5, 60, 60 );
      
      g.setColor( Color.WHITE );
      g.fillOval( 11, 11, 200, 200 );
      
      g.setColor( Color.BLACK );
g.fillOval( 41, 55, 41, 41 );
g.fillOval( 135, 55, 41, 41 );

g.fillOval( 55, 115, 112, 55 );
g.setColor( Color.WHITE );
g.fillOval( 50, 60, 20, 20 );
g.fillOval( 144, 60, 20, 20 );

g.setColor( Color.WHITE );

g.fillOval( 50, 115, 120, 40 );

g.setColor( Color.BLACK );

g.fillOval( 90, 115, 30, 10);




    }
}