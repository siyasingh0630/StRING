// basically String class kee do thing function hota hai 
// 1>concatination
// 2>charAT
// 3>length



public class string2 {
   public static void main(String[] args ){
    // concatination 

    String str="priya";
    String str2="jiya";
    System.out.println(str +str2);
    // length
    System.out.println(str.length());
    // charAt
    for(int i=0;i<str.length();i++){
System.out.println(str.charAt(i));
    }

    // compare to
    // if str>str2 the ans will be in positive 
    // if str<str2 the ans will be in negative 
    //  if str=str2 the ans will be in zero
    if(str.compareTo(str2)==0){
        System.out.println("YES");
    }
        else{
System.out.println("no");
        }
    
    // why we used string biulder 
    // non primitive datatype kee through jab string 
    // banaye toh vo object jaise banata hai and onject alag work kerta 
    // hai 
    // point to remmember yaha toh dono taraf hee tony hai fie kyu ans
    // sahi nhi ayay 
    if(new String("tony")== new String("tony")){
        System.out.println("yes");
    }
        else{

            System.out.println("no");
        }
        //
        // substringggggg 
        String sentence ="siya amarsingh thakur ";
        String jiya =sentence.substring(6,9);
        System.out.println(jiya);
    }

    }



