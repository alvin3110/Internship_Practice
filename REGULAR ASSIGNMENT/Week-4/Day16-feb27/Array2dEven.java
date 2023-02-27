class Array2dEven{
  public static void main(String args[]){
    int arr[][]={{1,2,3},{2,3,4},{4,5,6}};
    int i,j;
    int count=0;
    for( i=0;i<3;i++){
      for ( j=0;j<3;j++){
        if(arr[i][j]%2==0){
          count++;
        }
      }
    }
    System.out.println(count);
  }
}