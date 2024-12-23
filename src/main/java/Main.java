public class Main {
    public static void main(String[] args) {
        System.out.println("Здравствуйте! Благодарим Вас за испоьзование \"24 часа Ле-Мана\".\n" +
                "Эта программа позволяет определить победителя гонки.\n" +
                "На данный момент на трассе находятся три машниы.");
        Race race = new Race();
        race.getData();
        System.out.println("Самая быстрая машина: " + race.getLeader().name);
    }
}