public class mathFunction {
    //Функция которая проверяет, кратно ли чесло base
    public static   boolean multiple (int checkValue, int base){
        int a = checkValue % base;
        if (a == 0)
            return true;
        else
            return false;
    }
}
