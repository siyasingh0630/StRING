// import java.util.HashMap;

// // ROMAN NO BASED PROBLEM 
// // COVERSION FROM ROMAN NO TO INTEGER NO 
// // remember THREE RULES
// // 1>AGAR PREVIOUS ELEMENT KEE VALUE CHOTE HAI CURRENT VALUE SAI 
// // IN THAT SITUATION MAI SUBRACTION HOGA (IV)
// // 2>AGAR PREVIOUSELEMNT KEE VALUE BAde  HOGE CURRENT VALUE SAI 
// // TO ADDITION HOGA 
// // 3>AGRA PREVIOUS AND CURRENT DONO KEE VALUE SAME RAHEGE TOH USS
// // CONDITION MAI BHI ADDITION HOGA 
// // POINT I LERAN 
// // hashmap hmmm use karr rhe hai because 
// // 1>yaha do value kee bich mai relation bata rahe hai 
// // means key value pair vala sceen hai 
// // 2>insert ,search and all kerne kee time complexeity hamesha 
// // class Solution {
//     // Finds decimal value of a given roman numeral
//     public int romanToDecimal(String s) {
//         HashMap<Character,Integer> map = new HashMap<>();
//         map.put('I',1);
//         map.put('V',5);
//         map.put('X',10);
//         map.put('L',50);
//         map.put('C',100);
//         map.put('D',500);
//         map.put('M',1000);
        
//         int n=s.length();
//         int output=0;
//         for(int i=0;i<n;i++)
//         {
//          if(i<n-1 && map.get(s.charAt(i))<map.get(s.charAt(i+1)))
//          {
//              output+= map.get(s.charAt(i+1))-map.get(s.charAt(i));
//              i++;
//          }
//          else
//          {
//              output+=map.get(s.charAt(i));
//          }
//         }
//         return output;

//     }
// }
                              