class ClassMain{
    public static void main(String args[]){
        int n = args.length;
        if(n>=2){
            for(int i=0; i<(n-1); ++i){
                for(int j=0; j<(n-1-i); ++j){
                    if(args[j].compareToIgnoreCase(args[j+1]) > 0){
                        args[j] = args[j] + args[j+1];
                        args[j+1] = args[j].substring(0, (args[j].length() - args[j+1].length()));
                        args[j] = args[j].substring(args[j+1].length(), args[j].length());
                    }
                }
            }
        }
        System.out.println("\nYour arguments in lexicographically sorted order = ");
        for(int i=0; i<n; ++i){
            System.out.print(args[i]+" ");
        }
    }
}