public class Q2 {

    public static void main(String[]args){ 
        double [][] vet ={{1,2,3},{4,5,6},{7,8,9}};
        double[] u={1,2,3};
        double[] v= {6,4,5};
        double [] vR = vetorial(u,v);
    }
    public static double [] vetorial(double [] u,double []v) { 
        double [] pv = new double[3];
        
        pv[0] = (u[1]* v[2] - v[1]*u[2]);
        pv[1] = (u[0]* v[2] - v[0]*u[2]);
        pv[2] = (u[0]* v[1] - v[0]*u[1]);
        return pv;
    }
}
