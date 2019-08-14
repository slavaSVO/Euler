public class Task_09 {

    Task_09 () {
        Name();
    };

    public static boolean itIsPythagoreanTriplet(int a, int b, int c) {
        if (a*a + b*b == c*c){
            return true;
        } else {
            return false;
        }
    }


    public static void Name (){
        boolean answerIsFound = false;
        while (!answerIsFound){
            for (int a = 1; a < 1000; a++){
                for (int b = a; b < 1000; b++){
                    for (int c = b; c < 1000; c++) {
                        boolean t;
                        t = itIsPythagoreanTriplet(a, b, c);
                        int s = a + b + c;
                        if (t && s == 1000){
                            System.out.println("a = " + a + ", b = " + b + ", c = " + c);
                            answerIsFound = true;
                        }
                    }
                }
            }
        }
    }

}
