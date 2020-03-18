public class DemoFigures {
    public static void main(String[] args) {
        Triangle tri = new Triangle();
        Rectangle rect = new Rectangle();
        Figures f;
        tri.lengthoffigure();
        rect.lengthoffigure();
        f = tri;
        f.lengthoffigure();
        f = rect;
        f.lengthoffigure();
    }
}
