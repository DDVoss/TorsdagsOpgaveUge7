package Task2;

public class Cinema {
    String[][] seats;

    // Række 0, sæde 0 er altid reserveret til direktøren og skal derfor have værdien X
    // Sæder, der ikke er reserveret, har værdien "O"
    public Cinema(int rows, int seats) { // #1 der manglede at blive printet "O" på alle pladser
        this.seats = new String[rows][seats];
        for (int i = 0; i < rows; i++)  {
            for (int h = 0; h < seats; h++) {
                this.seats[i][h] = "O";
            }
        }
        this.seats[0][0] = "X"; // #2 man kan ikke reservere pladsen før biografen er lavet.

    }

    public int getRows() {
        return seats.length;
    }

    public int getSeats() {
        return seats[0].length;
    }

    // If the seat is not yet reserved, it's value is O.
    // In that case, change the value to X and return true.
    // If the seat is already reserved, return false.
    public boolean reserve(int row, int seat) { // #3 sæderne er ændret til at tælle fra 1 i stedet for 0
        row -= 1;
        seat -= 1;

        if (seats[row][seat].equals("O")) {
            seats[row][seat] = "X";
            return true;
        }
        return false;
    }

    public boolean cancelReservation(int row, int seat) { // #5 det samme er kopieret fra fejl 3 så cancelReservation bliver true
        row -= 1;
        seat -= 1;

        if (seats[row][seat].equals("X")) {
            seats[row][seat] = "O"; // #5 vær sikker på at det ikke er O eller tallet 0
            return true;
        }
        return false;
    }

    public String toString() {
        String result = ""; // #4 null skulle sættes til at være en tom streng
        for (int i = 0; i < seats.length; i++) {
            result += "|";
            for (int j = 0; j < seats[i].length; j++) {
                result += seats[i][j] + "|";
            }
            result += "\n";
        }
        return result;
    }
}
