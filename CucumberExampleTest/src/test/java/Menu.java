import cucumber.api.Transpose;
import cucumber.api.java.ru.Дано;

import java.util.List;

public class Menu {

    private String title;
    private boolean isAvailable;
    private int subMenuCount;

    public String getTitle() {
        return title;
    }

    public boolean getAvailable() {
        return isAvailable;
    }

    public int getSubMenuCount() {
        return subMenuCount;
    }



}
