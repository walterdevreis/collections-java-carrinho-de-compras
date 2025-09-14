import entity.Item;

import java.text.NumberFormat;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);


        Item item = new Item("Iphone 17 pro max", 11990.00, 10);

        System.out.println(item);
    }


}