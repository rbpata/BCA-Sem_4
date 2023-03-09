//Write an applet that draw a rectangle divided in 5 equal parts.

package Unit4_Practicals;

import java.applet.*;
import java.awt.*;
/*
<applet code=rect width=400 height=450>
</applet>
*/
public class rect extends Applet
{
	public void paint(Graphics g)
	{
		g.drawRect(100,100,200,100);
		g.drawLine(100,120,300,120);
		g.drawLine(100,140,300,140);
		g.drawLine(100,160,300,160);
		g.drawLine(100,180,300,180);
		showStatus("Applet with Rectangle");
	}
}

