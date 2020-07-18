
public class Main {
    private static int low=0;
    private static  int high=0;
    private static  int middle=0;
    private static int  midindex=0;
    private static int answer;
    private static int lowindex=0;
    private static  int highindex=0;
    public static void main(String[] args) {


        int[] newarray={1,2,3,4,5};
        binarysearch(newarray,5);

    }
    public static void binarysearch(int[] array, int n){
        highindex=array.length-1;
        for(int i=0;i<array.length;i++){
            low= array[lowindex];
            //System.out.println("the lowest was "+low);
            high=array[highindex];
            //System.out.println("The highest was "+high);
            midindex=lowindex+(highindex-lowindex)/2;
            middle=array[midindex];
            //System.out.println("The middle was "+ middle);
            if(middle<n){
                lowindex=midindex+1;
                if(low==high){
                    answer= lowindex;
                    //System.out.println("The answer to right is "+ array[answer]+" at index "+answer);
                    return;
                }
            }
            else if(middle > n){
                highindex=midindex-1;
                //System.out.println("The highest index is "+highindex);
                if(low==high){
                    answer=highindex;
                    //System.out.println("The answer to left is "+ array[answer]+" at index "+answer);
                    return;
                }
            }
            else if (middle == n){
                //System.out.println("The answer to center is "+middle+ " at index "+midindex);
                return;
            }
        }
        //System.out.println("The item in not in the list.");

    }
}
