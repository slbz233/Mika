package bluearchive.mika.wrappers;

import java.util.Random;

public final class RandomVerifyCode {
    public static void main(String[] args) {
        Random random = new Random();
        String characters = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String rv = "";
        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(characters.length());
            rv += characters.charAt(index);
        }
    }
}
