/*
Author: Nicholas Teal
Date:   10/2/2016
 */

//imports
import java.io.*;
import java.util.*;



public class ProjectReader{
	//private arraylist, used to edit and finalize
    private ArrayList<String> list = new ArrayList<String>();
    
    //public ArrayList, used as a property to be accessed
    public ArrayList<String> info = new ArrayList<String>();
    
    //counter variable
    int i;
    
  /*
   * function to read from a csv and save info in an arraylist
   * input: path to csv
   * returns: arraylist with all info from csv (must be floating point numbers, or tries to convert) 
   */
    public ProjectReader(String filePath){
        try{
        	
        	//filereader and buffered reader
        	FileReader file = new FileReader(filePath);
        	BufferedReader buffered = new BufferedReader(file);
        	
        	//skip first line of CSV file
        	String line = buffered.readLine();
        	
        	//go through each element of CSV after first line and add to Arraylist
        	while((line = buffered.readLine()) != null){
        		String[] data = line.split(",");
        		for (i = 0; i < data.length; i++){
        			
        			//replace empty cells with 0.0 in arraylist
        			if(data[i].equals("")){
        				list.add("0.0");
        				
        				//for now, add anything else directly to arraylist
        			}else{
        				list.add(data[i]);
        			}
        		}
        		
        	}
        	//need to close file
        	buffered.close();
        	
        	//allows user to see list and make sure it resembles what is should
        	System.out.println("Array is " + list);
        	
        	//allows user to actually use the list, without returning list
        	this.info = list;
        }
        catch(IOException ex){
        	System.out.println("There was an error with opening " + filePath);
        }
        
    }
}