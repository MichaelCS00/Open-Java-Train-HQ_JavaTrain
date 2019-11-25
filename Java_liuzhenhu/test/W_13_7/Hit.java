
public class Hit {    
     public static void main( String args [] )
     {
         Son son = new Son();
         son.setBlood(100);
         Thread fh,mh ;
         fh = new Thread(son);  
         mh = new Thread(son);
         fh.setName("Father");
         mh.setName("Mother");
         fh.start();
         mh.start();
     }   
 }
 
class Son implements Runnable
{
	int blood ;       
     
    public void setBlood(int b)
    {
       blood = b;       
    }
     
    public void run() {
    	while(true){
    		String name =Thread.currentThread().getName();
    		if(name.equals("Father")){
    			System.out.println(name+" hiting...");
    			blood--;
    		}
    		else
    			if(name.equals("Mother")){
    				System.out.println(name+" hiting...");
    				blood--;
    			}
    		System.out.println("The remain blood: "+blood);
    		try {
    			Thread.sleep(400);       //º‰∏Ù ±º‰
    		} 
    		catch (InterruptedException e) {
    			e.printStackTrace();
    		}
    		if(blood<=0)  return ;
    		}
    }
}
