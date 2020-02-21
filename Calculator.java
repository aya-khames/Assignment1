public class Calculator implements ICalculator {
        public int add(int x , int y){
           return x+y;
        }
        public float divide(int x , int y){
             if(y==0){
                 throw new RuntimeException("division by zero is not allowed");
             }
            return (float)x/(float)y;
        }
}