package com.learning.basicofJava;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		   
	    int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        
        // New matrix to store the result
        int[][] result = new int[3][3];

        // Add elements in the matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // The output is the resultant matrix
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
} 
		
	/*	int[][] scores = {
				    //Scores for Student 1 in 3 papers
		            {85, 90, 88}, 
                    //Scores for Student 2 in 3 papers
		            {78, 82, 80} 
		        };

		        // Declare the number of students and papers
		        int numberOfStudents = scores.length;
		        int numberOfPapers = scores[0].length;

  		        // Average score for each student
		        for (int student = 0; student < numberOfStudents; student++) {
		            int totalScore = 0;
		            // Total score for the each student
		            for (int paper = 0; paper < numberOfPapers; paper++) {
		                totalScore += scores[student][paper];
		            }
		            //Average score for the each student
		            float averageScore = (float) totalScore / numberOfPapers;
		            // Print the average score
		            System.out.println("Average score for Student " + (student + 1) + ": " + averageScore);
		        }
		    }
	
		}*/
		

		/*  int[] array = {1, 2, 3, 4, 8, 3,  9, 14};
		  
			        
			        // Declare integers for the loops
			        int i, j;
			        
			        // Step 3: Print the message
			        System.out.println("Duplicate elements in the given array:");
			        
			        // Step 4: Repeat Steps 5 to 7
			        for (i = 0; i < array.length; i++) {
			            // Steps 5 to 7
			            for (j = i + 1; j < array.length; j++) {
			                // Step 6: Check if elements are equal
			                if (array[i] == array[j]) {
			                    // Step 7: Print the duplicate element
			                  System.out.println(array[j]);
			                    break;// Break to avoid printing the same duplicate multiple times
			                   }
			            }
			             
			 }
			               
	   }
			           
}
	*/		        
			        
			   
			    
	 
			  
		

		  
		  
		       /* 
		        // Initialize variables to hold the smallest and largest values
		        int smallest = array[0];
		        int largest = array[0];
		        
		        // Iterate through the array to find the smallest and largest elements
		        for (int i = 0; i < array.length; i++) {
		            if (array[i] < smallest) {
		                smallest = array[i];
		            }
		            if (array[i] > largest) {
		                largest = array[i];
		            }
		        }
		        
		        // Output the smallest and largest elements
		        System.out.println("The smallest element is: " + smallest);
		        System.out.println("The largest element is: " + largest);
		    }
		}
*/

     
		
		
		
		
		/*  int[] array = {1,2, 3, 4,9,14}; // Missing number is 8
       
        // Define the complete array with the missing number included
        int[] completeArray = {1, 2, 3, 4, 8, 9, 14};
        
        // Calculate the sum of the complete array (for each number : in the complete array)
        int completeSum = 0;
        for (int num : completeArray) {
            completeSum += num;
        }
        
        // Calculate the sum of the given array (for each number : in the given array)
        int givenSum = 0;
        for (int num : array) {
            givenSum += num;
        }
        
        // The missing number is the difference between the complete sum and the given sum
        int missingNumber = completeSum - givenSum;
        
        // Output the missing number
        System.out.println("The missing number is: " + missingNumber);
    }
}		*/
		/*
		int [] array = {1,2,3,4,8,9,14};
		
		  // even numbers
        System.out.println("Even numbers in the array:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        // Create a new line for odd numbers. Move to the next line before printing odd numbers. 
        System.out.println();
        
        System.out.println("Odd numbers in the array:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
		
		*/
		/*
		int [] array = {1,2,3,4,8,9,14};
		
		int sum = 0;
        
        // Loop through the array to calculate the sum
      for (int i = 0; i < array.length; i++) {
           sum += array[i];
        }
		
		
		 float average = (float) sum / array.length;
	        
	        // Output the average
	        System.out.println("The average value of the array is: " + average);
	        
	}
	
	
}*/
		
		/*
		int [] array = {1,2,3,4,8,9,14};
		
		//int sum = 0; initializes the sum to zero so that it can accurately accumulate the 
		//total of the array values starting from a neutral point.
		//Zero (0) is the neutral element for addition, meaning adding zero to any number doesn’t change the number. 
		//For example, 5 + 0 = 5.
		int sum = 0;
	        
	        // Loop through the array to calculate the sum
	      for (int i = 0; i < array.length; i++) {
	           sum += array[i];
	        }
	        
	        System.out.println("The sum values of the array is: " + sum);
		
*/

