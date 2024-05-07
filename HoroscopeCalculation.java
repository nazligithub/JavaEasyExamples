import java.util.Scanner;
public class HoroscopeCalculation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your birth month:");
        int month=scanner.nextInt();

        if(month>0 && month <13){
            System.out.print("Enter your birth day:");
            int day=scanner.nextInt();
            if(month==1){
                if(day>=1  && day<=31 ){
                    if(day<=21){
                        System.out.print("Your zodiac sign: Capricorn");
                    }else{
                        System.out.print("Your zodiac sign: Aquarius");
                    }
                }else{
                    System.out.print("You logged in incorrectly, try again.");
                }
            }
            else if(month==2){
                if(day>=1 && day<=28){
                    if(day<=19){
                        System.out.print("Your zodiac sign: Aquarius");
                    }else{
                        System.out.print("Your zodiac sign: Pisces");
                    }
                }else{
                    System.out.print("You logged in incorrectly, try again.");
                }
            }
            else if(month==3){
                if(day>=1  && day<=31){
                    if(day<=20){
                        System.out.print("Your zodiac sign: Pisces");
                    }else{
                        System.out.print("Your zodiac sign: Aries");
                    }
                }else{
                    System.out.print("You logged in incorrectly, try again.");
                }
            }
            else if(month==4){
                if(day>=1 && day<=30){
                    if(day<21){
                        System.out.print("Your zodiac sign: Aries");
                    }else{
                        System.out.print("Your zodiac sign: Taurus ");
                    }
                }else{
                    System.out.print("You logged in incorrectly, try again.");
                }
            }
            else if(month==5){
                if(day>=1 && day<=31){
                    if(day<=21){
                        System.out.print("Your zodiac sign: Taurus");
                    }else{
                        System.out.print("Your zodiac sign: Gemini ");
                    }
                }else{
                    System.out.print("You logged in incorrectly, try again.");
                }
            }
            else if(month==6){
                if(day>=1 && day<=30){
                    if(day<=22){
                        System.out.print("Your zodiac sign: Gemini ");
                    }else{
                        System.out.print("Your zodiac sign: Cancer ");
                    }
                }else{
                    System.out.print("You logged in incorrectly, try again.");
                }
            }
            else if(month==7){
                if(day>=1 && day<=31){
                    if(day<=22){
                        System.out.print("Your zodiac sign: Cancer ");
                    }else{
                        System.out.print("Your zodiac sign:Leo ");
                    }
                }else{
                    System.out.print("You logged in incorrectly, try again.");
                }
            }
            else if(month==8){
                if(day>=1 && day<=31){
                    if(day<=22){
                        System.out.print("Your zodiac sign:Leo ");
                    }else{
                        System.out.print("Your zodiac sign:Virgo ");
                    }
                }else{
                    System.out.print("You logged in incorrectly, try again.");
                }
            }
            else if(month==9){
                if(day>=1 && day<=30){
                    if(day<=22){
                        System.out.print("Your zodiac sign:Virgo ");
                    }else{
                        System.out.print("Your zodiac sign:Libra ");
                    }
                }else{
                    System.out.print("You logged in incorrectly, try again.");
                }
            }
            else if(month==10){
                if(day>=1 && day<=31){
                    if(day<=22){
                        System.out.print("Your zodiac sign:Libra ");
                    }else{
                        System.out.print("Your zodiac sign:Scorpio ");
                    }
                }else{
                    System.out.print("You logged in incorrectly, try again.");
                }
            }
            else if(month==11){
                if(day>=1 && day<=30){
                    if(day<=21){
                        System.out.print("Your zodiac sign:Scorpio ");
                    }else{
                        System.out.print("Your zodiac sign:Sagittarius ");
                    }
                }else{
                    System.out.print("You logged in incorrectly, try again.");
                }
            }
            else if(month==12){
                if(day>=1 && day<=31){
                    if(day<=21){
                        System.out.print("Your zodiac sign:Sagittarius ");
                    }else{
                        System.out.print("Your zodiac sign:Capricorn ");
                    }
                }else{
                    System.out.print("You logged in incorrectly, try again.");
                }
            }

        } else {
            System.out.print("You entered the wrong month!");
        }
    }
}
