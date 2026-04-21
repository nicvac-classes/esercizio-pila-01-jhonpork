//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[])
    {
        //Variabili del programma
        String input = "";

        //Creo l'oggetto in per l'input da tastiera
        Scanner in = new Scanner( System.in );

        while(!(input.equalsIgnoreCase("x")))
        {
            input = in.nextLine();
            Pila p1 = new Pila();

            for(int i = 0; i < input.length(); ++i)
            {
                p1.push(input.charAt(i));
            }

            String s1 = "";

            while(p1.isEmpty())
            {
                s1 += p1.pop();
            }

            if(s1.equalsIgnoreCase(input))
            {
                System.out.println("La parola è palindroma");
            }else{
                System.out.println("La parola non è palindroma");
            }
        }
    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md