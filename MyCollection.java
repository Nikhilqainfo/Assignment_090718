package question2;

import java.lang.reflect.Array;

/**
 * Please implement Dynamic Array Interface
 * 
 * @author
 *
 */
public class MyCollection implements DynamicArray {
	// Uncomment commented section

	/**
	 * You can declare local/global variables as per your requirement
	 */
	@SuppressWarnings("unused")
	private String[] numArray;
	
	int i=0;
	
	public MyCollection(int arraySize){
		numArray = new String[arraySize];
	}

	public int search(String searchingNum) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean add(String numberToAdd) {
		// TODO Auto-generated method stub
	
		for(int t=0;t<=i;t++)
		{
			
			if(numArray[t]==numberToAdd)
			{
				
				return false;
			}
		} 
		
		
		numArray[i]=numberToAdd;
		i++;
		
		return true;
	}

	public void doubleCapacity() {
		// TODO Auto-generated method stub

	}

	public boolean remove(String numberToRemove) {
		// TODO Auto-generated method stub
		return false;
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String toString( ) {
		
		String st="{";
		for(int j=0;j<numArray.length;j++)
		{
			if(numArray[j] != null && numArray[j].length() > 0) {
			st+=numArray[j];
			
			}
		}
		st+="}";
		return st;
	}

	

	
	public String[] rotate(int n) {
		int k;
		int length=numArray.length;
		
		String[] numArray2=new String[n];
		String[] numArray3=new String[15];
		for (k=0;k<n;k++)
		{
			
			numArray2[k]=numArray[k];
		}
		
		int t=0;
		for (k=n;k<length;k++)
		{
			if(numArray[k] != null && numArray[k].length() > 0) {
				  
			
			
			numArray3[t]=numArray[k];
			numArray3[t+1]=", ";
			
			t=t+2;
			
			}
			
		}
		
		
		numArray3[t]="Sometimes";
		t++;
		numArray3[t]=", ";
		t++;
		k=0;
		while(k<=n){
			if(k==n)
			{
				
				break;
			}
			else {
			numArray3[t]=numArray2[k];
			if(k!=n-1)
			{	
			numArray3[t+1]=", ";
			}
			k++;
			t=t+2;
			}
		}
		
		for(int j=0;j<numArray3.length;j++)
		{
			if(numArray3[j] != null && numArray3[j].length() > 0) {
			
			numArray[j]=numArray3[j];
			
			}
			
		}
		
		
		return null;
	}

}


