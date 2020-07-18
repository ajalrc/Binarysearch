//import edu.princeton.cs.algs4.Stopwatch;
public class reformedbinarysearch {
    public static int bettermethod(int[] array,int compare){
        int low=0;int high=array.length-1;
        /**
         * In the loop we have less than equal because if we are looking at the end of the list low would still be
         * incresed by 1 and be out of array index so to counter that.
         */
        while(low<=high){
            int mid= low+(high-low)/2;
            if(compare > array[mid]){
                low=mid + 1;
            }
            else if(compare< array[mid]){
                high=mid -1;
            }
            else return mid;
        }
        return -1;
    }


    public static void main(String[] args){
        //Stopwatch stopwatch= new Stopwatch();
        //System.out.println("I just created my main method myself. ");
        int[] newarray={1,2,3,4,5};
        System.out.println("The answer is at index "+bettermethod(newarray,5));
        //System.out.println("The total elapsed in lecture method was "+stopwatch.elapsedTime());
    }
}

