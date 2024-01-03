public class stringSort {
    

    public static void main(String[] args) {
        String arr[] = {
            "Shanmukh", "Sathwika", "Ajaybhaskar",
            "Amala", "Charan", "Sriram",
            "Krishnasai"
        };
        for(String i: arr)
            System.out.println(i);
        
        for(int i = 0; i < arr.length; i++){

            for(int j = i + 1; j < arr.length; j++){
                if (arr[i].compareTo(arr[j]) > 0){
                    String t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        System.out.println("After Sorting: ");
        for (String i: arr)
            System.out.println(i);


    }
}
