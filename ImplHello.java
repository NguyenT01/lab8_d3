import java.rmi.RemoteException;

public class ImplHello implements Hello {
    
    @Override
    public void printMsg(String age) throws RemoteException {
        int a = Integer.parseInt(age);
        int b= 999999;
        System.out.println("Your age: " + a);

    }
    
}
