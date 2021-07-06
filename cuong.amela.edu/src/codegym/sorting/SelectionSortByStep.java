package codegym.sorting;

public class SelectionSortByStep {

    public static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void main(String[] args) {
        selectionSort(list);
        System.out.println("Final list: ");
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }

    public static void selectionSort(double[] list) {
        System.out.println("List origin: ");
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();

        for (int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            /* Swap list[i] with list[currentMinIndex] if necessary */
            if (currentMinIndex != i) {
                System.out.println("Swap " + i + " with " + currentMinIndex);
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
                System.out.println("List after " + i + " sort");
                for (int j = 0; j < list.length; j++) {
                    System.out.print(list[j] + " ");
                }
                System.out.println();
            }
        }
    }
}
