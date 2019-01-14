import java.util.ArrayList;

public class DeltaBits {

    public static void main(String[] args) {

        String baseBitsString = "00000000";
        int newBits = 0;

        ArrayList<String> deltaZero = new ArrayList<String>();
        ArrayList<String> deltaOne = new ArrayList<String>();
        ArrayList<String> deltaTwo = new ArrayList<String>();
        ArrayList<String> deltaThree = new ArrayList<String>();
        ArrayList<String> deltaFour = new ArrayList<String>();
        ArrayList<String> deltaFive = new ArrayList<String>();
        ArrayList<String> deltaSix = new ArrayList<String>();
        ArrayList<String> deltaSeven = new ArrayList<String>();
        ArrayList<String> deltaEight = new ArrayList<String>();

        for(int i = 0; i < 256; i++, newBits++){

            String newBitsString = Integer.toBinaryString(newBits);

            while(newBitsString.length() < 8){

                newBitsString = "0" + newBitsString;
            }

            System.out.println(newBitsString + " compareBits() = " + compareBits(baseBitsString, newBitsString));

            if(compareBits(baseBitsString, newBitsString) == 0){

                deltaZero.add(newBitsString);
            } else if(compareBits(baseBitsString, newBitsString) == 1){

                deltaOne.add(newBitsString);
            } else if(compareBits(baseBitsString, newBitsString) == 2){

                deltaTwo.add(newBitsString);
            } else if(compareBits(baseBitsString, newBitsString) == 3){

                deltaThree.add(newBitsString);
            } else if(compareBits(baseBitsString, newBitsString) == 4){

                deltaFour.add(newBitsString);
            } else if(compareBits(baseBitsString, newBitsString) == 5){

                deltaFive.add(newBitsString);
            } else if(compareBits(baseBitsString, newBitsString) == 6){

                deltaSix.add(newBitsString);
            } else if(compareBits(baseBitsString, newBitsString) == 7){

                deltaSeven.add(newBitsString);
            } else if(compareBits(baseBitsString, newBitsString) == 8){

                deltaEight.add(newBitsString);
            }
        }


        for(int i = 0; i < deltaFour.size(); i++)
            System.out.println(deltaFour.get(i));
    }

    public static int compareBits(String a, String b){

        if(a.length() != b.length()){

            System.out.println("String lengths don't match");
            return -1;
        }

        int count = 0;
        for(int i = 0; i < a.length(); i++){

            if(a.charAt(i) != b.charAt(i))
                count++;
        }
        return count;
    }
}
