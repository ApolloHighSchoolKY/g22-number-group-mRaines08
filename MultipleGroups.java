public class MultipleGroups implements NumberGroup
{
    private List<NumberGroup> groupList;

    public MultipleGroups()
    {
        groupList = new ArrayList<NumberGroup>(0);
    }

    public boolean contains(int num)
    {
        for(int[] group : groupList)
            for(int x : group)
                if(x == num)
                    return true;

        return false;
    }

}
