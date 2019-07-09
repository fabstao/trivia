public class Palindrome {
    public static void main(String[] args) {
        System.out.println("______________________");
        System.out.println("");
        System.out.println(" Palindroma by Fabs");
        System.out.println("______________________");
        System.out.println("");
        //String car1="savavas";
        String car1="Red rum, sir, is murder";
         if(isPalr(car1)) {
            System.out.printf("\n%s is a Palindrome\n", car1);
        } else {
            System.out.printf("\n%s is NOT a Palindrome\n", car1);
        } 
        if(checkPal(car1)) {
            System.out.printf("\n%s is a Palindrome\n", car1);
        } else {
            System.out.printf("\n%s is NOT a Palindrome\n", car1);
        }
    }
    
    public static boolean checkPal(String entrada) {

        // While loop version

        System.out.printf("\nWHILE Loop function:\n");
        long stptime;
        long totaltime;
        long strtime = System.currentTimeMillis();
        entrada = entrada.toLowerCase();
        int i = 0;
        int enlen = entrada.length()-1;
        while(i<enlen){
            // while i is less than the input length and there is a special character, increment i
            while(i<enlen && !((entrada.charAt(i)>='a' && entrada.charAt(i)<='z')||
            (entrada.charAt(i)>='0' && entrada.charAt(i)<='9'))){
                i++;
            }
            // while i is less than the input length and there is a special character, decrement ceiling of operator
            while(i<enlen && !((entrada.charAt(enlen)>='a' && entrada.charAt(enlen)<='z')||
            (entrada.charAt(enlen)>='0' && entrada.charAt(enlen)<='9'))){
                enlen--;
            }
            // If at the same position from 0 to i and or from length to elen there is a mismatch, 
            // then break and return false, this is not a Palindrome
            if(entrada.charAt(i)!=entrada.charAt(enlen)){
                stptime = System.currentTimeMillis();
                totaltime = stptime - strtime;
                System.out.printf("While loops time (ms): %d",totaltime);
                return false;
            }
            // Naturally increment base and ceiling of loop limits
            i++;
            enlen--;
            }
            stptime = System.currentTimeMillis();
            totaltime = stptime - strtime;
            System.out.printf("While loops time (ms): %d",totaltime);
            // If we got up to here, we have a Palindrome
            return true;
        }

    public static boolean isPalr(String entrada) {
        
        // Recursive version

        System.out.printf("\nRecursive function:\n");
        long stptime;
        long totaltime;
        long strtime = System.currentTimeMillis();
        entrada = entrada.toLowerCase();
        int i = 0;
        int enlen = entrada.length()-1;
        while((entrada.charAt(i)<'a' || entrada.charAt(i)>'z') 
            && (entrada.charAt(i)<'0' || entrada.charAt(i)>'9')){
            i++;
            }
        while((entrada.charAt(enlen-i)<'a' || entrada.charAt(enlen-i)>'z') 
        && (entrada.charAt(enlen-i)<'0' || entrada.charAt(enlen-i)>'9')){
            enlen--;
            }
        if(entrada.charAt(i)!=entrada.charAt(enlen-i)) {
            stptime = System.currentTimeMillis();
            totaltime = stptime - strtime;
            System.out.printf("\nRecursive time (ms): %d",totaltime);
            return false;
            } else if(enlen > 3) {
                i++;
                enlen--;
                isPalr(entrada.substring(i, enlen));
            }
        stptime = System.currentTimeMillis();
        totaltime = stptime - strtime;
        System.out.printf("\nRecursive time (ms): %d",totaltime);
        return true;
        }
}