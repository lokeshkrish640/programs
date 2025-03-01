class Main {
    public static void main(String[] args) {
        for (int i = 100; i <= 1000; i++) {
            if (isPrime(i)) {
                int sumOfDigits = sumDigits(i);
                if (isPrime(sumOfDigits)) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
