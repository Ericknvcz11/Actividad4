import java.util.Scanner;

public class MenuScan { 
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Que figura quieres? Circulo o Cuadrado");
        String figura = scanner.nextLine();
        
        String c = "Circulo";
    	
    	String cu = "Cuadrado";
        
        if (figura.equals(c)) {
            System.out.println("Ingrese el radio del círculo:");
            double radio = scanner.nextDouble();
            
            System.out.println("Que quiere calcular? el area o circunferencia");
            String calcular = scanner.nextLine();
            calcular = scanner.nextLine();
            
            if (calcular.equals("area")){
            	Circulo A = new Circulo(); 
    			
    			A.cambialongitud(radio);
    			System.out.println(A.calcularAreac());
            }
            
            else if (calcular.equals("circunferencia")){
            	Circulo B = new Circulo(); 
    			
    			B.cambialongitud(radio);
    			System.out.println(B.calcularCircunferencia()); 
            }
        }
        
        else if (figura.equals(cu)) {
            System.out.println("Ingrese el lado del cuadrado:");
            double lado = scanner.nextDouble();
            
            System.out.println("Que quiere calcular? el perimetro, area o diagonal");
            String calcular = scanner.nextLine();
            calcular = scanner.nextLine();
            
            if (calcular.equals("area")){
            	Cuadrado A = new Cuadrado(); 
    			
    			A.cambiarlongitud(lado);
    			System.out.println(A.calcularArea());
            }
            else if (calcular.equals("perimetro")){
            	Cuadrado B = new Cuadrado();  
    			
    			B.cambiarlongitud(lado);
    			System.out.println(B.calcularPerimetro());
            }
            else if (calcular.equals("diagonal")){
            	Cuadrado C = new Cuadrado(); 
    			
    			C.cambiarlongitud(lado);
    			System.out.println(C.calcularDiagonal());
            }
        }
	}
}		
		
		
