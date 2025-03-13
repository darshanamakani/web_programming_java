
/*<applet code="applet_lifecycle.class" width="600" 
 height="600">  
</applet>   */
import java.applet.Applet;
import java.awt.*;

public class applet_lifecycle extends Applet {

    String s = " ";

    public void init() {
        s += "initialization";

    }

    public void start() {
        s += "   start";
    }

    public void stop() {
        s += "stop";
    }

    public void destroyed() {
        System.out.println("destroyed");
    }

    public void paint(Graphics g) {
        g.setColor(Color.pink);
        g.drawString(s, 50, 50);
    }
}
