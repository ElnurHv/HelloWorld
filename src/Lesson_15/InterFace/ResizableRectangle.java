package Lesson_15.InterFace;

public class ResizableRectangle implements Resizable {
 private int length;
 private int width;


    public ResizableRectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void resize() {
        int area = length * width;
        System.out.println(area);

    }

    public static void main(String[] args) {
        ResizableRectangle rect=new ResizableRectangle(5,5);
        rect.resize();
    }
}
