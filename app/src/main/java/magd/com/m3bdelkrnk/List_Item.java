package magd.com.m3bdelkrnk;

/**
 * Created by Salim3dd on 01/12/2016.
 */

public class List_Item {


    public int img;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name;

    public List_Item(String name ,  int img){
        this.name = name;
        this.img = img;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}

