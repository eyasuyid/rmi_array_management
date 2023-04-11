import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.Naming;

public class ArrayIntersectionServer {
    public static void main(String[] args) throws RemoteException {
        ArrayIntersectionImpl arrayIntersection = new ArrayIntersectionImpl();
	  try {
        LocateRegistry.createRegistry(2000);
        Naming.rebind("rmi://localhost:2000/ArrayIntersectionService", arrayIntersection);

} catch (Exception e){System.out.println("error");}


        System.out.println("ArrayIntersectionService bound");
    }
}
