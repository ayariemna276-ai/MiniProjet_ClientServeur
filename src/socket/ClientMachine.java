package socket;
import java.net.*;
import java.io.*;

public class ClientMachine {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 5000);
        //  Scénario 2 : Communication Socket (TCP)

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        out.println("PANNE M1");

        System.out.println(in.readLine());

        socket.close();
    }
}
