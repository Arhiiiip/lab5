package utility;

import Data.Color;
import Data.Country;
import Data.MovieGenre;
import Data.MpaaRating;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;

public class ReadAndCheck {

    public static Reader reader;

    public ReadAndCheck(Reader reader) {
        this.reader = reader;
    }

    public static Reader getReader() {
        return reader;
    }

    public static void setReader(Reader reader) {
        ReadAndCheck.reader = reader;
    }

    public static String readAndCheckName() {
        System.out.print("Введите имя:");
        return reader.read();
    }

    public static Integer readAndCheckCoordinateX() {
        int x = 317;
        while (x > 316) {
            System.out.println("Введите координату Х, она не должна быть больше 316:");
            x = Integer.parseInt(reader.read());
            if (x > 316) {
                System.out.println("X не может быть больше 316");
            }
        }
        return x;
    }

    public static Integer readAndCheckCoordinateY() {
        System.out.println("Введите координату Y:");
        String y = reader.read();
        Integer y2;
        try {
            y2 = Integer.parseInt(y);
            return y2;
        } catch (NumberFormatException exception) {
            System.out.println("Значение должно быть целочисленное, типа Integer");
            return readAndCheckCoordinateY();
        }
    }

    public static MovieGenre readAndCheckMovieGenre() {
        System.out.println("Введите жанр фильма(WESTERN, DRAMA, TRAGEDY, SCIENCE_FICTION):");
        String line = reader.read();
        if (MovieGenre.isIncludeElement(line)) {
            return MovieGenre.valueOf(line.toUpperCase());
        } else {
            System.out.println("Такого жанра нет");
            return readAndCheckMovieGenre();
        }
    }

    public static Color readAndCheckColor() {
        System.out.println("Введите цвет глаз(RED, GREEN, BLACK, BLUE, ORANGE)");
        String line = reader.read();
        if (Color.isIncludeElement(line)) {
            return Color.valueOf(line.toUpperCase());
        } else {
            System.out.println("Такого жанра нет");
            return readAndCheckColor();
        }
    }


    public static Country readAndCheckCountry() {
        System.out.println("Введите страну:(RUSSIA, GERMANY, FRANCE)");
        String line = reader.read();
        if (Country.isIncludeElement(line)) {
            return Country.valueOf(line.toUpperCase());
        } else {
            System.out.println("Такой жанра нет");
            return readAndCheckCountry();
        }
    }

    public static MpaaRating readAndCheckMpaaRating() {
        System.out.println("Введите MpaaRating(G, PG, PG_13, R, NC_17):");
        String line = reader.read();
        if (MpaaRating.isIncludeElement(line)) {
            return MpaaRating.valueOf(line.toUpperCase());
        } else {
            System.out.println("Такого рейтинга нет");
            return readAndCheckMpaaRating();
        }
    }

    public static Float readAndCheckWeight() {
        try {
            System.out.println("Введите высоту:");
            String line = reader.read();
            if (Float.parseFloat(line) > 0) {
                return Float.parseFloat(line);
            }
        } catch (NumberFormatException exception) {
            System.out.println("Неверно введены данные. Высота не должна быть словом или быть меньше 0.");
            return readAndCheckWeight();
        }
        return null;
    }

    public static Integer readAndCheckLocationX() {
        System.out.println("Введите координату локации Х:");
        String x = reader.read();
        Integer x2 = null;
        try {
            x2 = Integer.parseInt(x);
            return x2;
        } catch (NumberFormatException exception) {
            System.out.println("Значение должно быть целочисленное, типа Integer");
            return readAndCheckLocationX();
        }
    }

    public static Float readAndCheckLocationY() {
        System.out.println("Введите координату Y:");
        String y = reader.read();
        Float y2 = null;
        try {
            y2 = Float.parseFloat(y);
            return y2;
        } catch (NumberFormatException exception) {
            System.out.println("Значение должно быть целочисленное, типа Integer");
            return readAndCheckLocationY();
        }
    }

    public static long autoCreatAndCheckId(HashSet collection) {
        System.out.println("Введите айди, а нет идите нахуй, айди сам вводится.");
        for (long i = 0, id = 1; i < (collection.size() + 1); i++, id++) {
            if (!collection.contains(id)) {
                collection.add(id);
                return id;
            }
        }
        return 0;
    }

    public static LocalDateTime autoCreatAndCheckDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
        LocalDateTime date = LocalDateTime.now();
        CharSequence dateFormate = date.format(formatter);
        return LocalDateTime.parse(dateFormate, formatter);
    }

    public static Integer readAndCheckOscarsCount() {
        System.out.println("Введите количество оскаров Y:");
        String count = reader.read();
        Integer countOscars = null;
        try {
            countOscars = Integer.parseInt(count);
            return countOscars;
        } catch (NumberFormatException exception) {
            System.out.println("Значение должно быть целочисленное, типа Integer");
            return readAndCheckOscarsCount();
        }
    }
}
