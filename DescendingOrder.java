public class DescendingOrder {
  public static int sortDesc(final int num) {
    //Your code
    int number = num;
    int sortedNumber = 0;

    for (int i = 9; i >= 0; i--) {
        int tmpNumber = number;
        while (tmpNumber > 0) {
            int digit = tmpNumber % 10;
            if (digit == i) {
                sortedNumber *= 10;
                sortedNumber += digit;
            }
            tmpNumber /= 10;
        }
    }
    return sortedNumber;
  }
}
