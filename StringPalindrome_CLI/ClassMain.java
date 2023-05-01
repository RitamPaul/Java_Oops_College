class ClassMain{
    public static void main(String args[]){
        args[0] = args[0].toLowerCase();
        int i=0, j=args[0].length()-1, mila=1;
        while(i<=j){
            if(args[0].charAt(i) != args[0].charAt(j)){
                System.out.println("Ignoring the case, your string is not pallindrome");
                mila = 0;
                break;
            }
            i++;
            j--;
        }
        if(mila==1)
            System.out.println("Ignoring the case, your string is pallindrome");
    }
}