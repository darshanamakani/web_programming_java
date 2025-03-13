
/*<applet code=display_image.class width=500 height=500>
 </applet>
 */
import java.awt.*;
import java.applet.*;

public class display_image extends Applet {

    Image picture;

    public void init() {
        picture = getImage(getDocumentBase(), "i1.jpg");
    }

    public void paint(Graphics g) {
        g.drawImage(picture, 30, 30, this);
    }
}