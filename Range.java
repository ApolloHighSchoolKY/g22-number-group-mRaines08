public class Range implements NumberGroup
{
    private int[] nums;

    public Range(int min, int max)
    {
        nums = new int[max - min + 1];

        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = min + i;
        }
    }

    public boolean contains(int num)
    {
        for(int x : nums)
        {
            if(x == num)
                return true;
        }

        return false;
    }
}
