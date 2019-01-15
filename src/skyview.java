public class skyview {
    private double[][] view;

    public void getView(){
        for(int x=0;x<view.length;x++){
            for(int y=0; y<view[x].length;y++){
                System.out.print(" "+view[x][y]);
            }
        }
    }

    public void getScanned(double[] scanned){
        for(int x=0; x<scanned.length; x++){
            System.out.print(scanned[x]);
        }
    }

    public skyview(int numRows, int numCols, double[] scanned) {
        this.view = new double[numRows][numCols];
        int index = 0;
        for (int x = 0; x < numRows; x++) {
            if (x % 2 == 0) {
                for (int y = 0; y < numCols; y++) {
                    view[x][y] = scanned[index];
                    index++;
                }
            }
            if (x % 2 == 1) {
                for (int y = numCols-1; y!=0; y--) {
                    view[x][y] = scanned[index];
                    index++;
                }
            }
        }
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol){
        double aver= 0;
        int counter=0;
        for(int r=startRow; r<endRow; r++){
            for(int c=startCol; c<endCol; c++){
                aver+=view[r][c];
                counter++;
            }
        }
        aver=aver/counter;
        return aver;
    }
}

