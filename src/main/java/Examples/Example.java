//package Examples;
//
//import java.util.*;
////import java.io.*;
//public class Example {
//    public static void main(String arg[]){
//        ArrayList<BankAcc> arr = new ArrayList<>();
//
////        [0,1,2]
//        arr.add(new BankAcc(1001,"ABC",10000));
//        arr.add(new BankAcc(1002,"XYZ",500000));
//        arr.add(new BankAcc(1003,"MNO",2000));
//
////        ................Enchanced for loop....................
//        for(BankAcc i : arr){
//            i.current_balance();
//        }
//
//        System.out.println("------------------------");
//
////        ................forEach loop......................
//        arr.forEach((element)->{
//            element.deposite(500);
//            element.current_balance();
//        });
//
////        ...............Iterator interface...................
//
//        System.out.println("------------------------");
//
//        Iterator loop = arr.iterator();
//
//        while(loop.hasNext()){
////            Float data = (Float)loop.next().get_balance();
//            BankAcc data = (BankAcc)loop.next();
//            if(data.get_balance() >=10000){
//                System.out.println("Account Name: "+data.accname()+"\nAccount Number: "+data.accnumber()+"\nBalance :"+data.get_balance());
//                System.out.println("#######");
////                loop.remove();
//            }
//        }
//    }
//}
