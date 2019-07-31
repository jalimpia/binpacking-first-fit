
package binpacking;

/**
 *
 * @author Jerone
 */
public class BinPacking {
    static int items[] = {5, 2, 7, 9, 3, 3, 1, 5, 9, 5, 5, 1, 8, 2, 3}; //Dataset (weight)
    final static int binSize = 10; //The Bin maximum weight capacity
    static int bins[] = new int[10]; //Total numbers of Bin
    
    public static void InsertToBin(int pos){
                int j = 0;
                while(j<bins.length){ // Check if the current item can fit to previous bins
                    if(bins[j] + items[pos] <= binSize){
                        bins[j] += items[pos];//This will add up items if <= 100
                        break;
                    }else{
                        j++;
                    }
                }
            }
    
    public static void main(String[] args) {
   
        int binIndex=0; //Bin counter
        for(int i=0; i<items.length; i++){
            if(bins[binIndex] + items[i] <= binSize){
                InsertToBin(i); //Bin inserting
            }else{
                binIndex++; //This will open up new Bin
                InsertToBin(i); //Bin inserting
            }
        }
        
        for(int x:bins){
            System.out.println(x);
        }
  
    }
    
}
