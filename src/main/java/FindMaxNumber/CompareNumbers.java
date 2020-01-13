package FindMaxNumber;

public class CompareNumbers {
    public void getMax(int[] arr) {
        int maxNumber = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }

        }
        System.out.println("MAx number:" + maxNumber);
    }

        public void getMax ( float[] arr1){
            float maxNumber = arr1[0];

            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] > maxNumber) {
                    maxNumber = arr1[i];
                }

            }
            System.out.println("MAx number:" + maxNumber);
        }
    }

