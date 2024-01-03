

class Main {



    static void show(String[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + ",");
        }
        // System.out.println();
    }

    public static String reverseWords(String s) {
        

        String[] strs = s.trim().split("\\s+");
        show(strs);
        int l = 0, r = strs.length - 1;

        while (l < r) {
            String temp = strs[l];
            strs[l] = strs[r];
            strs[r] = temp;
            l++;
            r--;
        }
        show(strs);
        String sol = "";
        for (String i : strs) {
            if (i != " ") {
                sol += i + " ";
            }
        }   
        
        System.out.println(strs.length);
        return sol.trim();

    }


    public static void main (String[] args) {
        System.out.println(reverseWords("a good   example"));
    }

}