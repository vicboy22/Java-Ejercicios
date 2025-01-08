public class StudentDetails { 

   public void StudentAge() { 
	//variable local age 
	int age = 0; 
	age = age + 5; 	
	System.out.println("La edad del estudiante es : " + age); 
   } 

   public static void main(String args[]) { 
	StudentDetails obj = new StudentDetails(); 		
	obj.StudentAge(); 
    }
 
}
