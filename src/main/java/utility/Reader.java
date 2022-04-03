package utility;

import java.util.Scanner;

public class Reader {
    private Scanner scanner = new Scanner(System.in);
    String line;

    public String read(){
            line = "";
            while (line.equals("")){
                line = scanner.nextLine();
            String lineNoneSpace = line.replaceAll(" ", "");
            if (lineNoneSpace.length() == 0) {
                line = "";
                System.out.println("Вы ничего не ввели.");
            }
            if (lineNoneSpace.equals("exit")) {
                scanner.close();
                return line;
            }
        }
            return line;
    }
}
