import java.util.Scanner;

public class MenuScan {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Que figura quieres? Circulo o Cuadrado");
        String figura = scanner.nextLine();
        
        String c = "Circulo";
    	boolean b = Boolean.parseBoolean(c);
    	
    	String cu = "Cuadrado";
    	boolean o = Boolean.parseBoolean(cu);
        
        if (figura.equals(c)) {
            System.out.println("Ingrese el radio del círculo:");
            double radio = scanner.nextDouble();
            
            System.out.println("Que quiere calcular? el area o circunferencia");
            String calcular = scanner.nextLine();
            calcular = scanner.nextLine();
            
            if (calcular.equals("area")){
            	double area = 3.1416 * Math.pow(radio, 2);
            	System.out.println("El area es " + area); 
            }
            else if (calcular.equals("circunferencia")){
            	double circunferencia = (2 * 3.1416) * radio;
            	System.out.println("La circunferencia es " + circunferencia); 
            }
        }
        
        else if (figura.equals(cu)) {
            System.out.println("Ingrese el lado del cuadrado:");
            double lado = scanner.nextDouble();
            
            System.out.println("Que quiere calcular? el perimetro, area o diagonal");
            String calcular = scanner.nextLine();
            calcular = scanner.nextLine();
            
            if (calcular.equals("area")){
            	double area = Math.pow(lado, 2);
            	System.out.println("El area es " + area); 
            }
            else if (calcular.equals("perimetro")){
            	double perimetro = lado * 4;
            	System.out.println("El perimetro es " + perimetro); 
            }
            else if (calcular.equals("diagonal")){
            	double diagonal = Math.sqrt(Math.pow(lado, 2)+Math.pow(lado, 2));
            	System.out.println("La diagonal es " + diagonal); 
            }
        }
	}
}		
		
		
