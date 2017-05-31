import java.util.Scanner;
class Test 
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please Enter Full Name :");
      String name =  sc.nextLine();
      
      System.out.println("Please Enter Email Address :");
      String email =  sc.nextLine();
      
      System.out.println("Number of  Education Achivement :");
      int numOfAchivement = Integer.parseInt(sc.nextLine());
      while(numOfAchivement>10) 
      {
    	  System.out.println("Please Enter Number of  Education Achivement  Again:");  
    	  numOfAchivement = Integer.parseInt(sc.nextLine());
      }
      System.out.println("Number of Work Experiences:");
      int numOfexperiences = Integer.parseInt(sc.nextLine());
      
      while (numOfexperiences>10)
      {
    	  System.out.println("Please Enter Number of Work Experiences:  Again:");  
    	  numOfexperiences = Integer.parseInt(sc.nextLine());
      }
      
      System.out.println("Number of  Skills with Rating :");
      int numOfSkills = Integer.parseInt(sc.nextLine());
      while(numOfSkills>20) 
      {
    	  System.out.println("Please Enter Number of  Skills with Rating  Again:");  
    	  numOfSkills = Integer.parseInt(sc.nextLine());
      }
      
    		String edu[] = new String[numOfAchivement];
    		 System.out.println("List all Educational Achivement:");
    		
    		 for (int i = 0; i < edu.length; i++)
    		{
    		  edu[i] = sc.nextLine();
    		}
    		
    		String exp[] = new String[numOfexperiences];
    		System.out.println("List all Work Experiences:");
    		for (int i = 0; i < exp.length; i++)
    		{
    		   exp[i] = sc.nextLine();
    		}	
    		
	    	String skill[] = new String[numOfSkills];
	   		System.out.println("List all  Skills with Rating:");
	   		
	   		 for (int i = 0; i < skill.length; i++)
	   		{
	   			skill[i] = sc.nextLine();
	   		}
    		    
	   		System.out.println(name);
	   		System.out.println(email+"\n");
	   		 
    		System.out.println("Education Achivement:");
    		for (int i = 0; i < edu.length; i++) 
    		{
    		    System.out.print(edu[i] + "\n"+"\n");
    		}
    		System.out.println("Work Experiences:");
    		for (int i = 0; i < exp.length; i++) 
    		{
    		 System.out.print(exp[i] + "\n"+"\n");
    		}

    		System.out.println("Skills with Rating :");
    		for (int i = 0; i < skill.length; i++) 
    		{
    		 System.out.print(skill[i] + "\n"+"\n");
    		}
      
   }
}
	
	  
