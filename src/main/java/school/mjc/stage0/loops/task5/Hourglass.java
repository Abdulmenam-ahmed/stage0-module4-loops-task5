package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
    	int half;
    	if (height%2==0)
    		half=height/2;
    	else half= height/2 +1;
    	
    	for (int i=1; i<=height;i++) {
    		for (int j=1; j<=height;j++) {
    		    if(((i-j)<=0 && i-j>= 2*i -(height+1)) && i<=half)
    		    	System.out.print(8);
    		     else if (((i-j)>=0 && i-j<= 2*i -(height+1)) && i>half)
    		    	 System.out.print(8);
    		     else
    		    	 System.out.print(" ");
    		     
    		

    		}
    	System.out.println("");
    	}
    }
}
