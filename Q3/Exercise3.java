package Labbook5.Q3;

import java.util.Scanner;

import Labbook5.EmployeeException;

public class Exercise3 {
	public static void main(String[] args)

	{
        Scanner sc=new Scanner(System.in);
        System.out.println("enter salary");
        int salary=sc.nextInt();
        sc.close();
        
        try
        {
        	if(salary<3000)
        	{
        		throw new EmployeeException("Your Salary is below 3000"); 
        	}
        	else
        	{
        		System.out.println("you salary is above 3000");
        	}
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
	}

}
