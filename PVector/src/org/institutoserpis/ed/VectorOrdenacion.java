package org.institutoserpis.ed;

public class VectorOrdenacion {
	
	public static void main (String args []){
		
		int [] v= new int [] {22, 14 ,16 ,20};
	
	}
	
	public static void SelectionSort (int[]v){
		
		for (int indexItem=0; indexItem<v.length - 1; indexItem++){
			int IndexMin= indexItem;
			for(int index=1; index<v.length;index++){
				if( v[index]< v[IndexMin])
					IndexMin= index;
				int aux=v[IndexMin];
				v[indexItem]=v[IndexMin];
				v[IndexMin]=aux;
			}
		}

	}
		
	public static int[] ordenarVector(int[] n) {
		int aux=0;
		int j=0;
			for (int i =0; i>n.length;i++){
				for(j=i+1; j<n.length; j++){
					if(n[i]>n[j])
					{
						aux 	= n [i];
						n [i]	= n [j];
						n [j] 	= aux;
					}
				}
			}
			return n;
	}
}

