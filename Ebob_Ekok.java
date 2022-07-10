import java.util.Scanner;


public class Ebob_Ekok {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen ilk sayıyı giriniz");
        int number_1 = input.nextInt();

        System.out.println("Lütfen ikinci sayıyı giriniz");

        int number_2 = input.nextInt();


        int x = 1;


// BİR VE İKİNCİ OBEBİNİ BULUR

        double ebob = 0;
        do {
            if (number_1 % x == 0) {

                if (number_2 % x == 0) {


                    ebob = x;

                    x++;
                } else {
                    x++;
                }

            } else {

                x++;
            }

        }

        while (x < number_1);


        System.out.println("OBEB : " + ebob);



// BİR VE İKİNCİ OKEKİNİ BULUR

        x= number_1 ;
        int ekok =0;

        do {

            if (x % number_1 == 0){

                if (x % number_2 == 0) {

                     ekok =x;

                    break;

                }
                else {
                    x++;
                }
            }
                    x++;

        }
            while(x <= number_1 * number_2);


        System.out.println(" EKOK: " + ekok );




        double calculation = (number_1 * number_2)/ ebob ;
        System.out.println("calculation:"+ calculation);

    }
}





