/*
 * Author: Nicholas Teal
 * Date: 	10/2/2016
 */

import java.util.*;
import java.io.*;

/*
 * main function
 * instantiates ProjectReader and accesses it's arraylist - using the .info call
 */
public class Project{
    public static void main(String args[]){
    	//create arraylist to hold input from csv
    	ArrayList<String> input = new ArrayList<String>();
    	//it works with this input from my local repo!
    	/*input = new ProjectReader("/home/nick/Documents/Tulane/fall2016/machineLearning/saul_github/Saul_Class_Projects/data/nicholasTeal/stm_and_noload_2.csv"
).info; */
    	
    	//I'm not sure if this is the correct file path, but the ptogram works
    	
    	input = new ProjectReader("data/nicholasTeal/stm_and_noload_2.csv").info;
    	sdf
    }
}