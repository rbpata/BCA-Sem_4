// Create an applet which draws a line, rectangle and filled circle in applet display area.

    package Unit4_Practicals;

    import java.applet.*;
    import java.awt.*;

        /*
        <applet code=shapes width=400 height=450>
        </applet>
        */
    public class shapes extends Applet {
    public void paint(Graphics g)
        {
                int x=10, y=25;
                int width=100, height=130;
                g.drawRect(x,y,width,height);
                g.drawString("Rectangle",10,170);
                g.drawLine(100,350,350,350);
                g.drawString("Line",175,370);
                g.fillOval(160,200,100,100);
                g.drawString("Filled Circle";,160,330);
                showStatus("Applet with line, rectangle and filled circle");
        }
    }