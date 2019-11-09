//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Hashmap{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of Entries :");
        int n = in.nextInt();
        Map<String,Long> ph=new HashMap<String,Long>();
        for(int i = 0; i < n; i++){
        	System.out.println("Enter the name :");
            String name = in.next();
            System.out.println("Enter the Mobile number :");
            long phone = in.nextLong();
            // Write code here
            ph.put(name,phone);
        }
        while(in.hasNext()){
        	System.out.println("Enter the name whose number you want to find :");
            String s = in.next();
            // Write code here
            
           if(ph.containsKey(s)==true) 
           {System.out.println(s+"="+ph.get(s));}
           else
           {
               System.out.println("Not found");
           }
            
          
        }
        in.close();
    }
}

