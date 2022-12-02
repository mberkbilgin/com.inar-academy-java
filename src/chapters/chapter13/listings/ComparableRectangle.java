package chapters.chapter13.listings;

public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle>{

    public ComparableRectangle(double weight, double height) {
        super(weight, height);
    }

    @Override
    public int compareTo(ComparableRectangle o) {
       if(getArea() > o.getArea()){
           return 1;
       } else if (getArea() < o.getArea()) {
           return -1;
       }else
        return 0;
    }
    @Override
    public String toString(){
        return super.toString() + " Area: " +getArea();

    }

}
