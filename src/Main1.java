import java.util.*;
public class Main1{
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String a=in.nextLine();
            String b=in.nextLine();
            if(a.contains(b)){
                System.out.println("Yes"+(a.length()-b.length()));
            }else{
                int num=0;
                for(int i=0;i<b.length();i++){
                    for(int j=0;j<a.length();j++){
                        if(b.charAt(i)==a.charAt(j)){
                            num++;
                        }
                    }
                }
                System.out.println("NO"+(a.length()-num));
            }

        }
    }
}