package entities;

import entities.enums.Brand;

import java.util.Arrays;
import java.util.Comparator;

public class PlayRoom {
    public static void main(String[] args) {
        Game.GameDisk[] physicalGames = new Game.GameDisk[]{
                Game.getDisk("Game1", Game.Genre.ACTION, "Description1"),
                Game.getDisk("Game2", Game.Genre.SPORT, "Description2"),
                Game.getDisk("Game3", Game.Genre.RACE, "Description3"),
                Game.getDisk("Game4", Game.Genre.ACTION, "Description4")
        };

        // Создаем массив с играми из виртуального магазина
        Game.VirtualGame[] virtualGames = new Game.VirtualGame[]{
                Game.getVirtualGame("VirtualGame1", Game.Genre.ACTION),
                Game.getVirtualGame("VirtualGame2", Game.Genre.SPORT),
                Game.getVirtualGame("VirtualGame3", Game.Genre.RACE),
                Game.getVirtualGame("VirtualGame4", Game.Genre.ACTION)
        };

        // Сортировка массива с физическими дисками по жанру
        Arrays.sort(physicalGames, new Comparator<Game.GameDisk>() {
            @Override
            public int compare(Game.GameDisk game1, Game.GameDisk game2) {
                return game1.getData().getGenre().compareTo(game2.getData().getGenre());
            }
        });

        // Сортировка массива с виртуальными играми по рейтингу
        Arrays.sort(virtualGames, new Comparator<Game.VirtualGame>() {
            @Override
            public int compare(Game.VirtualGame game1, Game.VirtualGame game2) {
                return Integer.compare(game1.getRating(), game2.getRating());
            }
        });

        // Создаем экземпляр GameConsole
        GameConsole gameConsole = new GameConsole(Brand.SONY, "XC123QeWR");

    }
}
