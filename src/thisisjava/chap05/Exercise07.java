package thisisjava.chap05;

public class Exercise07 {
        public static void main(String[] args) {
            int max = 0;
            int[] array = {1, 5, 3, 8, 2 };

            for(int arrayMax : array) {
                if(max < arrayMax) {
                    max = arrayMax;
                }
            }
        System.out.println("max: " + max);
    }
}
