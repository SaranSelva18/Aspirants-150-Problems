package Arrays2;

public class findkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputs = {2349, 3245, 8754};

        int minThousands = 9;
        int maxHundreds = 0;
        int minTens = 9;
        int maxUnits = 0;

        for (int num : inputs) {
            int thousands = (num / 1000) % 10;
            int hundreds = (num / 100) % 10;
            int tens = (num / 10) % 10;
            int units = num % 10;

            if (thousands < minThousands) minThousands = thousands;
            if (hundreds > maxHundreds) maxHundreds = hundreds;
            if (tens < minTens) minTens = tens;
            if (units > maxUnits) maxUnits = units;
        }

        System.out.println( "" + minThousands + maxHundreds + minTens + maxUnits);
    }
	
}


