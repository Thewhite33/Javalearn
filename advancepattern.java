public class advancepattern{
    // public static void hollow_rec(int totRows,int totCols){
    //     //outer loop
    //     for(int i=1;i<=totRows;i++){
    //         //inner loop
    //         for(int j=1;j<=totCols;j++){
    //             if(i==1 || i==totRows || j==1 || j==totCols){
    //                 //boundary cells
    //                 System.out.print("*");
    //             }else{
    //                 System.out.print(" ");
    //             }
                
    //         }
    //         System.out.println();
    //     }
    // }
    public static void main(String args[]){
        //hollow_rec(10, 7);
        //Inverted and rotated half pyramid
        // int n = 4;
        // //outer
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=1;j<=i;j++){
        //     System.out.print("*");
        //     }
            
        //     System.out.println();
        // }

        //Inverted half pyramid with numbers
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i+1;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        //Floyds triangle
        // int n = 5;
        // int counter = 1;
        // for(int i=1;i<=n;i++){
        //     for( int j=1;j<=i;j++){
        //         System.out.print(counter+" ");
        //         counter++;
        //     }
        //     System.out.println();
        // }

        //0-1 triangle
        // int n = 5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         if((i+j)%2==0){
        //             System.out.print("1" +" ");
        //         }else{
        //             System.out.print("0" + " ");
        //         }
        //     }
        //     System.out.println();
        // }

        //Butterfly Pattern
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            int gap = 2*(n-i);
            for(int j=1;j<=gap;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            int gap = 2*(n-i);
            for(int j=1;j<=gap;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }

        //Solid Rhombus
        // int n= 15;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=(n-i);j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=n;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        //Hollow Rhombus
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=(n-i);j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=n;j++){
        //         if(i==1||i==n||j==1||j==n){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
                
        //     } 
        //     System.out.println();
        //     }
        
        //Diamond Pattern
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        for(int i=1;i<=n;i--){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        
        }

        
        
    }
    

