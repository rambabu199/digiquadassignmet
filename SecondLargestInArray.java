public class SecondLargestInArray
{  
	public static int getSecondLargest(int[] a, int total)
	{  
		int temp;  
		for (int i = 0; i < total; i++)   
	        	{  
        		    for (int j = i + 1; j < total; j++)   
        		    {  
        		        if (a[i] > a[j])   
        		        {  
        		            temp = a[i];  
        		            a[i] = a[j];  
        		            a[j] = temp;  
        		        }  
        		    }  
       		 	}  
      		 return a[total-2];  
	}  
	public static void main(String args[])
	{  
		int a[]={11,12,15,56,73,52};  
		int b[]={244,366,799,277,533,22,155};  
		System.out.println("Second Largest: "+getSecondLargest(a,6));  
		System.out.println("Second Largest: "+getSecondLargest(b,7));  
	}
}  