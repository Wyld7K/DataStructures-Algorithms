import java.util.Arrays;

public class SortingAlgorithm {
    private static int[] nums = { 20, 35, -15, 7, 55, 1, -22 };

    // =========UTILITIES=============
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    // Using Recursion for solving factorial
    /*
     * // 1! = 0! * 1
     * // 2! = 2 * 1!
     * // 3! = 3 * 2!
     * // 4! = 4 * 3!
     * // 5! = 5 * 4!
     * 
     * // Get Factorial of n
     * // n! = n * (n -1)!
     */

    public static int recursiveFactorial(int n) {
        if (n == 0)
            return 1;
        int factorial = n * recursiveFactorial(n - 1);
        System.out.println(factorial);

        return factorial;
    }

    public static int iterativeFactorial(int num) {
        if (num == 0)
            return 1;
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println(factorial);

        return factorial;
    }

    // ========IMPLEMENTATIONS========
    // Bruteforce Sorting Algorithms
    /*
     * // First loop makes limit on num of swaps
     * // second loop iterates and makes swaps
     */
    public static void bubbleSort() {
        for (int i = nums.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, i, j);
                }

            }
        }
        System.out.println(Arrays.toString(nums));
    }

    /*
     * // First loop makes limit on num of swaps
     * // Second loop iterates through arr to find largest val and swaps it with the
     * // current i value
     */
    public static void selectionSort() {
        for (int i = nums.length - 1; i > 0; i--) {
            int largest = 0;
            for (int j = 0; j <= i; j++) {
                if (nums[largest] < nums[j])
                    largest = j;
            }
            swap(nums, largest, i);
        }
        System.out.println(Arrays.toString(nums));

    }

    /*
     * // taking each element and inserting it into its correct position in the
     * sorted
     * // partition and when we get the rightmost value in the array, we would have
     * // made the entire arr the sorted partition
     * 
     * // First loop sets limit on num of insetions
     * // Second loop iterates through sorted arr (backwards) until it hits a value
     * // that is less than or it or i == 0
     */
    public static void insertionSort() {
        // Growing sorted parition by 1
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < nums.length; firstUnsortedIndex++) {
            int newElement = nums[firstUnsortedIndex];

            int i;
            // Iterating from right to left through sorted parition to find correct pos and
            // insert the value
            for (i = firstUnsortedIndex; i > 0 && nums[i - 1] > newElement; i--) {
                nums[i] = nums[i - 1];

            }
            nums[i] = newElement;
        }
        System.out.println(Arrays.toString(nums));

    }

    /*
     * // Last gap is always 1
     * // First loop sets num of gap for each iteration
     * // Second loop iterates through the arr
     * // While loop makes jumps
     */
    public static void shellSort() {
        for (int gap = nums.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < nums.length; i++) {
                int element = nums[i]; // 7

                while (i >= gap && nums[i - gap] > element) {
                    nums[i] = nums[i - gap];
                    i -= gap;
                }
                nums[i] = element;
            }

        }
        System.out.println(Arrays.toString(nums));
    }

    // Divide And Conquere Algorithms

    public static void mergeSort() {
        for (int i = 0; i < nums.length; i++) {
            int lastIndex = nums.length + 1;
            int firstIndex = 1;
            int mdpt = (firstIndex + lastIndex) / 2;

            for (int j = 0; j < mdpt; j++) {

            }

        }
    }
    // 1. End index for mdpt is always one greater than the last index (if the last
    // index is 2,
    // it's 1+ that so 3)
    // 2.With every merge, the 2 arrs are already sorted
    // ========PRACTICE========

    // { 20, 35, -15, 7, 55, 1, -22 };

    public static void selectionSrt() {
        for (int i = nums.length - 1; i > 0; i--) {
            int largest = 0;

            for (int j = 1; j <= i; j++) {
                if (nums[j] > nums[largest]) {
                    largest = j;
                }
            }
            swap(nums, i, largest);
        }
        System.out.println(Arrays.toString(nums));

    }

    public static void interstionSRt() {
        // Neighboring values

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < nums.length; firstUnsortedIndex++) {
            int newElement = nums[firstUnsortedIndex];

            int i;
            for (i = firstUnsortedIndex; i > 0 && nums[i - 1] < nums[i]; i--) {
                // do insetion
                nums[i] = nums[i - 1];
            }
            nums[i] = newElement;
        }
    }

    public static void shellSrt() {
        for (int gap = nums.length / 2; gap > 0; gap /= 2) {
            int element = nums[gap]; // 7
            int i = gap; // 3

            for (int j = i; j < nums.length; j++) {
                while (j - gap >= 0 && nums[j - gap] > nums[j]) {
                    nums[j] = nums[j - gap];
                    j -= gap;
                }
                nums[j] = element;
            }

        }
        System.out.println(Arrays.toString(nums));
    }

    public static void shellSRt() {

        for (int gap = nums.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < nums.length; i++) {
                int element = nums[i];
                while (i >= gap && nums[i - gap] > element) {
                    nums[i] = nums[i - gap];
                    i -= gap;
                }
                nums[i] = element;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void shellSRT() {
        for (int gap = nums.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < nums.length; i++) {
                int element = nums[i];

                while (i >= gap && nums[i - gap] > element) {
                    nums[i] = nums[i - gap];
                    i -= gap;
                }
                nums[i] = element;

            }
        }
        System.out.println(Arrays.toString(nums));

    }

    // ========TESTS========

    // { 20, 35, -15, 7, 55, 1, -22 };

    public static void TestBubbleSort() {
        for (int i = nums.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j + 1] < nums[j])
                    swap(nums, j, j + 1);
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void TestSelectionSort() {
        for (int i = nums.length - 1; i > 0; i--) {
            int largest = 0;
            for (int j = 1; j <= i; j++) {
                if (nums[j] > nums[largest])
                    largest = j;
            }
            swap(nums, largest, i);
        }
        System.out.println(Arrays.toString(nums));

    }

    public static void TestInsertionSort() {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < nums.length; firstUnsortedIndex++) {
            int element = nums[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && element < nums[i - 1]; i--) {
                nums[i] = nums[i - 1];
            }
            nums[i] = element;
        }
        System.out.println(Arrays.toString(nums));

    }

    public static void TestShellSort() {
        for (int gap = nums.length / 2; gap > 0; gap /= 2) {

            int i;
            for (i = gap; i < nums.length; i++) {
                int element = nums[i];

                while (i - gap >= 0 && nums[i - gap] > element) {

                    nums[i] = nums[i - gap];
                    i -= gap;
                }
                nums[i] = element;
            }
        }
        System.out.println(Arrays.toString(nums));

    }

    public static void main(String[] args) {
        // PREVIOUS ATTEMPTS
        /*
         * // SortingAlgorithm.bubbleSort();
         * // SortingAlgorithm.selectionSort();
         * // SortingAlgorithm.selectionSrt();
         * // SortingAlgorithm.insertionSort();
         * // SortingAlgorithm.shellSrt();
         * // SortingAlgorithm.shellSRt();
         * // SortingAlgorithm.TestBubbleSort();
         * // SortingAlgorithm.TestSelectionSort();
         * // SortingAlgorithm.TestInsertionSort();
         * // SortingAlgorithm.TestShellSort();
         */

        SortingAlgorithm.recursiveFactorial(4);

    }
}