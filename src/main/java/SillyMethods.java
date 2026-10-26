public class SillyMethods {

    public boolean didGuess42(int guess) {
        return guess == 42;
    }

    public String countTo(int number) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <= number; i++){
            sb.append(i);
            if(i != number){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}