package Assignment7;

public class SortDescending {
	public static void sortAnything (Sortable listObjects[], int numObjects ){
        Sortable temp;
        int indexLargest, index1, index2;
        for(index1 = 0; index1 < numObjects - 1; index1++){
        	indexLargest = index1;
      	  		for (index2 = index1 + 1; index2 < numObjects; index2++){
      	  			if(!(listObjects[index2].lessThan(listObjects[indexLargest]))){
      	  			indexLargest = index2;
      	  			}
      	  		
      	  		}
      	  			temp = listObjects[index1];
      	  			listObjects[index1] =listObjects[indexLargest];
      	  			listObjects[indexLargest] = temp;
        }
}     
}
