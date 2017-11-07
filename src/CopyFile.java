/*Following program demonstrates copying content from one file to another
 *First we read the file using input stream and then we write the content we 
 *read to the output file using output stream. Following code copies content
 *of IFile.txt to OFile.txt. In case OFile doesn't exist then program creates
 *OFile.txt and then copies the content. File Handling is an important concept of OOPS*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {  //class name
	 public static void main(String[] args)   //main method
	    {	
	    	FileInputStream instream = null;       //creating object of input stream
		    FileOutputStream outstream = null;	   //creating object of output stream
	 
	    	try{
	    	    File infile =new File("D:\\IFile.txt");         //input file
	    	    File outfile =new File("D:\\OFile.txt");		//output file, if this file is not created then program creates the file by  its own
	 
	    	    instream = new FileInputStream(infile);  
	    	    outstream = new FileOutputStream(outfile); 
	 
	    	    byte[] buffer = new byte[1024];
	 
	    	    int length;
	    	    /*copying the contents from input stream to
	    	     * output stream using read and write methods
	    	     */
	    	    while ((length = instream.read(buffer)) > 0){
	    	    	outstream.write(buffer, 0, length);
	    	    }

	    	    //Closing the input/output file streams
	    	    instream.close();
	    	    outstream.close();

	    	    System.out.println("File copied successfully!");     //success message
	 
	    	}catch(IOException ioe){         //catching the exception
	    		ioe.printStackTrace();    //printing exception
	    	 }
	    } //end of main

}  //end of class
