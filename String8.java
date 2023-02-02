// // import java.util.HashMap;

// // // conversion of integer to roman 
// // public class String8{
// //     public static void main(String[]args){
// //         HashMap<Integer,String>priya=new HashMap<>();
// //         priya.put(100,C);
// //         priya.put(100,XC);
// //         priya.put(100,L);
// //         priya.put(100,XL);
// //         priya.put(100,X);
// //         priya.put(100,IX);
// //         int num=24;
// //         while(n>0){
// //             if(kuch sitiuation laga kee){
// //                 n=n-100;
// //                 // ass kerna hai 
// //             }
// //         }
// //     }
// // }
// class Solution
// {
// 	String convertToRoman(int num) {
// 		//code here
// 		 int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};  
// String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
//        String s="";
       
//        for (int i=0;i<values.length && num>0;i++)
//        {
//            if(num/values[i]!=0)
//            {
//                s+=romanLetters[i].repeat(num/values[i]);
//                num=num%values[i];
//              }
//        }
//         return s;
// 	}
// }