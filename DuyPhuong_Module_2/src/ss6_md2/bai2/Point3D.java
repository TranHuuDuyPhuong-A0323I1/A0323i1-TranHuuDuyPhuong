package ss6_md2.bai2;

public class Point3D extends Point2D{

        private float z;


    public Point3D(float x, float y, float z) {
            // Gọi phương thức khởi tạo của lớp cha để thiết lập x, y
            super(x, y);
            // Thiết lập z
            this.z = z;
        }
        public float getZ(){
            return z;
        }
        public void setz(float z){
            this.z = z;
        }
        public float[] getXYZ(){
            return new float[] {getX(), getY(), z};
        }
        public void setXYZ(float x, float y, float z){
            setXY(x, y);
            this.z = z;
        }
        @Override
        public String toString() {
            return "(" + getX() + "," + getY() + "," + z + ")";
        }

    }
