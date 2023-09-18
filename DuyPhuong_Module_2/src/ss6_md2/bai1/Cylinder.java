package ss6_md2.bai1;

public class Cylinder extends Circle
{

        private float height;

        public Cylinder(float radius, String color, float height) {
            super(radius, color);
            this.height = height;
        }

        public float getHeight() {
            return height;
        }

        public void setHeight(float height) {
            this.height = height;
        }

        public float getVolume() {
            return getArea() * height;
        }

        @Override
        public float getArea() {
            return (float) (2 * Math.PI * getRadius() * height + 2 * super.getArea());
        }

        @Override
        public String toString() {
            return "Cylinder:\nRadius = " + getRadius() + "\nColor = " + getColor() + "\nHeight = " + height + "\nVolume = " + String.format("%.2f", getVolume());
        }
    }