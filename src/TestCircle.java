
public class TestCircle {
    public static void main(String[] args) {
        // Se crea una isntancia con radio y color difinido.
        Circle c1 = new Circle(1.1, "blue");
        System.out.println(c1);
        // Se crea una isntancia con radio definido y color por defecto.
        Circle c2 = new Circle(2.2);
        System.out.println(c2);
        //Se crea una isntancia con radio y color por defecto.
        Circle c3 = new Circle();
        System.out.println(c3);

        //Se envia un nuevo radio para c1
        c1.setRadius(3.3);
        //Se envía un nuevo color para c1
        c1.setColor("verde");
        System.out.println(c1);
        //Obtenemos el radio de c1
        System.out.println("El radio es: " + c1.getRadius());
        //Obtenemos el color de c1
        System.out.println("El color es: " + c1.getColor());
        //Obtenemos el área para c1
        System.out.printf("El área es: %.2f%n", c1.getArea());
        //Obtenemos la circunferencia para c1
        System.out.printf("La circunferencia es: %.2f%n", c1.getCircumference());
    }
}