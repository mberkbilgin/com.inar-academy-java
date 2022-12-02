package chapters.chapter13.listings;

import java.util.Date;

public class House implements Cloneable, Comparable<House>{
private int id;
private double area;
private Date whenBuilt;

    public House(int id, double area) {
        this.id = id;
        this.area = area;
        whenBuilt = new Date();
    }

    public Date getWhenBuilt() {
        return whenBuilt;
    }

    public int getId() {
        return id;
    }

    public double getArea() {
        return area;
    }

    @Override
    public int compareTo(House o) {
      if(area > o.area){
          return 1;
      } else if (area < o.area) {
          return -1;
      }else{
        return 0;
      }

    }
    @Override
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

}
