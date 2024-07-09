import java.applet.Applet;
import java.awt.*;

public class prgm20 extends Applet {
    public void init() {
        System.out.println("Initialisation");
    }

    public void start() {
        System.out.println("Applet started");
    }

    public void paint(Graphics x) {
        x.drawString("A simple applet", 50, 50);
    }

    public void stop() {
        System.out.println("Applet stopped");
    }

    public void destroy() {
        System.out.println("Applet destroyed");
    }
}
/*
 * <applet code="prgm20.class" width="300" height="300">
 * </applet>
 */