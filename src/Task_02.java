import java.util.ArrayList;

public class Task_02 {
    private final int MAX_VALUE = 4_000_000;
    private int sum = 0;
    Task_02 (){
        foo ();
    }
    private void foo () {
        ArrayList<Integer>  list = new ArrayList<Integer> ();
        list.add(1);
        list.add(1);
        boolean exit = false;
        int i = 2;
        while (!exit){
            list.add(list.get(i-1) + list.get(i-2));
            if (list.get(i) > MAX_VALUE)
                exit = true;
            System.out.println("n[" + i  + "] = " + list.get(i));
            i++;
        }
    }
    public int getSum (){
        return sum;
    }
}
