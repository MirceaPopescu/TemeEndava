/**
 * Created by mipopescu on 7/12/2016.
 */
class MyVector3 implements Sumabil {
    float x, y, z;

    MyVector3(float x_coord, float y_coord, float z_coord) {
        this.x = x_coord;
        this.y = y_coord;
        this.z = z_coord;
    }

    @Override
    public void addValue(Sumabil value) {
        if (value instanceof MyVector3) {
            this.x += ((MyVector3) value).x;
            this.y += ((MyVector3) value).y;
            this.z += ((MyVector3) value).z;
        }
    }

    public String toString(){
        return "[ " + this.x + ", " + this.y + ", " + this.z + " ]";
    }
};
