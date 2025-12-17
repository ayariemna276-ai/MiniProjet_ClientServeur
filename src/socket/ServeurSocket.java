package socket;
import java.net.*;
import java.io.*;

public class ServeurSocket {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(5000);
        System.out.println("Serveur démarré...");

        Socket client = server.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);

        String msg = in.readLine();
        System.out.println("Message reçu : " + msg);

        out.println("Action traitée par le contrôleur");

        client.close();
        server.close();
    }
}
