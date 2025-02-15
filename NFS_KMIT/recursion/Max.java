class Max {
    public static void main(String[] args){
    int a[] = {1,2,3,5,1,3};
       System.out.println(recursion(a,Integer.MIN_VALUE,0));
    }
    static int recursion(int a[],int max,int n){
            if(n == a.length){
                return max;
            }
            if(max<a[n]){max = a[n];}
            return recursion(a,max,n+1);
        
    }
}
