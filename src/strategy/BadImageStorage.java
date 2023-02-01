package strategy;

public class BadImageStorage {
    private final String compressor;
    private final String filter;

    public BadImageStorage(String compressor, String filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName){
        if (compressor == "jpeg")
            System.out.println("Compressed using JPEG");
        else if (compressor == "png")
            System.out.println("Compressed using PNG");

        if (filter == "b&w")
            System.out.println("Applying B&W filter");
        else if (filter == "high-contrast")
            System.out.println("Applying high-contrast filter");
    }
}
