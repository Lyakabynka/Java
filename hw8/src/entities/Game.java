package entities;

public class Game {
    public enum Genre {
        ACTION, SPORT, RACE
    }

    public enum MediaType {
        VIRTUAL, PHYSICAL
    }

    private final String name;
    private final Genre genre;
    private final MediaType type;

    private Game(String name, Genre genre, MediaType type) {
        this.name = name;
        this.genre = genre;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Genre getGenre() {
        return genre;
    }

    public MediaType getType() {
        return type;
    }

    public static GameDisk getDisk(String name, Genre genre, String description) {
        Game game = new Game(name, genre, MediaType.PHYSICAL);
        return new GameDisk(game, description);
    }

    public static VirtualGame getVirtualGame(String name, Genre genre) {
        Game game = new Game(name, genre, MediaType.VIRTUAL);
        return new VirtualGame(game);
    }

    public static class GameDisk {
        private final String description;
        private final Game data;

        private GameDisk(Game game, String description) {
            this.description = description;
            this.data = game;
        }

        public String getDescription() {
            return description;
        }

        public Game getData() {
            return data;
        }
    }

    public static class VirtualGame {
        private int rating;
        private final Game data;

        private VirtualGame(Game game) {
            this.data = game;
            this.rating = 0;
        }

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            if (rating >= 0 && rating <= 5) {
                this.rating = rating;
            }
        }

        public Game getData() {
            return data;
        }
    }
}