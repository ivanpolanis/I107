package Ejercicio3;

public class ParGenericoComparable <X extends Comparable<X>,Y extends Comparable<Y>>{

        private X x;
        private Y y;

        public ParGenericoComparable(X x, Y y) {
            this.x = x;
            this.y = y;
        }

        public X getX() {
            return x;
        }

        public void setX(X x) {
            this.x = x;
        }

        public Y getY() {
            return y;
        }

        public void setY(Y y) {
            this.y = y;
        }
}
