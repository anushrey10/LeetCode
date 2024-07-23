class Twosum
{
    public int[] twoSum(int[] nums, int target)
    {
        int n=nums.length;
        int[] indices=new int[2];
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]+nums[j]==target) 
                {
                    indices[0]=i;
                    indices[1]=j;
                    return indices;
                }
            }
        }
        return  new int[0];
    }

    public static void main(String[] args)
    {
        Twosum solution=new Twosum();
        int[] nums={2,7,11,15};
        int target=9;
        int[] indices=solution.twoSum(nums, target);
        
        if(indices.length==2)
        {
            System.out.println("Indices: ["+indices[0]+":"+indices[1]+"]");
        }
        else
        {
            System.out.println("No Solution found");
        }
    }
}