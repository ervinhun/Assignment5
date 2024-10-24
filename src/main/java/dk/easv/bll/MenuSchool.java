package dk.easv.bll;

import dk.easv.Menu;

public class MenuSchool extends Menu {
    /**
     * Creates an instance of the class with the given header text and
     * menu options.
     *
     * @param header    The header text of the menu.
     * @param menuItems The list of menu items texts.
     */
    public MenuSchool(String header, String... menuItems) {
        super(header, menuItems);
    }

    @Override
    protected void doAction(int option) {
        System.out.println("MenuSchool - " + option);
    }
}
