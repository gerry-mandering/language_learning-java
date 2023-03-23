public interface Calc {

    double  PI = 3.14;
    int     Error = -999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    default void description() {
        System.out.println("calculate integer");
        myMethod();
    }

    private void myMethod() {
        System.out.println("my method");
    }

    static int total(int[] arr) {
        myStaticMethod();
        int total = 0;

        for (int i: arr) {
            total += i;
        }

        return total;
    }

    private static void myStaticMethod() {
        System.out.println("private static method");
    }
}
