public class DistanceFee {
    public static void main(String[] args) {
       // Distance 	    = Fee
       // 0 -  4 miles  = $2
        //5 - 15 miles  = $5
        //16 - 25 miles = $10
       // 26 - 50	miles = $15
        //More than 50 miles = $20
int distance = 3;
int feePayment1 = 2;
int feePayment2 = 5;
int feePayment3 = 10;
int feePayment4 = 15;
int feePayment5 = 20;

        if(distance <= 4){
            System.out.println("Your Fee will be " +"$" +feePayment1);

        }
        else if (distance > 5 && distance<=15){
            System.out.println("Your Fee will be " +"$" +feePayment2);

        }
        else if (distance > 16 && distance <=25){
            System.out.println("Your Fee will be " +"$" +feePayment3);
        }
        else  if (distance > 26 && distance <=50){
            System.out.println("Your Fee will be " +"$" +feePayment4);
        }
        else if (distance > 50) {
            System.out.println("Your Fee will be " +"$" +feePayment5);
        }
    }
}
