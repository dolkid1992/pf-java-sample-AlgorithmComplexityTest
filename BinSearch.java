public class BinSearch {
    static int[] arr = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    static int BinSeach(int[] arr, int low, int high, int value) {
//        low = 0;
//        high = arr.length - 1;


        if (high >= low) {
            int mid = (low + high) / 2;
            if (arr[mid] == value)
                return mid;
            if (arr[mid] > value)
                return BinSeach(arr, low, mid - 1, value);
            if (arr[mid] < value)
                return BinSeach(arr, mid + 1, high, value);
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(BinSeach(arr, 0, arr.length - 1, 8));
        System.out.println(BinSeach(arr, 0, arr.length - 1, 70));
        System.out.println(BinSeach(arr, 0, arr.length - 1, 7));
        System.out.println(BinSeach(arr, 0, arr.length - 1, 35));
        System.out.println(BinSeach(arr, 0, arr.length - 1, 69));
    }
}
