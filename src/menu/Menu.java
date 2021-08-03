package menu;

import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<MenuAction> menuActions;
    private Scanner scanner;

    public Menu(Scanner scanner, List<MenuAction> menuActions) {
        this.menuActions = menuActions;
        this.scanner = scanner;
    }

    private void printActions() {
        for (int i = 0; i < menuActions.size(); i++) {
            System.out.printf("%d - %s\n", i + 1, menuActions.get(i).getName());
        }
        System.out.printf("%d - Exit\n", menuActions.size() + 1);
    }

    private int getChoice() {
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice - 1;
    }

    public void run() {
        while (true) {
            printActions();
            int choice = getChoice();
            if (choice < 0 || choice > menuActions.size()) {
                System.out.println("Incorrect input");
                continue;
            }
            if (choice == menuActions.size()) break;
            menuActions.get(choice).doAction();
        }
    }
}
