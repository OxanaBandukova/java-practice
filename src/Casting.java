public class Casting {
        // Задача 1
        public static char charExpression(int a) {
            return (char) ('a'+ a);
        }
        // Задача 2
        public static byte getAgeDiff(byte age1, byte age2) {
            byte x = (byte) Math.abs(age1 - age2);
            return x;
        }
    }


