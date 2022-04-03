package Command;

import utility.MovieFactory;

public class InfoCommand extends CommandAbstract{

    MovieFactory movieFactory;

    public InfoCommand(String name, String description, MovieFactory movieFactory) {
        super(name, description);
        this.movieFactory = movieFactory;
    }

    public void execute(String arg) {
        System.out.println("Iнформация о коллекции:" + "\n" +
        movieFactory.getCollectionForWork().getClass() + "\n" +
        "Колличество эллементов: " + movieFactory.getCollectionForWork().size() + "\n" +
        "Дата и время инициализации: " + movieFactory.getCollectionManager().getDateInitialization() + "\n" +
        "Дата и время последнего обновления: " + movieFactory.getCollectionManager().getDateUpdate() + "\n" +
        "Количество не сохранённых изменённых элементов: " + movieFactory.getCollectionManager().getCountChange());
    }
}
