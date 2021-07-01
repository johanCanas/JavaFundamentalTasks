package marteGroup;

import java.util.Random;

public class FuegoIndividual {

    private String sonido;


    public FuegoIndividual(){
        this.sonido = this.generateRandomString();

    }

    public void explotar(){
        System.out.println("Explosión: " + this.sonido);
    }

    private String generateRandomString() {
        // create a string of all characters
        String alphabet = "PAEIOU";

        // create random string builder
        StringBuilder sb = new StringBuilder();

        // create an object of Random class
        Random random = new Random();

        // specify length of random string
        int length = 5;

        for (int i = 0; i < length; i++) {

            // generate random index number
            int index = random.nextInt(alphabet.length());

            // get character specified by index
            // from the string
            char randomChar = alphabet.charAt(index);

            // append the character to string builder
            sb.append(randomChar);
        }

        return sb.toString();
    }
}
