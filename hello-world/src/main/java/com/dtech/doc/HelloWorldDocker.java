package com.dtech.doc;

/**
 * Hello world!
 *
 */
public class HelloWorldDocker 
{
    public static void main( String[] args )
    {
        for(int i = 0; i<10; i++) {
        	try {
				System.out.println("docker hello world " + i);
				Thread.sleep(10000);
			} catch (Exception e) {}
        }
    }
}
