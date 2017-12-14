import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Application {


    public static void main(String[] args) {

        GarageAirCompany garage = new GarageAirCompany();

        Scanner search = new Scanner(System.in);
        System.out.println("Введите необходимую вместимость летного средства :");
        int searchCapacity = search.nextInt();
        int element = 0;


        for (PlaneObject planeObjects : garage.listOfPlanes) {


            List<PlaneObject> listOfSearch = new ArrayList<PlaneObject>();


            if (searchCapacity == planeObjects.getCapacity()) {


                listOfSearch.add(planeObjects);
                System.out.println("Подходящие летные средства " + listOfSearch);
                element++;


            } else {

                //               System.out.println("таких самолетов нет нет");

                // единственны вопрос, как вывести информацию только с этого блока? тк он выведет ее столько раз
                // сколько элементво в ArrayList, если ставить break будет работать когда необходимых
                //элементов нет, или он один. а у меня несколько одиннаковых самолетов
            }


        }
        System.out.println("Поиск закончен, найдено " + element + " летных средств");


        System.out.println("----------------------------------------------------");
        System.out.println("Отсортированный, по дальности полета, список летных средств компании");
        System.out.println("----------------------------------------------------");
        Collections.sort(garage.listOfPlanes, new GarageAirCompany.PlaneComparator());


        try (FileWriter writer = new FileWriter("ArraylistOfPlanes.txt", false)) {


            for (PlaneObject planeObjects : garage.listOfPlanes) {


                System.out.println(planeObjects);

                writer.write(String.valueOf(planeObjects));
                // запись по символам
                writer.append('\n');
                writer.flush();

            }


        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

        //System.out.println(garage.listOfPlanes);


    }
}
