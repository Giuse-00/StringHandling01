package it.develhope.stringHandling1;

public class Start {

    public static void main(String[] args) {

        String string1 = "Hello";
        String string2 = "How are you?";

        String c = string1.substring(0,2);
        String x = string2.substring(10,12);

        String charArray = c.concat(x);

        System.out.println(charArray);

        //avrei potuto usare il metodo charAt ma sarebbe uscito molto confusionario a mio parere

    }
}
