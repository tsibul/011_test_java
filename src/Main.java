import factory.CatalogueFactory;
import factory.ToyFactory;
import toys.Toy;
import toyscatalogue.ToysCatalogue;

import java.util.ArrayList;
import java.util.LinkedList;

import static draw.DrawUtils.drawResult;
import static outputs.Outputs.printCatalogue;
import static outputs.Outputs.printQueue;

public class Main {
    public static void main(String[] args) {

        ArrayList<Toy> toys = ToyFactory.createToys(4);
        ArrayList<ToysCatalogue> stock = CatalogueFactory.toysStock(toys, 8);
        LinkedList<Toy> prizeQueue = new LinkedList<>();
        printCatalogue(stock);
        printQueue(prizeQueue);
        int j = 0;
        while(j < 20) {
            drawResult(stock, prizeQueue);
            j++;
        }
        System.out.println();
        printCatalogue(stock);
        printQueue(prizeQueue);
        System.out.println();

    }
}