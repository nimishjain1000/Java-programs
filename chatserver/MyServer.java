import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

class MyServer {
    ArrayList al = new ArrayList();
    ArrayList users = new ArrayList();
    ServerSocket ss;
    Socket s;
    public static final int PORT = 10;
    public static final String UPDATE_USERS = "updateuserslist:";
    public static final String LOGOUT_MESSAGE = "@@logoutme@@:";

    public MyServer() {
        try {
            this.ss = new ServerSocket(10);
            System.out.println("Server Started " + this.ss);
            do {
                this.s = this.ss.accept();
                MyThread myThread = new MyThread(this.s, this.al, this.users);
                Thread thread = new Thread((Runnable)myThread);
                thread.start();
            } while (true);
        }
        catch (Exception var1_2) {
            System.err.println("Server constructor" + var1_2);
            return;
        }
    }

    public static void main(String[] arrstring) {
        new MyServer();
    }
}