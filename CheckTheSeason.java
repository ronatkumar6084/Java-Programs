import java.util.*;
public class CheckTheSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = -1;

        while (true){
            System.out.println(" Enter month number (1 -12)");

            if(sc.hasNextInt()){
                month = sc.nextInt();

                if(month >=1 && month <=12){
                    break;
                }else{
                    System.out.println("Error: Month number must be between 1 and 12.");
                }
            }else{
                    System.out.println("Invalid entry Enter a number");
                    sc.next();
                }
            }

            String season;
            switch(month){
                case 2 : case 3:
                season= "Vasant";
                break;

                case 4: case 5:
                season = "Summer";
                break;

                case 6: case 7:
                season = "Monsoon";
                break;

                case 8 : case 9:
                season = "Sharad";
                break;

                case 10 : case 11:
                season = "Hemant";
                break;

                case 12 : case 1:
                season ="Winter";
                break;

                default : 
                season = "Unknown";

            }
            System.out.println("The Season is "+ season);
            sc.close();
        }
    }

