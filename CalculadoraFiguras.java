public class CalculadoraFiguras {
    public void calcularAreaPerimetroCuadrado(double lado) {
        double area = calcularAreaCuadrado(lado);
        double perimetro = calcularPerimetroCuadrado(lado);
        System.out.println("Área del cuadrado: " + area);
        System.out.println("Perímetro del cuadrado: " + perimetro);
    }
    
    public void calcularAreaPerimetroRectangulo(double base, double altura) {
        double area = calcularAreaRectangulo(base, altura);
        double perimetro = calcularPerimetroRectangulo(base, altura);
        System.out.println("Área del rectángulo: " + area);
        System.out.println("Perímetro del rectángulo: " + perimetro);
    }
    
    public void calcularAreaTriangulo(double base, double altura) {
        double area = calcularAreaTriangulo(base, altura);
        System.out.println("Área del triángulo: " + area);
    }
    
    public void calcularAreaPerimetroCircunferencia(double radio) {
        double area = calcularAreaCircunferencia(radio);
        double perimetro = calcularPerimetroCircunferencia(radio);
        System.out.println("Área de la circunferencia: " + area);
        System.out.println("Perímetro de la circunferencia: " + perimetro);
    }

    public double calcularAreaCuadrado(double lado) {
        return lado * lado;
    }
    
    public double calcularPerimetroCuadrado(double lado) {
        return 4 * lado;
    }
    
    public double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }
    
    public double calcularPerimetroRectangulo(double base, double altura) {
        return 2 * (base + altura);
    }
    
    public double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
    
    public double calcularAreaCircunferencia(double radio) {
        return Math.PI * radio * radio;
    }
    
    public double calcularPerimetroCircunferencia(double radio) {
        return 2 * Math.PI * radio;
    }
}
