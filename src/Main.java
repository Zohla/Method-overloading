public class Main {
    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(16);
        System.out.println(SecondsAndMinutes.getDurationString(87,103));
        System.out.println(SecondsAndMinutes.getDurationString(125));


    }
    public static double calcFeetAndInchesToCentimeters(double feet,double inches){
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
            double inchesToFeet =  inches/12;
            double remaindingInches =  inches % 12;
            System.out.println(inches + " inches = " + inchesToFeet + " feet and " + remaindingInches + " inches");
            return calcFeetAndInchesToCentimeters(inchesToFeet, remaindingInches);

        }
        return -1;
    }

}