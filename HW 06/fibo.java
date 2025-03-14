public class fibo {
    
    public int[] fibo(int total) {
        if (total <= 0) return new int[0]; // Return an empty array if total is less than or equal to 0
        
        int[] fibonacci = new int[total];
        
        if (total >= 1) fibonacci[0] = 1;
        if (total >= 2) fibonacci[1] = 1;
        
        for (int i = 2; i < total; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]; // Each element is the sum of the previous two
        }
        
        return fibonacci;
    }
}
