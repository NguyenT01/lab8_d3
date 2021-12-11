import java.rmi.RemoteException;

public class ImplHello implements Hello {
    
    @Override
    public void printMsg(String age) throws RemoteException {
        int a = Integer.parseInt(age);
        System.out.println("Your age: " + a);
    }
    
}
