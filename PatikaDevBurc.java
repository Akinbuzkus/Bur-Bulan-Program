
import java.util.Scanner;


public class PatikaDevBurc {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        int month,day;
        
        System.out.print("Please Enter the BirthMonth :");
        month=scan.nextInt();
        System.out.print("Please Enter the BirthDay :");
        day=scan.nextInt();
        
        if(month==1){
            if(day<=21){
                System.out.println("Oğlak Burcusunuz.");
            }else{
                System.out.println("Kova Burcusunuz.");
            }
        }
        else if(month==2){
            if(day<20){
               System.out.println("Kova Burcusunuz.");
            }
            else{
                 System.out.println("Balık Burcusunuz.");
            }
        }
        else if(month==3){
            if(day<=20){
                System.out.println("Balık Burcusunuz.");
            }
            else {
                System.out.println("Koç Burcusunuz.");
            }
        }
        else if(month==4){
            if(day<21){
                System.out.println("Koç Burcusunuz.");
            }
            else {
                 System.out.println("Boğa Burcusunuz.");
            }
        }
        else if(month==5){
            if(day<22){
                 System.out.println("Boğa Burcusunuz.");
            }
            else  System.out.println("İkizler Burcusunuz.");
        }
        else if(month==6){
            if(day<23){
                 System.out.println("İkizler Burcusunuz.");
            }
            else { System.out.println("Yengec Burcusunuz.");}
        }
        else if(month==7){
            if(day<23){
             System.out.println("Yengec Burcusunuz.");
        }
        else { System.out.println("Aslan Burcusunuz.");}
        }
        else if(month==8){
        if(day<23){
             System.out.println("Aslan Burcusunuz.");
        }
        else
             System.out.println("Başak Burcusunuz.");
       }
        else if(month==9){
        if(day<23){
             System.out.println("Başak Burcusunuz.");
        }
        else
             System.out.println("Terazi Burcusunuz.");
       }
        else if(month==10){
        if(day<23){
             System.out.println("Terazi Burcusunuz.");
        }
        else
             System.out.println("Akrep Burcusunuz.");
       }
        else if(month==11){
        if(day<23){
             System.out.println("Akrep Burcusunuz.");
        }
        else
             System.out.println("Yay Burcusunuz.");
       }
        else if(month==12){
        if(day<23){
             System.out.println("Yay Burcusunuz.");
        }
        else
             System.out.println("Oğlak Burcusunuz.");
       }
        else {
            System.out.println("Hatalı Secim");
            }
        
    }
 
}
