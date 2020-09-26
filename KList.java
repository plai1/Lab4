import java.util.*;

public class KList{

	public double [] mergeKList (double [][] outerArray){
		int total = 0; //checks total amout of doubles
		int resIndex = 0; //starting index for resulting array
		double small; //smallest double

		for(int i = 0; i < outerArray.length; i++){ //counts total amount of doubles
			for (int j = 0; j < outerArray[i].length; j++)
				total++;
		};

		double [] res = new double[total];

		for(int i = 0; i < outerArray.length; i++){ //adds all elements from table to resulting array unordered
			for (int j = 0; j < outerArray[i].length; j++){
				res[resIndex] = outerArray[i][j];
				resIndex++;
			}
		}

		for(int i = 0; i < res.length; i++){ //sorts double array
			int pos = i+1;
			double temp;
			while(pos < res.length){
				if (res[pos] <= res[i]){
					temp = res[i];
					res[i] = res[pos];
					res[pos] = temp;
				}
				pos++;
			}
		}

		return res; //returns the ordered resulting array

	}
	public static void main(String args[]){
		KList lister = new KList();
		double [][] input = {{1.1, 4.4, 5.5}, {1.1, 3.3, 4.4}, {2.2, 6.6, 7.7}};
		double [] result = lister.mergeKList(input);
		
		System.out.print("[");
		for(int i = 0; i < result.length; i++){
			if (i != result.length-1)
				System.out.print(result[i] + ", ");
			else
				System.out.println(result[i] + "]");
		};

	}
}

