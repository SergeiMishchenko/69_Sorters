/**
  Implement an insertion sort, in the Sorters structure
  Uses code Leo Shestakov's solution to hw6(
 */

import java.util.ArrayList;
public class InsertionSorter extends Sorter {
    /**
     Construct an instance to process the user's data
     */

    public InsertionSorter(ArrayList< String> usersData) {
        super(usersData);
    }
 
	/*
	Given that the unsorted region ends at index alreadyInserted,
	the method inserts the value at index alreadyInserted into its correct index in the sorted region,
	shifting all the larger values of the sorted region.
	Pre-condition: sorted + unsorted regions
	Post-condition: unsorted region decreases in size and the sorted region increases
	*/
    public void insert1(int alreadyInserted) {
    		String valueToInsert = elements.get(alreadyInserted);
    		for (int indexToCompare = alreadyInserted - 1; indexToCompare >= 0; indexToCompare--) {
    			if (valueToInsert.compareTo(elements.get(indexToCompare)) < 0) {
    				String temp = elements.get(indexToCompare);
    				elements.set(indexToCompare, valueToInsert);
    				elements.set(indexToCompare + 1, temp);
    			}
    		}
    }

    /**
      sort the user's data, implementing insertion sort 
	  The method goes through the list, calling upon
	  insert1, in order to incrementally increase size
	  of the unsorted region and decrease the size of the sorted region.
	  Pre-condition: unsorted + sorted regions
	  Post-condition: only sorted region
     */
    public void mySort() {
		for (int i = 0; i < elements.size(); i++)
			insert1(i);
    }
}
	