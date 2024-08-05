import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            MyRemoteInterface stub = (MyRemoteInterface) Naming.lookup("rmi://localhost:1099/AddService");
            int result = stub.addNumbers(21, 7); // Example numbers
            System.out.println("Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
