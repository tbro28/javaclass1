package cp510.assignments.geo_shape;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        class Solution {
            public int[] twoSum(int[] nums, int target) {

                int i = 0;
                int y = 0;
                int[] answer = new int[2];

                for(; i < nums.length; i++ ){

                    for(; y < nums.length; y++ ){

                        if(i != y) {
                            if(nums[i]+nums[y] == target) {
                                answer[0] = i;
                                answer[1] = y;
                                //return answer;
                            }
                        }


                    }

                }

                return answer;

            }
        }



        System.out.println( "Hello World!" );
    }



}
