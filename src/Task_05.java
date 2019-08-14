/*
2520 - самое маленькое число, которое делится без остатка на все числа от 1 до 10.
Какое самое маленькое число делится нацело на все числа от 1 до 20?
 */
public class Task_05 {
    private int answer = 0;

    Task_05() {
        a();
    }

    void a() {
        Boolean answerIsFounded = false;
        //long i = 20;
        long i = 1L;
        while(!answerIsFounded && i< 33522128640L)  {
            //long j = 1;
            long j = 11L;
            Boolean allNumberIsMultiple = true;
            while (!answerIsFounded && j <= 20 && allNumberIsMultiple) {
                if (!mathFunction.multiple(i, j)) {
                    allNumberIsMultiple = false;
                }
                j++;
            }
            i++;
        }
    }
    public int getAnswer() {
        return answer;
    }
}
