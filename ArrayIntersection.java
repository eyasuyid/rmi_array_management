import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ArrayIntersection extends Remote {
    int[] getIntersection(int[] array1, int[] array2) throws RemoteException;
}
