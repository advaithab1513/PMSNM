package demo;

import org.testng.annotations.Test;

public class Priorityy 
{
	   @Test(priority=2)
	    public void increaseQty(){
	       System.out.println("in increase qty");}

	   @Test(priority=2,dependsOnMethods={"increaseQty"})
	      public void decreaseQty(){
	         System.out.println("in decrease qty");}

	   @Test(priority=3)
	     public void removeFromCart() throws Exception{
	          System.out.println("remove qty");}

	    @Test(priority=3,dependsOnMethods={"removeFromCart"})
	       public void emptyCart() throws InterruptedException{
	             System.out.println("empty Cart");}
}
