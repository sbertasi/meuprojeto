package entities;
/*
 *        ______________________________________________
 *       |        EMPLOYEE                              |
 *       |----------------------------------------------|
 *       | - Name : String                              |
 *       | - GrossSalary: Double                        |
 *       | - Tax : Double                               |
 *       |----------------------------------------------|
 *       | - NetSalary(): Double                        |
 *       | - IncreaseSalary(percentage : Double) : Void |
 *       |______________________________________________|
 *       
 */
public class Employee {
	
	public static String Name;
	public static Double GrossSalary;
	public static Double Tax;
	
	public static Double NetSalary() {
		return GrossSalary - Tax;
			}
	public static void IncreaseSalary(double percentage) {
		GrossSalary += (GrossSalary * percentage / 100);
		
	}
	
		
}
