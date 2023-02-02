import java.util.HashMap;

// code to convert the roman no into the integer 
public class string11 {
    public static void main(String[] args){
HashMap<Character ,Integer>map=new HashMap<>();
int n=0;
String s ="MCMXCIV";
map.put('I',1);
map.put('V',5);
map.put('X',10);
map.put('L',50);
map.put('C',100);
map.put('D',500);
map.put('M',1000);
for(int i=0;i<s.length();i++){
    char r= (Character)s.charAt(i);
    char t= (Character)s.charAt(i++);
    if(r=='I'&& (t=='V'|| t=='X')){
        n=n-1;


    }
   if(r=='X'&& (t=='L'|| t=='C')){
n=n-10;
    }
    if(r=='C'&& (t=='D'|| t=='M')){
n=n-100;

    }
    else{
       int j= map.get(r);
n=n+j;
    }

}
System.out.println(n);
    }

}
