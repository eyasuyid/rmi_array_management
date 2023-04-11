import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.Naming;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntersectionClient {
    public static void main(String[] args) {
        try {
            ArrayIntersection arrayIntersection = (ArrayIntersection) Naming.lookup("rmi://localhost:2000/ArrayIntersectionService");

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the size of array1: ");
            int n1 = scanner.nextInt();
            int[] array1 = new int[n1];
            System.out.print("Enter the elements of array1: ");
            for (int i = 0; i < n1; i++) {
                array1[i] = scanner.nextInt();
            }

            System.out.print("Enter the size of array2: ");
            int n2 = scanner.nextInt();
            int[] array2 = new int[n2];
            System.out.print("Enter the elements of array2: ");
            for (int i = 0; i < n2; i++) {
                array2[i] = scanner.nextInt();
            }

            int[] intersectionArray = arrayIntersection.getIntersection(array1, array2);

            System.out.println("The intersection of the arrays is: " + Arrays.toString(intersectionArray));

        } catch (Exception e) {
            System.err.println("ArrayIntersectionClient exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
