import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayIntersectionImpl extends UnicastRemoteObject implements ArrayIntersection {

    protected ArrayIntersectionImpl() throws RemoteException {
        super(2000);
    }

    public int[] getIntersection(int[] array1, int[] array2) throws RemoteException {
        List<Integer> intersectionList = new ArrayList<>();

        for (int i : array1) {
            for (int j : array2) {
                if (i == j) {
                    intersectionList.add(i);
                    break;
                }
            }
        }

        int[] intersectionArray = new int[intersectionList.size()];
        for (int i = 0; i < intersectionList.size(); i++) {
            intersectionArray[i] = intersectionList.get(i);
        }

        return intersectionArray;
    }
}
