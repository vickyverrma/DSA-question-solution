class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> temp = new ArrayList<>();
        while(n>0)
        {
            int current = n%10;
            temp.add(current);
            n = n/10;
        }
        int max1 = Collections.max(temp);
        temp.remove(Integer.valueOf(max1));
        int max2 = Collections.max(temp);
        return max1*max2;
    }
}