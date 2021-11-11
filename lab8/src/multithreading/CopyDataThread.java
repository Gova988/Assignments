package multithreading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataThread extends Thread{
		
	@Override
	public void run() {
		
	}
	public static void main(String[] args) throws IOException {
		
		File f=new File("D:\\files\\source.txt");
		byte[] array=new byte[(int) f.length()];
		try {
			//here giving the path for the file
			FileInputStream source=new FileInputStream("C:\\files\\source.txt");
			FileOutputStream target=new FileOutputStream("C:\\files\\target.txt");

			//reading source file
			source.read(array);
			//writing all data to new file
			target.write(array);
			
			int s1=array.length;
			//getting the length
			System.out.println(s1);
			
			if(s1<=10  )
			{
				if(s1==10)
				System.out.println("10 characters are copied");
				try {
					Thread.sleep(500);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			
			
			
			
			
			//closing the resources
			source.close();
			target.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

	}

