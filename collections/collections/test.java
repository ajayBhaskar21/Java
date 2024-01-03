import java.util.*;
public class test {
static void count_freq(String str)
    {
        Map<String,Integer> mp=new TreeMap<String, Integer>();
        String arr[]=str.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            if(mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i])+1);
            }
            else
            {
                mp.put(arr[i],1);
            }
        }
        for(Map.Entry<String,Integer> entry:mp.entrySet())
        {
        if(entry.getKey().length()>4 && entry.getValue()>10) {
            System.out.println(entry.getKey()+
                    " - "+entry.getValue());}
        }
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        count_freq(str);
    }
}