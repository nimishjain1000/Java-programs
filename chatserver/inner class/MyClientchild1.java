import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.Socket;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class MyClient
extends WindowAdapter {
    MyClient() {
    }

    public void windowClosing(WindowEvent windowEvent) {
        if (MyClient.this.s != null) {
            JOptionPane.showMessageDialog(MyClient.this.chatWindow, "u r logged out right now. ", "Exit", 1);
            MyClient.this.logoutSession();
        }
        System.exit(0);
    }
}