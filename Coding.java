package myPackage;

public class Coding {

	public static void main(String[] args) {
		long result = toMilesPerHour(1.25);
		System.out.println(result);
		//printConversion(1.25);
		System.out.println(isLeapYear(1924));
		areEqualByThreeDecimalPlaces(3.175, 3.1756);

	}
	
	public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0){
            return -1;
        } else {
        	return Math.round(kilometersPerHour/1.609);            
        }
    }
	
	
	public static boolean isLeapYear(int year){
        if((year<1)||(year>9999)){
        	System.out.println("executed");
            return false;
        }else if((year%4 == 0)&&(year%100 != 0)) {
        	return true;
        }else if((year%100 == 0)&&(year%400 == 0)) {
        	return true;
        }
        else {
        	System.out.println("Executed");
        	return false;
        }
    }
	
	public static boolean areEqualByThreeDecimalPlaces(double value1, double value2){
        String valueOne = String.format("%.4f", value1);
        String valueTwo = String.format("%.4f", value2);
        String sub1 = valueOne.substring(0, 5);
        String sub2 = valueTwo.substring(0, 5);
        if(sub1.equals(sub2)) {
        	return true;
        }else {
        	return false;
        }
    }
 
}
