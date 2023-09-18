package ss6_md2.bai1;

public class Circle {

        private float radius;
        private String color;

        public Circle(float radius, String color){
            this.radius = radius;
            this.color = color;
        }

        public float getRadius(){
            return radius;
        }

        public void setRadius(float radius){
            this.radius = radius;
        }

        public String getColor(){
            return color;
        }

        public void setColor(String color){
            this.color = color;
        }

        public float getArea(){
            return (float) (Math.PI * radius * radius);
        }

        @Override
        public String toString(){
            return "Circle:\nRadius = " + radius + "\nColor = " + color + "\nArea = " + String.format("%.2f", getArea());
        }
    }

