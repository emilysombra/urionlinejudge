class uri1097{
    public static void main(String[] args){
        int i = 1, j = 7;
        for(int k = 0; k<5; k++){
            for(int l = 0; l<3; l++){
                System.out.println("I=" + i + " J=" + j);
                j--;
            }
            i+=2;
            j+=5;
        }
    }
}