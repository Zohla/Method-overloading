public class Main {
    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(16);


    }
    public static double calcFeetAndInchesToCentimeters(int feet,int inches){
        if(feet < 0 || (inches < 0 || inches >12)){
            System.out.println("Invalid value");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches *2.54;
        System.out.println(feet + " feet and " + inches + " inches = " + centimeters + "cm");
        return centimeters;

    }
    public static double calcFeetAndInchesToCentimeters(int inches){
        if(inches >= 0){
            double inchesToFeet = (int) inches/12;
            double remaindingInches = (int) inches % 12;
            System.out.println(inches + " inches = " + inchesToFeet + " feet and " + remaindingInches + " inches");
            return inchesToFeet;

        }
        return -1;
    }
}