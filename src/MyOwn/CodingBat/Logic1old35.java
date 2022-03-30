package MyOwn.CodingBat;

public class Logic1old35 {

    public boolean old35(int n) {

        boolean divisible = false;

        if (n % 3 == 0 && n % 5 == 0)
            divisible = false;
        else if (n % 5 == 0 || n % 3 == 0)
            divisible = true;

        return divisible;
    }

}
