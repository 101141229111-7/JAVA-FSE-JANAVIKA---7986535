public class Main {
    static class AudioPlayer {
        void play(String type) {
            if (type.equals("mp3")) {
                System.out.println("Playing mp3");
            }
        }
    }

    static class AdvancedPlayer {
        void playMp4() {
            System.out.println("Playing mp4");
        }
    }

    static class Adapter {
        AdvancedPlayer a = new AdvancedPlayer();

        void play(String type) {
            if (type.equals("mp4")) {
                a.playMp4();
            }
        }
    }

    public static void main(String[] args) {
        Adapter ad = new Adapter();
        ad.play("mp4");
    }
}