import java.io.IOException;

public class ImportException extends IOException {
    int failCount = 0;

    ImportException(int failCount){
        this.failCount = failCount;
    }

    @Override
    public String getMessage() {
        return failCount + " non-matching or failed imports";
    }
}
