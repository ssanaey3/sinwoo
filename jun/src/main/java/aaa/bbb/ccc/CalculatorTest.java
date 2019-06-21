package aaa.bbb.ccc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest{
  @Test
  public void evaluatesExpression(){
    Calculator calculator = new Calculator();
    int sum=0;
    
    try {
          sum = calculator.evaluate("1+2+3");
    }catch(Exception e) {
    	System.out.println(e);
    }
          assertEquals(6, sum);
  }  
}
