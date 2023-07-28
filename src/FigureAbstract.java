public class FigureAbstract {
    protected String name;
    private String color;
    private int thickness;
    private int angle;

    FigureAbstract(Builder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.thickness = builder.thickness;
        this.angle = builder.angle;
    }

    public static class Builder {
        private String name;
        private String color;
        private int thickness;
        private int angle;

        public Builder(String color, int thickness, int angle) {
            this.color = color;
            this.thickness = thickness;
            this.angle = angle;
        }

        public FigureAbstract build() {
            return new FigureAbstract(this);
        }
    }

    public void display() {
        System.out.println("Name: " + name + "\n"
                + "\tColor: " + color + "\n"
                + "\tThickness:" + thickness + "\n"
                + "\tAngles: " + angle);
    }
}
