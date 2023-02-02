import java.util.Arrays;

// public class string5{
//     public static void main(String[] args){
//         String[] strAr2 = {"Ani", "Sam", " Joe"}; 
//         String max=strAr2[0]; 
//         String m="";

// for(int i=0;i<strAr2.length;i++){
//     int j=0;
//     while(j>max.length()&& j>strAr2[i].length())
    
//     {
// if(max[j]==strAr2[j]{

// })

// }
// }
//     }
// }
public class string5{
    public static void main(String[] args){
        String[] arr={"geeksforgeeks","geeks","gees"};
        int n=arr.length;
        // basically remember that kee jo string jo hote hai usko
        // hmm array kee tarah nhi treat kar sakte hai agar hmm chahte 
        // hai hmm use array kee tarah treat  kare toh hme tocharArray()
        // function ko app;y kerna hee padega 
        Arrays.sort(arr);
        char[] first=arr[0].toCharArray();
        char[] last=arr[n-1].toCharArray();
     
        int k=0;
        for(int i=0;i<first.length;i++){
          
            if(first[i]!=last[i]){
                break;

            }
else{
    k++;
    
}

            }
            System.out.println(k);
        }
    }

