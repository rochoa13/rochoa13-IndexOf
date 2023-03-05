
public class IndexOf {
    /**
     * Find the position of a number in an array.
     * For example, the position of 7 in {0,1,7,3,4} is 2.
     *
     * @param arr an int array.
     * @param n a possible value of arr.
     * @return the first index (position) of n in arr. if n does not exist in arr, return -1.
     */
    public int getIndex(int[] arr, int n){
        int indexOfMatch = -1; //default value IF there is no match
       
        for(int i = 0; i < arr.length; i++){
            
            if(arr[i] ==  n){ // checks if vlaue in array index is a match to n
                return i; // return index if matched, ends method
            }
        }
        return indexOfMatch; // returns -1 if match is not made in if statement
    }
}
