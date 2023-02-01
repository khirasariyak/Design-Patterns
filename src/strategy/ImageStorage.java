package strategy;

import strategy.compressors.Compressor;
import strategy.filters.Filter;

public class ImageStorage {
    public void store(String fileName, Compressor compressor, Filter filter){
        compressor.compress(fileName);
        filter.apply(fileName);
    }
}
