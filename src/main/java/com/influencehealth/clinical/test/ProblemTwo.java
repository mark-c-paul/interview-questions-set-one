package com.influencehealth.clinical.test;
import java.io.File;
import java.util.List;

import org.apache.commons.io.*;
import org.apache.commons.io.filefilter.TrueFileFilter;
/*
 * For your second programming problem, use the main method below to create a program that
 * does the following:
 * 
 * Given a library - in this case, the commons-io library, use it to perform the following tasks:
 * - Print out the number of files in the src/main/resources directory of this project.
 * - Print out the name of each file in the src/main/resource directory of this project.
 * - Print out the contents of file3.txt in the src/main/resources directory of this project.
 * 
 * For this problem, you are allowed to look at two websites - the JDK javadocs and the commons-io 
 * documentation (links below). You should be able to accomplish it with just these docs, so don't
 * go searching for someone else's implementation to a similar problem.
 *
 * http://docs.oracle.com/javase/7/docs/api/ - JDK javadocs
 * https://commons.apache.org/proper/commons-io/javadocs/api-release/index.html - Commons IO javadocs
 * 
 */
public class ProblemTwo
{

    public static void main(String[] args)
    {
        // Do your implementation here of the three items above. You can create methods as you see fit.
        // The commons-io library is already included as a dependency, so you can access it.
    	try{
    		
    		File dir = new File("src/main/resources");
    		List<File> files = (List<File>) FileUtils.listFiles(dir, TrueFileFilter.INSTANCE, null);
    		System.out.println("Performing file operations using commons-io libraries.");
    		System.out.println("There are "+ files.size() + " files at this path");
    		for (File file : files) {
    			System.out.println(file.getName());
    		}
    		List<String> contents = FileUtils.readLines(files.get(2), "UTF-8");
    		for (String line : contents) {
                System.out.println(line);
            }
		}catch(Exception e){
    		e.printStackTrace();	
    	}
    }

}
