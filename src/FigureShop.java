public class FigureShop {
    private final FigureFactory figureFactory;

    public FigureShop(FigureFactory figureFactory) {
        this.figureFactory = figureFactory;
    }

    public FigureAbstract makeFigure(FigureType type) {
        return figureFactory.createFigure(type);
    }
}
