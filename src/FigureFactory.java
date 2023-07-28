public class FigureFactory {
    public FigureAbstract createFigure(FigureType figureType) {

        return switch (figureType) {

            case RECTANGLE -> new Rectangle.RectangleBuilder("Black", 33, 2).build();
            case CIRCLE -> new Circle.CircleBuilder("White", 22, 1).build();
            case RHOMB -> new Rhomb.RhombBuilder("Orange", 1 ,3).build();
            case TRIANGLE -> new Triangle.TriangleBuilder("Purple", 33, 6).build();
            case SQUARE -> new Square.SquareBuilder("Green", 345, 4).build();

        };
    }
}

