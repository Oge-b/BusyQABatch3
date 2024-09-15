package com.learning.basicofJava;

import java.util.Scanner;

public class StringsAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        // Input the string from the user
		        System.out.println("Enter a string:");
		        String originalString = scanner.nextLine();

		        // Initialize variables for reversing the string
		        String reversedString = "";
		        int index = originalString.length() - 1;

		        // Reverse the string
		        while (index >= 0) {
		            reversedString += originalString.charAt(index);
		            index--;
		        }

		        // Check if the original string is equal to the reversed string
		        if (originalString.equals(reversedString)) {
		            System.out.println("The string is a palindrome.");
		        } else {
		            System.out.println("The string is not a palindrome.");
		        }

		        scanner.close();
		    }
		}


		    /*    Scanner scanner = new Scanner(System.in);

		        // Input the string from the user
		        System.out.println("Enter a string:");
		        String inputString = scanner.nextLine();

		        // Initialize an empty string to store the result
		        String resultString = "";

		        // Loop through each character in the input string
		        for (int i = 0; i < inputString.length(); i++) {
		            char c = inputString.charAt(i);
		            // Append the character to resultString if it's not a white space
		            if (c != ' ') {
		                resultString += c;
		            }
		        }

		        // Output the result
		        System.out.println("String without whitespace: " + resultString);

		        // Close the scanner
		        scanner.close();
		    }
		} */

		
		    /*    Scanner scanner = new Scanner(System.in);

		        // Input a string from the user
		        System.out.println("Enter a string representing an integer:");
		        String numberString = scanner.nextLine();

		        // Convert the string to an integer
		        int number = Integer.parseInt(numberString);

		        // Output the result
		        System.out.println("The integer is: " + number);

		        // Close the scanner
		        scanner.close();
		    }
		} */

		
		/*        Scanner scanner = new Scanner(System.in);

		        // Input an integer from the user
		        System.out.println("Enter an integer:");
		        int number = scanner.nextInt();

		        // Convert the integer to a string using concatenation with an empty string
		        String numberAsString = number + "";

		        // Output the result
		        System.out.println("The integer as a string is: " + numberAsString);

		        // Close the scanner
		        scanner.close();
		    }
		} */

		
		    /*    Scanner scanner = new Scanner(System.in);

		        // Input the sentence from the user
		        System.out.println("Enter a sentence:");
		        String sentence = scanner.nextLine();

		        // Initialize word count
		        int wordCount = 0;

		        // Check if the sentence is not empty
		        if (sentence.length() > 0) {
		            wordCount = 1; // Start with 1 for the first word

		            // Count the number of spaces in the sentence
		            for (int i = 0; i < sentence.length(); i++) {
		                if (sentence.charAt(i) == ' ') {
		                    wordCount++;
		                }
		            }
		        }

		        // Output the number of words
		        System.out.println("The number of words in the sentence is: " + wordCount);

		        // Close the scanner
		        scanner.close();
		    }
		} */

		
		
		      /*  Scanner scanner = new Scanner(System.in);

		        // Input the string from the user
		        System.out.println("Enter a string:");
		        String inputString = scanner.nextLine();

		        // Input the character to count occurrences
		        System.out.println("Enter the character to count:");
		        char characterToCount = scanner.next().charAt(0);

		        // Initialize a variable to count occurrences
		        int count = 0;

		        // Loop through the string and count occurrences of the character
		        for (int i = 0; i < inputString.length(); i++) {
		            if (inputString.charAt(i) == characterToCount) {
		                count++;
		            }
		        }

		        // Output the result
		        System.out.println("The character '" + characterToCount + "' appears " + count + " times in the string.");

		        // Close the scanner
		        scanner.close();
		    }
		}*/

		
	
		  /*      Scanner scanner = new Scanner(System.in);

		        // Input the string from the user
		        System.out.println("Enter a string:");
		        String str1 = scanner.nextLine();

		        // To store reversed string
		        String reversedString = "";

		        // Loop through the original string in reverse order and append characters to reversedString
		        //The charAt() method in Java is used to retrieve a character at a specific index from a String. 
		        //and the charAt() method allows you to access individual characters by their position in the string.
		        for (int i = str1.length() - 1; i >= 0; i--) {
		            reversedString += str1.charAt(i);
		        }

		        // Output the reversed string
		        System.out.println("The reversed string is: " + reversedString);

		        scanner.close();
		    }
		}/*

		       
		    /*    Scanner scanner = new Scanner(System.in);

		        // Input the string from the user
		        System.out.println("Enter a string:");
		        String str1 = scanner.nextLine();

		        // Convert the string to lowercase
		        String lowercaseString = str1.toLowerCase();

		        // Output the lowercase string
		        System.out.println("The string in lowercase is: " + lowercaseString);

		        // Close the scanner
		        scanner.close();
		    }
		} */

		
		     /*   Scanner scanner = new Scanner(System.in);

		        //string from the user
		        System.out.println("Enter a string:");
		        String str1 = scanner.nextLine();

		        // toUpperCase()
		        String upperCaseString = str1.toUpperCase();

		        // Output the uppercase string
		        System.out.println("The string in uppercase is: " + upperCaseString);

		        // Close the scanner
		        scanner.close();
		    }
		} */

		
		       /* Scanner scanner = new Scanner(System.in);

		        //string from the user
		        System.out.println("Enter the string:");
		        String str1 = scanner.nextLine();

		        // Input the starting and ending positions from the user
		        System.out.println("Enter the starting position:");
		        int start = scanner.nextInt();

		        System.out.println("Enter the ending position:");
		        int end = scanner.nextInt();

		        // Get the substring using substring(start, end) method
		        // The substring starts at 'start' and goes up to 'end - 1'
		        String substring = str1.substring(start, end);

		        // Output the substring
		        System.out.println("The substring from index " + start + " to " + end + " is:" + substring);

		        // Close the scanner
		        scanner.close();
		    }
		}*/

		
		      /*  Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter a string:");
		        String inputString = scanner.nextLine();

		        int length = inputString.length();

		        // Output the length
		        System.out.println("The length of the given string is: " + length);

		        // Close scanner
		        scanner.close();
		    }
		}
*/
		
		     /*   Scanner scanner = new Scanner(System.in);

		        // Input two strings from the user
		        System.out.println("Enter the first string:");
		        String string1 = scanner.nextLine();
		        
		        System.out.println("Enter the second string:");
		        String string2 = scanner.nextLine();

		        String output = string1.concat(string2);

		        // Output the concatenated result
		        System.out.println("The concatenated string is: " + output);

		        scanner.close();
		    }
		}
	*/
	
		   /*     // Scanner object for user input
		Scanner scanner = new Scanner(System.in);

		        // Input two strings from the user
		        System.out.println("Enter the first string:");
		        String string1 = scanner.nextLine();
		        
		        System.out.println("Enter the second string:");
		        String string2 = scanner.nextLine();

		        boolean areEqual = string1.equalsIgnoreCase(string2);

		        // Check the boolean value and print the result
		        if (areEqual) {
		            System.out.println("The strings are equal.");
		        } else {
		            System.out.println("The strings are not equal.");
		        }

		        scanner.close();
		    }
		}
	*/