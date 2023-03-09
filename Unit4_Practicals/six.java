//Write an applet that draw a circle divided in 6 equal parts.

package Unit4_Practicals;

import java.applet.*;
import java.awt.*;
/*
<applet code=divcircle width=400 height=450>
</applet>
*/
public class divcircle extends Applet
{
	public void paint(Graphics g)
	{
		g.drawOval(10,10,100,100);
		g.drawLine(60,10,60,110);
		g.drawLine(10,60,110,60);
		g.drawLine(25,25,95,95);
		g.drawLine(95,25,25,95);
	}
}
