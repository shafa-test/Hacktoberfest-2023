class Pone {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        while (i >=0 && digits[i] == 9) {
            i --;
        }
        if (i == -1) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
        int[] result = new int[digits.length];
        result[i] = digits[i] + 1;
        for (int j = 0; j < i; j ++) {
            result[j] = digits[j];
        }
        return result;
    }
}