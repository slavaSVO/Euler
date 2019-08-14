import java.util.ArrayList;

public class Task_03 {
    static final int MAX_ARRAY_SIZE = 2147483647;
    private int ansver;
    private ArrayList<Boolean> listAllNumbers = new ArrayList<Boolean> ();
    private ArrayList<Integer> listNaturalNumber = new ArrayList<Integer> ();


    Task_03(int size) {
        fSieve(size);
        fillingNaturalNumberList();
        searchAnsver();
    }

    Task_03() {
        fSieve(MAX_ARRAY_SIZE);
        fillingNaturalNumberList();
        searchAnsver();
    }

    private void fSieve(int n) {//Функция отсеевает в масиве не простые числа, простые остануться True
        this.listAllNumbers.add(false);// 0 - не простое число
        this.listAllNumbers.add(false);// 1 - не простое число
        // заполняем решето единицами
        for (int i = 2; i <= n; i++)
            this.listAllNumbers.add(true);

        for (int i = 2; i * i <= n; i++) {//Проходим по масиву
            // если i - простое (не вычеркнуто/true)
            if (this.listAllNumbers.get(i)); {
                // то вычеркнем кратные i
                for (int j = i * i; j <= n; j += i) {
                    this.listAllNumbers.set(j, false);
                }
            }
        }
    }

    private void fillingNaturalNumberList(){
        for (int i = 0; i < this.listAllNumbers.size(); i++) {
            if (this.listAllNumbers.get(i)){
                listNaturalNumber.add(i);
            }
        }
    }
    private void searchAnsver (){
        ansver = 1;
        boolean answerIsFound = false;
        int i = listNaturalNumber.size() - 1;
        while (!answerIsFound && i > 0){
            int base = this.listNaturalNumber.get(i);
            int checkValue = this.listAllNumbers.size();
            if (mathFunction.multiple(checkValue, base)){
                this.ansver = this.listNaturalNumber.get(i);
                answerIsFound = true;
            }
            i--;
        }
    }

    long getAnsver () {
        return ansver;
    }
    public void print() {
        for (int i = 0; i < this.listNaturalNumber.size(); i++)
            System.out.println(this.listNaturalNumber.get(i) + " ");
    }
}
