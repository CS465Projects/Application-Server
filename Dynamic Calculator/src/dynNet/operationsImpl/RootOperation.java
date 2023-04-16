package dynNet.operationsImpl;

import dynNet.dynCalculator.Operation;
import java.lang.Math;

/**
 *
 * 
 */
public class RootOperation implements Operation {
    
	public float calculate(float firstNumber, float secondNumber){
		return (float)Math.pow(firstNumber, 1.0 / secondNumber);
	}
}
