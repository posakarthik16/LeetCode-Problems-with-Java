public class LC1108 {
    public static void main(String[] args){

        //Leetcode Problem - 1108

//        Given a valid (IPv4) IP address, return a defanged version of that IP address.
//
//        A defanged IP address replaces every period "." with "[.]".
//
//
//
//                Example 1:
//
        String address = "1.1.1.1";
//        Output: "1[.]1[.]1[.]1"
//        Example 2:
//
//        Input: address = "255.100.50.0"
//        Output: "255[.]100[.]50[.]0"
//
//
//        Constraints:
//
//        The given address is a valid IPv4 address.

        //SOLUTION :

        String answer = "";


        // it will run at O(n^2) because String is immutable
        //instead of this we can use StringBuilder  O(n)

        for(int i=0;i< address.length();i++){
            char temp = address.charAt(i);

            if(temp!='.'){
                answer+=temp;
            }else{
                answer+=("[.]");
            }

        }

            System.out.println(answer);

        //---> O(n)

        StringBuilder stringBuilder = new StringBuilder();

        //we can use like this also in O(n) --> return address.replace(".","[.]");

         for(int i=0;i<address.length();i++){
             char temp = address.charAt(i);
             if(temp != '.'){
                 stringBuilder.append(temp);
             }else{
                 stringBuilder.append("[.]");
             }
         }
     System.out.println(stringBuilder.toString());

//        stringBuilder.append(address.replace(".","[.]"));
//        System.out.println(stringBuilder.toString());
    }
}
