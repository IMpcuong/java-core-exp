package codegym.sorting;

public class InsertionSort {

    public static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void main(String[] args) {
        System.out.println("List origin: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        System.out.println("List after sort");
        insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static void insertionSort(double[] list) {
        for (int out = 1; out < list.length; out++) {
            double temp = list[out];
            int in = out;
            while(in > 0 && list[in - 1] > temp){
                list[in] = list[in - 1];
                in--;
            }
            list[in] = temp;
        }
    }
}
