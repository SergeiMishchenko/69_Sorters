/**
  Implement an insertion sort, in the Sorters structure
  Uses code from hw68 spoiler
 **/
import java.util.ArrayList;

public class InsertionSorter extends Sorter {
	/*
      Construct an instance to process the user's data
     */
    public InsertionSorter ( ArrayList<String> usersData) {
        super(usersData);
    }
	 
    public void mySort() {
        for(int elementToInsert = 1;
            elementToInsert < elements.size();
            insert1(elementToInsert),
            elementToInsert++
            ) {
                // System.out.println("    dbg: "
                    // + "after inserting element " + elementToInsert
                    // + " elements: " + elements
                    // );
            }
    }

    public void insert1(int numSorted) {
        String valueToInsert = elements.get(numSorted);
        boolean inserted = false;
        for(int indexToCompare = numSorted - 1;
            !inserted && indexToCompare > -1;
            indexToCompare--
            ) {
                if(indexToCompare == 0 && valueToInsert.compareTo(elements.get(0)) < 0) {
                    elements.set(1, elements.get(0));
                    elements.set(0, valueToInsert);
                    inserted = true;
                }
                else {
                    if (valueToInsert.compareTo(elements.get(indexToCompare)) < 0) {
                        elements.set(indexToCompare+1, elements.get(indexToCompare));
                    }
                    else {
                        elements.set(indexToCompare+1, valueToInsert);
                        inserted = true;
                    }
                }
        }
    }
}
