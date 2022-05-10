public class arrharmony {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        float total = 0;
        for (int j : numbers) {
            total +=(1.0) / j;
        }
        System.out.println(total);
    }
}