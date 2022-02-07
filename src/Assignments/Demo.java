package Assignments;

// success Bulbs
//#Infytq 7th Feb
//@blackhatcoding

import java.util.Scanner;
public class Demo {
    //@blackhatcoding
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String instr = sc.nextLine();
        char chnum[] =instr.toCharArray();
        int sum=0;
        for(int i=0;i<chnum.length-1;i++){
            //@blackhatcoding
            if(instr.charAt(i)>=48 && instr.charAt(i)<=57 && instr.charAt(i+1)==' ') {
                //@blackhatcoding
            int a = Integer.parseInt(String.valueOf(chnum[i]));
                sum=sum+a;
            }
        }
        if(sum==0) {
          //  @blackhatcoding
                    System.out.println(-1);
            System.exit(0);
        }
        if(chnum[chnum.length-1]>=48 && chnum[chnum.length-1]<=57 ) {
            int b=Integer.parseInt(String.valueOf(chnum[chnum.length-1]));
            sum=sum+b;
        }
        //System.out.println("Sum="+sum);
       // @blackhatcoding
        for(int d=2;d<sum;d++) {
            if(sum%d==0) {
                break;
            }
            else {
                System.out.println(sum);
                System.exit(0);
            }
        }
        String sum1=String.valueOf(sum);
        char ch [] = sum1.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<j) {
            char temp = ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        int sumfinal  = Integer.parseInt(String.valueOf(ch));
        //System.out.println("Reverse:"+sumfinal);
        for(int d=2;d<sumfinal;d++) {
            if(sumfinal%d==0) {
                break;
            }
            //@blackhatcoding
        }
        int count=0;
        for(i=1;i<=sumfinal;i++)
        {
            if(sumfinal%i==0)
                count++;
        }
        System.out.println(count);
    }

}

  //