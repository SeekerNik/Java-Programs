import java.util.*;
import java.io.*;

class HackRankHashMap{
    public static void main(String []args){
        Map<String,Integer> phoneBook = new HashMap<String,Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of Entries :");
        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
        	System.out.println("Enter the name :");
            String name = scan.next();
            System.out.println("Enter the number :");
            int phone = scan.nextInt();
            phoneBook.put(name, phone);
        }
        while(scan.hasNext()){
        	System.out.println("Enter the name whose number you want to find :");
            String s = scan.next();
            Integer phoneNumber = phoneBook.get(s);
            System.out.println(
                (phoneNumber != null) 
                ? s + "=" + phoneNumber 
                : "Not found"
            );
        }
        scan.close();
    }
}