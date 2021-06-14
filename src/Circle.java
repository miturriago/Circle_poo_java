
public class Circle {
    // Las constantes estáticas y públicas
    public static final double DEFAULT_RADIUS = 1.0;
    public static final String DEFAULT_COLOR = "rojo";

    // Las variables privadas
    private double radius;
    private String color;

    /** Se crea un círculo con un radio y color por defecto */
    public Circle() {// 1r Constructor
        this.radius = DEFAULT_RADIUS;
        this.color = DEFAULT_COLOR;
    }

    /** Constructor par aun círculo que recibe un radio y el color por defecto */
    public Circle(double radius) {// 2do Constructor
        this.radius = radius;
        this.color = DEFAULT_COLOR;
    }

    /** Constructor par aun círculo con radio y color */
    public Circle(double radius, String color) { // 3rd Constructor
        this.radius = radius;
        this.color = color;
    }

    /** Devuelve el radio: el radio de la variable privada. */
    public double getRadius() {
        return this.radius;
    }

    /**
     * Establece el radio: el definidor público para el radio de variable privada
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Devuelve el color: el color de la variable privada
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Establece el color: el establecedor público para el color de la variable
     * privada
     */
    public void setColor(String color) {
        this.color = color;
    }

    /** Devuelve una cadena autodescriptiva para esta instancia de Circle. */
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }

    /** Devuelve el área de este círculo. */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Devuelve la circunferencia de este círculo. */
    public double getCircumference() {
        return 2.0 * radius * Math.PI;
    }
}