import java.rmi.*;

public interface Hello extends Remote{

    public void printMsg(String age) throws RemoteException;
}