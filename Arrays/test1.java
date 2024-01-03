

class test1 {


    static int[][] update(int a[][], int i, int j){
        a[0][0] = 500;
        return a;
    }

    public static void main(String[] args) {
        

        int[][] a = {{2, 3}, {1, 4}};

        for (int i = 0; i<2; i++){
            for(int j = 0; j < 2; j++)
            {
                System.out.print(a[i][j] + " ");

            }
            System.out.println();

        }
        int[][] b = update(a, 0, 0);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(b[i][j] + " ");

            }
            System.out.println();

        }

    }
}