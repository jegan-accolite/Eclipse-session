package jegan;

public interface calculator {
	public Integer add(Integer val1,Integer val2);
	public Integer sub(Integer val1,Integer val2);
	public Long mult(Integer val1,Integer val2);
	public Integer div(Integer val1,Integer val2) throws ArithmeticException;
	public Integer mod(Integer val1,Integer val2);
	
}
