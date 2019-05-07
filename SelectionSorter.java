/**
  Implement an selection sort, in the Sorters structure
  Uses code from 62_inPlaceSelectionSort
 **/
import java.util.ArrayList;

public class SelectionSorter extends Sorter {
	/*
      Construct an instance to process the user's data
     */
    public SelectionSorter ( ArrayList<String> usersData) {
        super(usersData);
    }

    public void mySort (){
		for( int next = 0
			; next < elements.size() -1  // last needs no sort
			; next++) {
				// for development and debugging
				System.out.println( 
				"so far: " + elements 
				+ " smallest element is at index " + dweebIndex( next) 
				+ " and has the value " + elements.get( dweebIndex( next)));

				/* Find the next smallest. Swap it into place.
					Use SET's convenient feature that it returns
					the value that it replaces.
				*/

				elements.set( next
							, elements.set( dweebIndex( next)
										  , elements.get( next))
							);
				}
		}





    /** 
      @return the index of the smallest element of elements
              whose index is >= \startAt,
              using the reigning champ algorithm.
      helper function for constructor
     */

     private int dweebIndex( int startAt) {
        // use the starting element as a first guess
        int dweebAt = startAt;
        String dweeb = elements.get( dweebAt);

        for( int testAt = startAt +1
           ; testAt < elements.size()
           ; testAt++)
            if( elements.get( testAt).compareTo( dweeb) < 0) {
                // Found a smaller value. Remember it.
                dweebAt = testAt;
                dweeb = elements.get( dweebAt);
            }
        return dweebAt;
     }
}
