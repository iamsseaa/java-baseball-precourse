package baseball;

public class Application {
    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현

        int nextRound;

        do {
            BaseballGame.Round();
            nextRound = BaseballGame.NextRound();
        } while(nextRound == 1);
    }


}