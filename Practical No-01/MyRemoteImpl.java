import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemoteInterface {
    protected MyRemoteImpl() throws RemoteException {
        super();
    }

    @Override
    public int addNumbers(int a, int b) throws RemoteException {
        return a + b;
    }
}
