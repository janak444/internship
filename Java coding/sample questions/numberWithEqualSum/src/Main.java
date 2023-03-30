
class GFG {
    static void findNDigitNumsUtil(int n, int sum, char out[], int index) {
        if (index > n || sum < 0 || n < 1 || n > 9) {
            return;
        }
        if (index == n) {
            if (sum == 0) {
                out[index] = '\0';
                System.out.print(out);
                System.out.print(" ");
            }
            return;
        }
        for (int i = 1; i <= 9; i++) {
            out[index] = (char) (i + '0');
            findNDigitNumsUtil(n, sum - i, out, index + 1);
        }
    }

    static void findNDigitNums(int n, int sum) {
        char[] out = new char[n + 1];

        for (int i = 1; i <= 9; i++) {
            out[0] = (char) (i + '0');
            findNDigitNumsUtil(n, sum - i, out, 1);
        }
    }

    public static void main(String[] args) {
        int n = 2, sum = 10;
        findNDigitNums(n, sum);
    }
}