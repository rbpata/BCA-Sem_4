package Unit4_Practicals;

//Write a Java applet that draws a circle centered in the centre of the applet. The radius of the
// circle should be passed as a parameter.

import java.applet.*;
import java.awt.*;
/*
<applet code=circle width=400 height=400>
<param Name="radius" Value="100">
</applet>
*/
public class circle extends Applet
{
	public void paint(Graphics g)
	{
		Dimension d=getSize();
		int xc=d.width/2;
		int yc=d.width/2;
		String str;
		int r;
		str=getParameter("radius");
		r=Integer.parseInt(str);
		g.setColor(Color.cyan);
		g.fillOval(xc-r,yc-r,2*r,2*r);
	}
}

