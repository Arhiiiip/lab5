package utility;

import Data.Color;
import Data.Country;
import Data.MovieGenre;
import Data.MpaaRating;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;

public class ReadAndCheck {
    private Reader reader;
    private boolean bool;



    public ReadAndCheck(Reader reader, boolean bool) {
        this.reader = reader;
        this.bool = bool;
    }

    public String readAndCheckName() {
        System.out.print("Введите имя:");
        String name = reader.read();
        return name;
    }


    public Integer readAndCheckCordinateX() {
        int x = 317;
        while(x > 316) {
            System.out.println("Введите координату Х, она не должна быть больше 316:");
            try {
                x = Integer.parseInt(reader.read());
                if(x > 316){
                    System.out.println("X не может быть больше 316");
                }
            } catch (NumberFormatException exception){
                System.out.println("X не может принимать такое значение");
            }
        }
        return x;
    }

    public Integer readAndCheckCordinateY(){
        System.out.println("Введите координату Y:");
        String y = reader.read();
        Integer y2 = null;
        try {
            y2 = Integer.parseInt(y);
            return y2;
        } catch (NumberFormatException exception) {
            System.out.println("Значение должно быть целочисленное, типа Integer");
            return readAndCheckCordinateY();
        }
    }

    public MovieGenre readAndCheckMovieGenre(){
        try {
            System.out.println("Введите жанр фильма(WESTERN, DRAMA, TRAGEDY, SCIENCE_FICTION):");
            String line = reader.read();
            if (MovieGenre.isIncludeElement(line)) {
                return MovieGenre.valueOf(line.toUpperCase());
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException exception) {
            System.out.println("Такого жанра нет");
            return readAndCheckMovieGenre();
        }
    }

    public Color readAndCheckColor(){
        try {
            System.out.println("Введите цвет глаз(RED, GREEN, BLACK, BLUE, ORANGE)");
            String line = reader.read();
            if (Color.isIncludeElement(line)) {
                return Color.valueOf(line.toUpperCase());
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException exception) {
            System.out.println("Такого жанра нет");
            return readAndCheckColor();
        }
    }


    public Country readAndCheckCountry(){
        try {
            System.out.println("Введите страну:(RUSSIA, GERMANY, FRANCE)");
            String line = reader.read();
            if (Country.isIncludeElement(line)) {
                return Country.valueOf(line.toUpperCase());
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException exception) {
            System.out.println("Такого жанра нет");
            return readAndCheckCountry();
        }
    }

    public MpaaRating readAndCheckMpaaRating(){
        try {
            System.out.println("Введите MpaaRating(G, PG, PG_13, R, NC_17):");
            String line = reader.read();
            if (MpaaRating.isIncludeElement(line)) {
                return MpaaRating.valueOf(line.toUpperCase());
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException exception) {
            System.out.println("Такого жанра нет");
            return readAndCheckMpaaRating();
        }
    }

    public Float readAndCheckWeight(){
        try {System.out.println("Введите высоту:");
            String line = reader.read();
            if (Float.parseFloat(line) > 0){
            return Float.parseFloat(line);}
        } catch (NumberFormatException exception) {
            System.out.println("Неверно введены данные. Высота не должна быть словом или быть меньше 0.");
            return readAndCheckWeight();
        }
        return null;
    }

    public Integer readAndCheckLocationX() {
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

    public Float readAndCheckLocationY() {
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

    public long autoCreatAndCheckId(HashSet collection) {
        System.out.println("Введите айди, а нет идите нахуй, айди сам вводится.");
        for (long i = 0, id = 1; i < (collection.size() + 1); i++, id++) {
            if (!collection.contains(id)) {
                collection.add(id);
                return id;
            }
        }
        return 0;
    }
    public LocalDateTime autoCreatAndCheckDate(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
        LocalDateTime date = LocalDateTime.now();
        CharSequence dateFormate = date.format(formatter);
        LocalDateTime dateForOut = LocalDateTime.parse(dateFormate, formatter);
        return dateForOut;
    }

    public Integer readAndCheckOscarsCount() {
        System.out.println("Введите координату Y:");
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
