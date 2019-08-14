public class Task_04 {
    int max = 0;
    int answerN1 = 0;
    int answerN2 = 0;
    private static final  int DIAPAZON_MAX = 999;
    private static final  int DIAPAZON_MIN = 100;

    Task_04 () {

        //printAnswers();
        serchMax();
    }

    void serchMax () {
        for (int i = DIAPAZON_MAX; i > DIAPAZON_MIN; i--){
            for (int j = DIAPAZON_MAX; j > DIAPAZON_MIN; j--){
                if (i * j == mathFunction.invertIntValue(i * j)){
                    if (i * j > max) {
                        max = i * j;
                        answerN1 = i;
                        answerN2 = j;
                    }

                }
            }
        }

    }


    int getNumber1 () {
        return answerN1;
    }
    int getNumber2 () {
        return answerN2;
    }
    int getMax () {
        return max;
    }
}
