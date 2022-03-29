package Day7;

public class RectangleDemo {

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    private int length;
    private int width;

    public RectangleDemo(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int rectangleArea() {
        return length * width;
    }

    public int rectanglePerimeter() {
        return 2 * (length + width);
    }

    public String toString(){
        return String.format("Length --> %d Width --> %d Area --> %d Perimeter --> %d",
                length, width, rectangleArea(), rectanglePerimeter());
    }
}
