package interfacesherencia;

// Calculator interface which extends
// both the above defined interfaces
interface Calculator extends Add_Sub, Mul_Div {

	public void printResult(double result); 
}