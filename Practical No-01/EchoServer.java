import java.net.ServerSocket;
import java.net.Socket;
public class EchoServer
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("waiting for client");
            ServerSocket ss =new ServerSocket(7896);
            Socket soc =ss.accept();
            System.out.println("connection established");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
