class Main {
    public static void main(String[] args) {
        for (int i = 1, j = 499; i <= j; i++, j--) {
            System.out.println(i);
            if (i != j) {
                System.out.println(j);
            }
        }
    }
}
