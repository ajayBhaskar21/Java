

class sol1 {

    static int findMin(int[] a, int ind) {
        int min = Integer.MAX_VALUE;
        for (int i = ind; i < a.length; i++) {
            if (min > a[i])
                min = a[i];
        }
        for (int i = ind; i < a.length; i++) {
            if (a[i] == min)
                return i;
        }
        return 0;
    }
    
    static void reverse(int[] a, int i, int j) {
        while(i < j) {
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
            i++;
            j--;
        }
    }

    static void reversort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int j = findMin(a, i); // used to find minimum element
            reverse(a, i, j);      // used to reverse elements
        }

    }

    public static void main(String[] args) {
        

        int[] a = new int[] {4, 5, 2, 1, 3};

        reversort(a);

        for(Integer i : a)
            System.out.print(i + " ");


    }
}