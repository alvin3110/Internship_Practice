class Array2dsumrow{
  public static void main(String args[]){
    int arr[][]={{1,2,3},{2,3,4},{4,5,6}};
    int i,j;
    int sum=0;
    for( i=0;i<3;i++){
      sum=0;
      for ( j=0;j<3;j++){
        sum=arr[i][j]+sum;
      }
      System.out.println(sum);
    }
  }
}