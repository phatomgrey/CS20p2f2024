package Mastery;

public class Num {
    private int number;

    // Constructor
    public Num(int number) {
        this.number = number;
    }

    // Get the ones digit
    public int getOnesDigit() {
        return Math.abs(number % 10);
    }

    // Get the tens digit
    public int getTensDigit() {
        return Math.abs((number / 10) % 10);
    }

    // Get the hundreds digit
    public int getHundredsDigit() {
        return Math.abs((number / 100) % 10);
    }

    // Get the whole number
    public int getNumber() {
        return number;
    }
}

