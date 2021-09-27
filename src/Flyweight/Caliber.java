package Flyweight;

public enum Caliber {


    THREE(3),
    FIVE(5),
    SEVEN(7);

    private int size;

    Caliber(int size){
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return String.valueOf(size);
    }
}



