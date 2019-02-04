public class Task_03 {
    final int DEFAULT_ARRAY_SIZE = 100;
    private int arraySize = DEFAULT_ARRAY_SIZE;//default size
    private int[] S = new int[arraySize];

    Task_03(int size) {
        arraySize = size;
        fSieve(size);
    }

    Task_03() {
        fSieve(arraySize);
    }

    private void fSieve(int n) {
        this.S[0] = 0; // 1 - не простое число
        // заполняем решето единицами
        for (int k = 2; k <= n; k++)
            this.S[k] = 1;

        for (int k = 2; k * k <= n; k++) {
            // если k - простое (не вычеркнуто)
            if (this.S[k] == 1) {
                // то вычеркнем кратные k
                for (int l = k * k; l <= n; l += k) {
                    this.S[l] = 0;
                }
            }
        }
    }
    public void print() {
        for (int i = 0; i < this.S.length; i++)
            if (S[i]==1) {
                System.out.println(i + " ");
            }
    }
}
//
/*
private ArrayList<Integer>  array = new ArrayList<Integer> ();
array.add(1);
array.get(1);
array.size();
    private void sieve(int n) {
        this.S[0] = 0; // 1 - не простое число
        // заполняем решето единицами
        for (int k = 2; k <= n; k++)
            this.S[k] = 1;

        for (int k = 2; k * k <= n; k++) {
            // если k - простое (не вычеркнуто)
            if (this.S[k] == 1) {
                // то вычеркнем кратные k
                for (int l = k * k; l <= n; l += k) {
                    this.S[l] = 0;
                }
            }
        }
    }
*/