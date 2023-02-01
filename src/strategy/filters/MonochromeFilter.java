package strategy.filters;

import strategy.filters.Filter;

public class MonochromeFilter implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("Applying Monochrome filter...");
    }
}
