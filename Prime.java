class Prime{
    Prime(){}
    boolean checkprime(Integer n){
        boolean nonprime=false;
        for(int i=2; i<=n/2; i++) {
            if(n%i==0){
                nonprime=true;
                break;
            }
        }
        if(!nonprime){
            return true;
        }
        else{
            return false;
        }
    }
}