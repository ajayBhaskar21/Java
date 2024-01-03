// n and k will be given print the pattern
// n = 5, k = 2
//
// 10001 10001
// 01010 01010
// 00100 00100
// 01010 01010
// 10001 10001

class xMultiply {
    static int c;
    static void show(int[][] a, int n, int k){
        int temp = k;
        for (int i = 0; i < n; i++){
            while(k-- >0){
                for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j]);
                    c++;
                }
                System.out.print(" ");
            }
            k = temp;
            System.out.println();
        }

    }

    public static void main(String[] args) {
        
        int n = 5; // always odd.
        int k = 2;

        int[][] a = new int[n][n];

        for (int i = 1; i < n - 1; i++){
            a[i][i] = 1;
            a[i][n - 1 - i] = 1;

        }
        a[0][0] = a[0][n - 1] = a[n - 1][0] = a[n - 1][n - 1] = 1;

        show(a, n, k);
        System.out.println("counts = " + c);
    }
}