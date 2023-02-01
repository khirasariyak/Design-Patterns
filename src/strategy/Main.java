package strategy;

import strategy.compressors.JpegCompressor;
import strategy.compressors.PngCompressor;
import strategy.filters.BlackAndWhiteFilter;
import strategy.filters.MonochromeFilter;

public class Main {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage();
        imageStorage.store("a", new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("b", new PngCompressor(), new MonochromeFilter());
    }
}
