class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    if(i==j || j==1 || i==n){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                    
                
                    
                }
            
                
            System.out.println();
        }
        
    }
}
OUTPUT:
     * 
    * * 
   *   * 
  *     * 
 * * * * *
