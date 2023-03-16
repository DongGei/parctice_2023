package PAT;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class L1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        try {
            Date date = new SimpleDateFormat("HH:mm").parse(s);

            if(date.getHours()>12){
                if (date.getMinutes() == 00){
                    for (int i=0;i<date.getHours()-12;i++)
                    System.out.print("Dang");
                }else {
                    for (int i=0;i<date.getHours()-11;i++)
                    System.out.print("Dang");
                }
            }else {
                System.out.printf("Only"+"%tR"+".  Too early to Dang.",date);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
