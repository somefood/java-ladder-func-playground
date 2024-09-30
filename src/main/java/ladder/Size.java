package ladder;

import java.util.Objects;

public class Size {

    private final int width;

    private final int height;

    public Size(int width, int height) {
        validate(width, height);
        this.width = width;
        this.height = height;
    }

    private void validate(int width, int height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("음수 입력 불가");
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Size size = (Size) object;
        return width == size.width && height == size.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }
}
