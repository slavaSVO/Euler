public class Task_01 {
    final static int MAX_NUMBER = 1000;
    private int sum = 0;


    Task_01(){
        calcSum ();
    }

    private int calcSum () {
        for (int i = 1; i < MAX_NUMBER; i++) {
            boolean multipleOfThree, multipleOfFive;
            multipleOfThree = mathFunction.multiple(i, 3);
            multipleOfFive = mathFunction.multiple(i, 5);
            if (multipleOfThree || multipleOfFive) {
                sum = sum + i;
            }
        }
        return sum;
    }
    public int getAnswer (){
        return sum;
    }
}
