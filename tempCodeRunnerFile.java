
        
        


         for(int i=0;i<m;i++){
             int count1=0;
             int count2=0;
            for(int j=0;j<n;j++){
               count1=count1+a[i][j];
                count2=count2+b[m-1-i][j];
                
                
            }
            System.out.println(count1);
            System.out.println(count2);
            System.out.println(count1+count2);
           
            
        }
        
    }
}