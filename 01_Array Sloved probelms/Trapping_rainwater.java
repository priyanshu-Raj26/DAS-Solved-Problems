public class Trapping_rainwater {
    public static int TrappingRainwater(int height[]) {
        int n = height.length;
        if (n == 0) return 0; // Edge case: empty array

        int Lm[] = new int[n]; 
        int Rm[] = new int[n]; 
        int s = 0; 

        Lm[0] = height[0];
        for (int i = 1; i < n; i++) {
            Lm[i] = Math.max(Lm[i - 1], height[i]);
        }

        Rm[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            Rm[i] = Math.max(Rm[i + 1], height[i]);
        }

       
        for (int i = 0; i < n; i++) {
            s += Math.min(Lm[i], Rm[i]) - height[i];
        }

        return s;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Trapped Rainwater is: " + TrappingRainwater(height)); 
    }
}

