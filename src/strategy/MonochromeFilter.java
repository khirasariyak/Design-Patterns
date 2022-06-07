package strategy;

public class MonochromeFilter implements Filter{
    @Override
    public void apply(String fileName) {
        System.out.println("Applying Monochrome filter...");
    }
}
