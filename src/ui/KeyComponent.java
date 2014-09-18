package ui;

import java.awt.*;
import javax.swing.JComponent;
import java.awt.geom.Rectangle2D;


public class KeyComponent extends JComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Color fill = Color.WHITE;
	private Color border = Color.BLACK;
	private Color label = Color.GRAY;
	private Boolean useOutline = false;
	private String lbl = "";
	
//	public KeyComponent(int x, int y, int width, int height)
//	{
//		htop = x;
//		hleft = y;
//		hwidth = width;
//		hheight = height;
//	}
//	
//	public KeyComponent(int x, int y, int width, int height, Color color)
//	{
//		htop = x;
//		hleft = y;
//		hwidth = width;
//		hheight = height;
//		fill = color;
//	}
//	
//	public KeyComponent(int x, int y, int width, int height, Color color, String label)
//	{
//		htop = x;
//		hleft = y;
//		hwidth = width;
//		hheight = height;
//		fill = color;
//		lbl = label;
//	}
	
	public KeyComponent(int x, int y, int width, int height, Color bkgd, String label, Color outline, Color labelColor)
	{
		htop = x;
		hleft = y;
		hwidth = width;
		hheight = height;
		fill = bkgd;
		useOutline = true;
		border = outline;
		this.label = labelColor;
		lbl = label;
	}
	
	public String getKeyName()
	{
		return lbl;
	}
	
	int hwidth = 0;
	int hheight = 0;
	int hleft = 0;
	int htop = 0;
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(fill);
		Rectangle2D.Double base = new Rectangle2D.Double(hleft, htop, hwidth, hheight);
		g2.fill(base);
		
		if (useOutline == true)
		{
			g2.setColor(border);
			//Rectangle2D.Double line = new Rectangle2D.Double(hleft, htop, hwidth, hheight);
			g2.drawRect(hleft, htop, hwidth, hheight);
		}
		
		g2.setColor(label);
		g2.drawString(lbl, hleft + 1, htop + hheight - 5);
		
	}

}
