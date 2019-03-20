package rjava01;


import org.rosuda.REngine.REXP;

import org.rosuda.REngine.Rserve.*;
import org.rosuda.REngine.*;


public class RServeTest {
	
    private static RConnection c = null;

    public RServeTest() throws RserveException {
    		c = new RConnection();
    }
    
    public void getRVersion() throws RserveException, REXPMismatchException {
        REXP x = c.eval("R.version.string");
        System.out.println("R version : " + x.asString());
    }
    
    private void getDoubles() throws RserveException, REXPMismatchException {
        REXP x = c.eval("rnorm(100)");
        double[] d = x.asDoubles();

        for (int i = 0; i < d.length; i++) {
                System.out.println(d[i]);
        }
    }
  
    private void assignJ2R() throws REngineException, REXPMismatchException {
        double[] dataX = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        double[] dataY = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	        
         c.assign("x", dataX);
         c.assign("y", dataY);
        
         double[] d = c.eval("x+y").asDoubles();
                 
         for (int i = 0; i < d.length; i++) {
             System.out.println(d[i]);
         }
   }
    
    public static void main(String[] args) throws REXPMismatchException, REngineException {
	
        RServeTest RServeExample = new RServeTest();
        
         System.out.println("------------���� ��������--------------");
        RServeExample.getRVersion();
        System.out.println("------------���� 100�� ��������-------------");
        RServeExample.getDoubles();          
        System.out.println("------------������ �Ҵ� �� ��� ���-------------");
        RServeExample.assignJ2R();          
        
        REXP xxxx = c.eval("R.version.string");
        System.out.println("test"+xxxx.asString());
        
      }
}