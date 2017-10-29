package duplicated_code.example_1;

public class EngineerNotFoundException extends IllegalArgumentException {
    public EngineerNotFoundException(String type) {
        super("engineer not found " + type);
    }
}
