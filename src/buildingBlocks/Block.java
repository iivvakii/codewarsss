package buildingBlocks;

public class Block{
    private int width;
    private int length;
    private int height;

    public Block(int[] arr){
        this.width = arr[0];
        this.length = arr[1];
        this.height = arr[2];
    }

    public int getWidth(){
        return width;
    }

    public int getLength(){
        return length;
    }

    public int getHeight(){
        return height;
    }

    public int getVolume(){
        return width*length*height;
    }

    public int getSurfaceArea(){
        return ((width*length) + (length*height) + (height*width))*2;
    }
}