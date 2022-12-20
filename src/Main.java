public class Main {
    public static void main(String[] args) {

        //С помощью цикла for выведите в консоль все числа от 1 до 10.
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }
        System.out.println("Следушее задание:");

        //С помощью цикла for выведите в консоль все числа от 10 до 1.
        for (int a = 10; a >= 1; a -= 1) {
            System.out.println(a);
        }
        System.out.println("Следушее задание:");

        //Выведите в консоль все четные числа от 0 до 17.
        for (int b = 0; b <= 17; b += 2) {
            System.out.println(b);
        }
        System.out.println("Следушее задание:");

        //Выведите в консоль все четные числа от -10 до 10.
        for (int с = -10; с <= 10; с += 1) {
            System.out.println(с);
        }
    }
}