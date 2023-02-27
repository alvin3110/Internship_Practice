class Array2dDemo{
  public static void main(String args[]){
    int a[][]={{12,45,67},{34,5,7},{12,67,89}};
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }
    System.out.println(a[2][2]);
  }
}