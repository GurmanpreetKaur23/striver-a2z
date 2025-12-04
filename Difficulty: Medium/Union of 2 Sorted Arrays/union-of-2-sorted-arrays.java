class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        Set<Integer> set = new HashSet<>() ;
        ArrayList<Integer> res = new ArrayList<>() ;
        
        for(int i=0 ; i<a.length ; i++) {
            set.add(a[i]) ;
        }
        for(int i=0 ; i<b.length ; i++) {
            set.add(b[i]) ;
        }
        
        for(int n : set) {
            res.add(n) ;
        }
        Collections.sort(res) ;
        return res ;
    }
}
