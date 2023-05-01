class ClassMain{
    public static void main(String args[]){
        int n = args.length, count=0;
        for(int i=0; i<n; ++i){
            try{
                int z = Integer.parseInt(args[i]);
            }
            catch(Exception e){
                count++;
            }
        }
        System.out.println("The no. of invalid arguments = "+count+" out of total "+n);
    }
}