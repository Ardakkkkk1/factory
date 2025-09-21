package factorymethod;

public class PdfDocument extends Document {
    @Override
    public void open() {
        System.out.println("Opening PDF document...");
    }
}