package utility;

import Data.Color;
import Data.Country;
import Data.MovieGenre;
import Data.MpaaRating;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Scanner;

public class ReadAndCheck {
    private Scanner scanner;
    private boolean bool;
    private Exception NullPointerException;



    public ReadAndCheck(Scanner scanner, boolean bool) {
        this.scanner = scanner;
        this.bool = bool;
    }

    public String readAndCheckName() throws NullPointerException {
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        if (name != null && !name.equals("null")) {
            return name;
        } else throw new NullPointerException();
    }

    public Integer readAndCheckCordinateX() {
        System.out.println("Введите координату Х, она не должна быть больше 316:");
        int x = Integer.parseInt(scanner.nextLine());
        if (x <= 316) {
            return x;
        } else {
            throw new NumberFormatException();

        }
    }

    public Integer readAndCheckCordinateY(){
        System.out.println("Введите координату Y:");
        String y = scanner.nextLine();
        if (y == null || y.equals("null")) throw new NullPointerException();

        try {
            Integer y2 = Integer.parseInt(y);
            return y2;
        } catch (NumberFormatException exception) {
            throw new NumberFormatException();
        }
    }

    public MovieGenre readAndCheckMovieGenre(){
        System.out.println("Введите жанр фильма(WESTERN, DRAMA, TRAGEDY, SCIENCE_FICTION):");
        String line = scanner.nextLine();
        if (line != null && !line.equals("null") && MovieGenre.isIncludeElement(line)){
            MovieGenre genre = MovieGenre.valueOf(line);
        return genre;
        }else throw new NullPointerException();
    }

    public Color readAndCheckColor(){
        System.out.println("Введите цвет глаз(RED, GREEN, BLACK, BLUE, ORANGE)");
        String line = scanner.nextLine();
        if (line != null && !line.equals("null") && Color.isIncludeElement(line)){
            Color genre = Color.valueOf(line);
            return genre;
        }else throw new NullPointerException();
    }


    public Country readAndCheckCountry(){
        System.out.println("Введите страну:(RUSSIA, GERMANY, FRANCE)");
        String line = scanner.nextLine();
        if (line != null && !line.equals("null") && Country.isIncludeElement(line)){
            Country genre = Country.valueOf(line);
            return genre;
        }else throw new NullPointerException();
    }

    public MpaaRating readAndCheckMpaaRating(){
        System.out.println("Введите MpaaRating(G, PG, PG_13, R, NC_17):");
        String line = scanner.nextLine();
        if (line != null && !line.equals("null") && MpaaRating.isIncludeElement(line)){
            MpaaRating genre = MpaaRating.valueOf(line);
            return genre;
        }else throw new NullPointerException();
    }

    public Float readAndCheckWeight(){
        System.out.println("Введите высоту:");
        String line = scanner.nextLine();
        if (line != null && !line.equals("null") && Float.parseFloat(line) > 0){
        try {
            return Float.parseFloat(line);
        } catch (NumberFormatException exception) {
            throw new NumberFormatException();
        }
        }else{
            throw new NumberFormatException();
        }
    }

    public Integer readAndCheckLocationX() {
        System.out.println("Введите координату локации Х:");
        try {
            String line = scanner.nextLine();
            int x = Integer.parseInt(line);
            return x;
        } catch (NumberFormatException exception) {
            throw new NumberFormatException();
        }
    }

    public Float readAndCheckLocationY() {
        System.out.println("Введите координату локации Y:");
        try {
            String line = scanner.nextLine();
            Float y = Float.parseFloat(line);
            return y;
        } catch (NumberFormatException exception) {
            throw new NumberFormatException();
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
        CharSequence forOut = date.format(formatter);
        LocalDateTime dateFor = LocalDateTime.parse(forOut, formatter);
        return dateFor;
    }

    public Integer readAndCheckOscarsCount() {
        System.out.println("Введите количество оскаров:");
        try {
            String line = scanner.nextLine();
            int oscarsCount = Integer.parseInt(line);
            return oscarsCount;
        } catch (NumberFormatException exception) {
            throw new NumberFormatException();
        }
    }
}
