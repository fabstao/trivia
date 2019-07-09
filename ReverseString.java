/* 
    Usage:
    ${JAVA_HOME}/bin/java ReverseString <string>
*/
public class ReverseString {
	public static void main(String[] args) {
        System.out.println("***************************");
        System.out.println(" Reverse String by Fabian:");
        System.out.println("***************************");
        String salida=String.join(" ",reverse(args[0],1));
        System.out.printf("\n\n%s\n\n",salida);
        salida=String.join(" ",reverse(args[0],2));
        System.out.printf("\n%s\n\n",salida);
        salida=String.join(" ",reverse(args[0],3));
        System.out.printf("\n%s\n\n",salida);
    }

    public static String[] reverse(String frase, int ver) {
        frase = frase.replace(".", "");
        String[] dereversa = frase.split(" ", -1);
        int n = dereversa.length-1;
        String pivote;

        // This loop uses only n/2 complexity, at the middle of the array all elements will be
        // Swapped, no need for a second array wasting memory
        for(int i=0; i < (n+1)/2; i++){
            pivote = dereversa[i]; // Use a pivot value to temporary store first element to swap
            dereversa[i] = dereversa[n-i]; // Swap with last element
            dereversa[n-i] = pivote; // Swap with first element of the iteration
            // If trivia 1, ex 2 is required, apply Paragraph style, also required for ex3
            if(i==0 && ver>1) { 
                dereversa[i] = primeraMayus(dereversa[i]); // Paragraph style, first capital letter
                dereversa[n-i] = dereversa[n-i].toLowerCase();
            }
            if(i==0 && ver==3) { // If trivia 1, ex 3 is required, apply Paragraph style
                dereversa[n-i] = dereversa[n-i]+".";
            }
        }
        return(dereversa);
    }

    public static String primeraMayus(String palabra){
        String salida = palabra.substring(0,1).toUpperCase() + palabra.substring(1);
        salida = salida.replace(".", "");
        return salida;
    }
}