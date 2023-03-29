class Cricket {
    void calScore() {
        class Fours {
            int numOfFours= 2;
            int calFourScores(int numOfFours) {
                this.numOfFours = numOfFours;
                return this.numOfFours*4;
            }
        }
        class Sixes {
            int numOfSixes= 5;
            int calSixScores(int numOfSixes) {
                this.numOfSixes = numOfSixes;
                return this.numOfSixes*6;
            }
        }
        Fours f = new Fours();
        Sixes s = new Sixes();
        System.out.println(f.calFourScores(4)+s.calSixScores(5));
    }
}

class Main {
    public static void main(String[] args) {
        Cricket c = new Cricket();
        c.calScore();
    }
}