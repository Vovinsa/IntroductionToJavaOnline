public class Main {

/*Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
столицу, количество областей, площадь, областные центры. */

    public static void main(String[] args) {

        District district1 = new District("Moskovsky");
        District district2 = new District("Oktuaborsky");
        District district3 = new District("Frynzensky");
        District district4 = new District("Vesnyanka");

        City minsk = new City("Minsk");
        minsk.add(district1);
        minsk.add(district2);

        City gomel = new City("Gomel");
        gomel.add(district3);
        gomel.add(district4);

        Region regionMinsk = new Region(minsk, 123);
        Region regionGomel = new Region(gomel, 111);

        Country belarus = new Country("Belarus", minsk);
        belarus.add(regionGomel);
        belarus.add(regionMinsk);

        System.out.println(belarus.getName());
        System.out.println(belarus.getCapital());
        System.out.println(belarus.getRegions().size());
        System.out.println(minsk.getName());
        System.out.println(gomel.getName());
        System.out.println(belarus.area());


    }

}
