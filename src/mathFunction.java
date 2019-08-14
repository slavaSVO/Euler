public class mathFunction {
    //Функция которая проверяет, кратно ли чесло base
    public static   boolean multiple (int checkValue, int base){
        int a = checkValue % base;
        if (a == 0)
            return true;
        else
            return false;
    }

    public static   boolean multiple (long checkValue, long base){
        long a = checkValue % base;
        if (a == 0)
            return true;
        else
            return false;
    }

    public  static  int invertIntValue (int value) {
        int result = 0;
        while(value > 0) {
            result = result * 10 + value % 10;
            value /= 10;
        }
        return result;
    }
}
