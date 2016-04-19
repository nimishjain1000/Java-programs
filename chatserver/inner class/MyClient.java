import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTextArea;

class MyClient
extends FocusAdapter {
    MyClient() {
    }

    public void focusGained(FocusEvent focusEvent) {
        MyClient.this.txtMessage.selectAll();
    }
}