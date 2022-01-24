package Assignments;

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s =sc.nextLine();
        int k = sc.nextInt();
        int ans;
        System.out.println(smallestNumber(s,k)%(int)(1e9+7));
    }
    static int smallestNumber(String num,int k){
        if(num.length()<=k) return 0;
        HashMap<Character,Integer> pos=new HashMap<>();
        for(int i=0;i<num.length();i++){
            pos.put(num.charAt(i),i);
        }
        String temp = num;
        num=sortString(num);
        String ans=num.substring(0,num.length()-k);
        ArrayList<Integer> v=new ArrayList<>();
        for(int i=0;i<ans.length();i++){
            v.add(pos.get(ans.charAt(i)));
        }    Collections.sort(v);
        String ret="";
        for(int i=0;i<v.size();i++){
            ret+=temp.charAt(v.get(i));
        }    int result=Integer.parseInt(""+ret);
        return result;
    }
    public static String sortString(String inputString)
    {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
}
