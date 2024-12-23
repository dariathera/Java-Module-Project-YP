import java.util.Scanner;
import java.util.ArrayList;

public class Race {
    Scanner scanner = new Scanner(System.in);
    int numberОfРarticipants = 3;
    ArrayList<Car> raceРarticipants = new ArrayList<>(numberОfРarticipants);

    void getData() {
        System.out.println("Ведите, пожауйста, информацию об участниках в формате:\n" +
                "название машины, средняя скорость машины целым числом в километрах в час\n" +
                "Пример:\nБугатти Вейрон, 220");
        for (int i = 1; i <= numberОfРarticipants; i++) {
            System.out.println(i + "-й участник:");
            String[] data = scanner.nextLine().split(",");
            int velocity = Integer.parseInt(data[1].trim());
            String name = data[0].trim();
            if (velocity > 250 || velocity <= 0) {
                System.out.println("Введено неправдоподобное значение скорости. Попробуйте снова.");
                i--;
            }
            else {
                raceРarticipants.add(new Car(data[0].trim(), velocity));
            }
        }
    }

    Car getLeader() {
        Car leader = raceРarticipants.get(0);
        for (Car car : raceРarticipants) {
            if (car.getDistance() > leader.getDistance()) {
                leader = car;
            }
        }
        return leader;
    }
}
