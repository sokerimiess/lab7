import java.util.Scanner;

public class reverse
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        printArrayReverse(arr, 0);
    }
    public static void printArray(int[] arr, int index)
    {
        if (index >= arr.length)
        {
            return;
        }
        System.out.print(arr[index] + " ");
        printArray(arr, index + 1);
    }

    public static void printArrayReverse(int[] arr, int index)
    {
        if (index >= arr.length)
        {
            return;
        }
        printArrayReverse(arr, index + 1);
        System.out.print(arr[index] + " ");
    }
}
