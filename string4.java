
// STRINGBUILDER IN JAVA 
// BASICALLY IN JAVA THERE IS STRING AND STRINGBUILDER 
// STRING IN JAVA IS IMMUTABALE 
// THATS WHY WHENEVER WE CAHNGE THE STRING IN JAVA IT CHANGES IN HEAP
// WHICH IS TIME CONSUMING PROCESS
// BUT IN STRINGBUILDER VO VHI PAI POINT KERTA HAI NEW OBJECT NHI BANTA
// JO  BANE RHA THA JAB HMNE STRING KA DEKHA 
// THATS WHY STRINGBUILDER IS BETTER OPTION OVER THE STRING  
// function or methods of StringBuilder in java 
// 1> charAT(INDEX)
// 2> setCharAT(INDEX,"REPLACE CHARACTER")
// public class string4 {
//     public static void main(String[] args){
//    StringBuilder str= new StringBuilder("sjsdjsdj");
// int t=1;
//     for(int i=str.length()-1;i>0;i++){
//   if(str[i]==""){
//     String jiya =sentence.substring(
        
//     );
// }
// else{
// t++;
// }

//     }
// }
// }
//         String S="my name is siya ";
//         ArrayList<String> ar=new ArrayList<>();
//         String str="";
//         for(int i=0;i<S.length();i++){
//             if(S.charAt(i)=='.'){
//                 ar.add(str);
//                 str="";
//             }else{
//                 str+=S.charAt(i);
//             }
//         }
//         ar.add(str);
//         String ans="";
//         for(int i=ar.size()-1;i>0;i--){
//             ans+=ar.get(i);
//             ans+=""+'.';
//         }
//          ans+=ar.get(0);
    
//     }
// }
// import java.util.*;
// public class string4 {
//     public static void main(String[] args){
// //        
// ArrayList<Integer> siya=new ArrayList<>();  
// String s="my.name.is.shikha.amarsingh.thakue";
// String str="";
// for(int i=0;i<s.length();i++){
//     if(s.charAt(i)=='.')
//     {
//     siya.add(str);
//     str="";
// }
// else{
//     str+=s.charAt(i);
// }

// }
// for(int i=siya.size()-1;i<0;i++){
//     siya 
// }
//     }
// }
// //  second approach



// class Solution 
// {
//     //Function to reverse words in a given string.
//     String reverseWords(String S)
//     {
//         // code here 
//         String res="";
//         StringBuffer temp=new StringBuffer("");
//         for(int i=S.length()-1;i>=0;i--){
//             if(S.charAt(i)!='.'){
//                 temp.append(S.charAt(i));
//             }else{
//                 temp.reverse();
//                 temp.append('.');
//                 res+=temp;
//                 temp.setLength(0);
//             }
//         }
//         res+=temp.reverse();
//         temp.setLength(0);
                
//         return res;
//     }
// }


// PRACTICING THE STRINGBUILDER SECOND TIME
// import java.util.*; 
public class string4{
    public static void main(String[] args){
        StringBuilder st=new StringBuilder("siyathakur");
System.out.println(st);
System.out.print(st.charAt(1));
st.setCharAt(1,'p');
System.out.println(st);
// likhan rha toh hmm "" nhi likh sakte hai 
// char 
st.insert(1,'r');
System.out.println(st);
st.append("kdjkdjf");
System.out.println(st);
    }
}