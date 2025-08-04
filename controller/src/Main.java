//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ElevController controller = new ElevController();
        System.out.println("Lista de elevi inainte de adaugarea lui Mihai:");
        controller.findAllElevi();

        controller.saveElev();

        System.out.println("Lista de elevi dupa adaugarea lui Mihai:");

        controller.findAllElevi();
    }
}