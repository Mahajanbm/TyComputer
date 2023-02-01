package com.example.exception;
public class Data {
	int[] a= {10,20,50,80};
	String str="Pune";
	int x=10,y=1,Res;
	void getData()
	{
		try {
			System.out.println("Outer try Block");
			System.out.println(a[0]);

			try {
				System.out.println(" Inner try");
				System.out.println(str.charAt(1));
			
				try {
					System.out.println(" Inner inner  try  blovk");
					Res=x/y;
					System.out.println(Res);

				} catch (ArithmeticException e) {
					System.out.println(" Inner inner  Catch  blovk");
					System.out.println("Divide by zero exception");
					// TODO: handle exception
				}
				finally {
					System.out.println("inner inner Finally bLock");
				}

			} catch (NullPointerException e) {
				System.out.println("Specific inner Catch");
				System.out.println("null pointer Exception");
			}

			finally
			{
				System.out.println("inner Finally bLock");
			}


		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Specific Outer Catch");
			System.out.println("Array Index Out Of Bounds Exception");
		}
		finally {
			System.out.println("Finally outer block Execution");
		}


	}

}
