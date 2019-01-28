public class Task_01 {
    final static int MAX_NUMBER = 1000;
    private int sum = 0;


    Task_01(){
        calcSum ();
    }

    private  boolean multiple (int checkValue, int base){
        int a = checkValue % base;
        if (a == 0)
            return true;
        else
            return false;
    }

    private int calcSum () {
        for (int i = 1; i < MAX_NUMBER; i++) {
            boolean multipleOfThree, multipleOfFive;
            multipleOfThree = multiple(i, 3);
            multipleOfFive = multiple(i, 5);
            if (multipleOfThree || multipleOfFive) {
                sum = sum + i;
            }
        }
        return sum;
    }
    public int getSum (){
        return sum;
    }
}
