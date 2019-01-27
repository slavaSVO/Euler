
public class Main {

    public static void main(String[] args) {


        int sum = 0;
        final int MAX  = 1000;
        for (int i = 1; i < MAX; i++) {
            boolean multipleOfThree, multipleOfFive;
            multipleOfThree = Task1_natural.multiple(i, 3);
            multipleOfFive = Task1_natural.multiple(i, 5);
            if (multipleOfThree || multipleOfFive) {
                sum = sum + i;
            }
        }
        System.out.println("Hello World!");
        System.out.println(sum);
    }
}
