/*<applet code=animate_image.class width=500 height=500>
 </applet>
 */

import java.awt.*;
import java.applet.*;

public class animate_image extends Applet {

    Image picture;

    public void init() {
        picture = getImage(getDocumentBase(), "bike_1.gif");
    }

    public void paint(Graphics g) {
        for (int i = 0; i < 500; i++) {
            g.drawImage(picture, i, 30, this);

            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
    }
}