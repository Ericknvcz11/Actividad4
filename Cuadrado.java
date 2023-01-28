
public class Cuadrado {
	public double lado;  
	
	public Cuadrado() {
		this(176107);	
	}
	
	public Cuadrado(int val) {
		lado = val;		
	}
	
	
	public double calcularArea() {
		return lado*2; 
	}
	
	public double calcularPerimetro() {
		return lado*4; 
	}
	
	public double calcularDiagonal() {
		return Math.sqrt(Math.pow(lado, 2)+Math.pow(lado, 2));
	}
	
	public void cambiarlongitud(double x) {
		lado = x; 
	}
	
}
