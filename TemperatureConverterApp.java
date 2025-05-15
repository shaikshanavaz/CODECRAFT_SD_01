package project;
		
		import java.util.Scanner;

		public class TemperatureConverterApp {

		    public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);

		        System.out.println("Welcome to the Temperature Converter!");
		        System.out.println("------------------------------------");

		        System.out.print("Enter the temperature value: ");
		        double temperature = input.nextDouble();

		        System.out.print("Enter the original unit (C, F, or K): ");
		        String unit = input.next().toUpperCase();

		        double celsius, fahrenheit, kelvin;

		        switch (unit)
		        {
		            case "C":
		                celsius = temperature;
		                fahrenheit = (celsius * 9 / 5) + 32;
		                kelvin = celsius + 273.15;
		                break;
		            case "F":
		                fahrenheit = temperature;
		                celsius = (fahrenheit - 32) * 5 / 9;
		                kelvin = celsius + 273.15;
		                break;
		            case "K":
		                kelvin = temperature;
		                celsius = kelvin - 273.15;
		                fahrenheit = (celsius * 9 / 5) + 32;
		                break;
		            default:
		                System.out.println("Invalid unit entered. Please use C, F, or K.");
		                return; // Exit the program if the unit is invalid
		        }

		        System.out.println("\n--- Conversion Results ---");
		        System.out.println(celsius + " Celsius");
		        System.out.println(fahrenheit + " Fahrenheit");
		        System.out.println(kelvin + " Kelvin");

		        input.close(); // Close the scanner to release resources
		    }
		} 

	



