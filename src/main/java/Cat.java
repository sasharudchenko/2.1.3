import java.util.Objects;

public class Cat {
    public Cat() {

    }
    private String message;
    public void setMessage(String message) {
         this.message = message;
    }
    public String getMessage() {
        return  message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(message, cat.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }
}
