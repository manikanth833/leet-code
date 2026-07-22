class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        int n=deck.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
           map.put(deck[i],map.getOrDefault(deck[i],0)+1);
        }
        int ans=0;
        for(int val:map.values())
        {
            ans=gcd(ans,val);
              if(ans==1)
        return false;
        }
      
            return true;

    }    

     int gcd(int a,int b)
        {
            if(b==0){
                return a;
            }
            return gcd(b,a%b);
        }
}