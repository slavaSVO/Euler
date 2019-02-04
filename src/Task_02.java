import java.util.ArrayList;

public class Task_02 {
    private final int MAX_VALUE = 4_000_000;
    private int sum = 0;
    private ArrayList<Integer>  list = new ArrayList<Integer> ();
    Task_02 (){
        calcFibonacciSequence();
        calcSum();
    }
    private void calcFibonacciSequence() {
        list.add(1);
        list.add(1);
        boolean exit = false;
        int i = 2;
        while (!exit){
            list.add(list.get(i-1) + list.get(i-2));
            if (list.get(i) > MAX_VALUE)
                exit = true;
            i++;
        }
    }
    private int calcSum () {
        for (int i = 0; i < list.size() - 1; i++){
            if (mathFunction.multiple(list.get(i) , 2)){
                sum = sum + list.get(i);
            }
        }
        return 0;
    }
    public int getAnswer (){
        return sum;
    }
}
