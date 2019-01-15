public class Runner {
    public static void main(String[] args){
        double[] scan= {.3,.7,.8,.4,1.4,1.1,.2,.5,.2,1.6,.6,.9};
        double[] scan2= {.3,.7,.8,.4,1.4,1.1};

        skyview sv1= new skyview(4,3,scan);
        skyview sv2= new skyview(3,2,scan2);

        sv1.getView();
        System.out.println("\n");
        sv2.getView();
        System.out.println("\n");
        System.out.println("Average 1: "+ sv1.getAverage(1,3,0,2));
        System.out.println("Average 2: "+ sv2.getAverage(0,1,0,1));
    }
}
