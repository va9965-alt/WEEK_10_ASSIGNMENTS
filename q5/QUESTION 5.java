class Main {
    static int secondHighest(int[] scores) {
        int highest = -1;
        int second = -1;

        for (int score : scores) {
            if (score > highest) {
                second = highest;
                highest = score;
            } else if (score < highest && score > second) {
                second = score;
            }
        }

        return second;
    }

    public static void main(String[] args) {
        int[] firstScores = {45, 78, 92, 78, 60};
        int[] secondScores = {50, 50, 50};

        System.out.println(secondHighest(firstScores));
        System.out.println(secondHighest(secondScores));
    }
}
