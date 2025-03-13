/*<applet code="color_oval.class" width="600" height="600">  
</applet>   */
import java.applet.Applet;  
import java.awt.*;  
public class color_oval extends Applet
{  
  
    public void paint(Graphics g)
    {  
        for(int i=0;i<=4;i++)
        {
            g.setColor(Color.red);
            if((i%2)==0)
            {
                g.drawOval(120,i*60+10,50,50);
            }
            else
            {
                g.fillOval(120,i*60+10,50,50);
            }
        }
 
}  
  
}  