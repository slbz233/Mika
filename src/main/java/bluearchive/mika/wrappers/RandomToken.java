package bluearchive.mika.wrappers;

import java.util.Random;

public final class RandomToken {
    public static void main(String[] args) {
        Random random = new Random();
        String characters = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String rt = "";
        for (int i = 0; i < 255; i++) {
            int index = random.nextInt(characters.length());
            rt += characters.charAt(index);
        }
        System.out.println(rt);
    }
}
