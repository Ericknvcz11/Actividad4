
public class Circulo {
	public double radio;  
	
	public Circulo() {
		this(176107);	
	}
	
	public Circulo(int val) {
		radio = val;		
	}
	
	public double calcularCircunferencia() {
		return radio*(2*3.1416); 
	}
	
	public double calcularAreac() {
		return Math.pow(radio, 2)*3.1416; 
	}
	
	public void cambialongitud(double r) {
		radio = r; 
	}
	
	
}
