import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {
        try {
            MyRemoteInterface stub = new MyRemoteImpl();
            LocateRegistry.createRegistry(1099); 
            Naming.rebind("rmi://localhost:1099/AddService", stub);
            System.out.println("Server is ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
