package assignments;

public class ArmStrongBet2No2 {
	
	 public static int power(int digit,int cnt)//4 4
	    {
	        int res = 1;
	        
	        for(int i=1;i<=cnt;i++)
	        {
	            res = res*digit;
	        }
	        return res;
	    }
	    
	    public static boolean isArmStrong(int num)
	    {
	        int temp = num,cnt = 0,res=0;
	        while(temp!=0)
	        {
	            cnt++;
	            temp = temp/10;
	        }
	        
	        temp = num;
	        while(temp!=0)
	        {
	            int digit = temp%10;
	            res = res + power(digit,cnt);
	            temp = temp/10;
	        }
	        
	        if(res==num)
	            return true;
	        return false;
	    }
	    
		public static void main(String[] args) 
		{
		    int start = 100,end = 999;
		    while(start<=end)
		    {
		        if(isArmStrong(start))
		        {
		            System.out.println("Armstrong Number is :"+start);
		        }
		        start++;
		    }
		}

}
