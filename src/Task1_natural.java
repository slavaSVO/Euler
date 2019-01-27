public class Task1_natural {
    boolean OK;
    Task1_natural(){
        OK = true;
    }

    boolean multiple (int checkValue, int base){
        int a = checkValue % base;
        if (a == 0)
            return true;
        else
            return false;
    }
}
