package cloudVandana;
public class shuffleArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};

         shuffleArray(originalArray);

        for (int num : originalArray) {
            System.out.print(num + " ");
        }
    }

    static void shuffleArray(int[] array) {
        int n = array.length;

       
        for (int i = 0; i < n - 1; i++) {
            int j = (n + 2)%n;  

            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
