package day18;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args)
    {
        //Constructing An ArrayList
 
        ArrayList listWithDuplicateElements = new ArrayList();
 
        listWithDuplicateElements.add("JAVA");
 
        listWithDuplicateElements.add("J2EE");
 
        listWithDuplicateElements.add("JSP");
 
        listWithDuplicateElements.add("SERVLETS");
 
        listWithDuplicateElements.add("JAVA");
 
        listWithDuplicateElements.add("STRUTS");
 
        listWithDuplicateElements.add("JSP");
 
        //Printing listWithDuplicateElements
 
        System.out.print("ArrayList With Duplicate Elements :");
 
        System.out.println(listWithDuplicateElements);
 
        //Constructing HashSet using listWithDuplicateElements
 
        HashSet set = new HashSet(listWithDuplicateElements);
 
        //Constructing listWithoutDuplicateElements using set
 
        ArrayList listWithoutDuplicateElements = new ArrayList(set);
 
        //Printing listWithoutDuplicateElements
 
        System.out.print("ArrayList After Removing Duplicate Elements :");
 
        System.out.println(listWithoutDuplicateElements);
    }
  
}