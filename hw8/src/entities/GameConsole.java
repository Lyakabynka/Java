package entities;

import entities.enums.Brand;
import entities.exceptions.ConsoleInactiveException;
import entities.interfaces.Powered;

public class GameConsole implements Powered {
    private final Brand brand;
    private final String model;
    private final String serial;
    private final Gamepad firstGamepad;
    private final Gamepad secondGamepad;
    private boolean isOn;
    private Game activeGame;
    private int waitingCounter;

    public GameConsole(Brand brand, String serial) {
        this.brand = brand;
        this.serial = serial;
        this.model = "Model";
        this.firstGamepad = new Gamepad(brand, serial, 1);
        this.secondGamepad = new Gamepad(brand, serial, 2);
        this.isOn = false;
        this.activeGame = null;
        this.waitingCounter = 0;
    }

    // Геттеры для полей
    public Brand getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSerial() {
        return serial;
    }

    public boolean isOn() {
        return isOn;
    }

    public Game getActiveGame() {
        return activeGame;
    }

    public int getWaitingCounter() {
        return waitingCounter;
    }

    // Методы для включения и выключения консоли
    @Override
    public void powerOn() {
        isOn = true;
    }

    @Override
    public void powerOff() {
        isOn = false;
    }

    // Методы для загрузки и игры в игру
    public void loadGame(Game game) {
        activeGame = game;
        System.out.println("Игра " + game.getName() + " загружается");
    }

    public void playGame() {
        if (!isOn) {
            System.out.println("Консоль выключена. Нельзя играть.");
            return;
        }

        if (activeGame == null) {
            System.out.println("Нет загруженной игры. Нельзя играть.");
            return;
        }

        checkStatus();

        System.out.println("Играем в " + activeGame.getName());
        System.out.println("Заряд активных джойстиков:");
        if (firstGamepad.isOn()) {
            System.out.println("Первый джойстик: " + firstGamepad.getChargeLevel() + "%");
            firstGamepad.decreaseChargeLevel(10);
        }
        if (secondGamepad.isOn()) {
            System.out.println("Второй джойстик: " + secondGamepad.getChargeLevel() + "%");
            secondGamepad.decreaseChargeLevel(10);
        }
    }

    // Приватный метод для проверки статуса и счетчика ожидания
    private void checkStatus() {
        if (!firstGamepad.isOn() && !secondGamepad.isOn()) {
            waitingCounter++;
            if (waitingCounter >= 5) {
                powerOff();
                throw new ConsoleInactiveException("Приставка завершает работу из-за отсутствия активности");
            }
        } else {
            waitingCounter = 0;
        }
    }

    public class Gamepad implements Powered {
        public enum Color { RED, BLUE, BLACK }

        private final Brand brand;
        private final String consoleSerial;
        private final int connectedNumber;
        private Color color;
        private double chargeLevel;
        private boolean isOn;

        public Gamepad(Brand brand, String consoleSerial, int connectedNumber) {
            this.brand = brand;
            this.consoleSerial = consoleSerial;
            this.connectedNumber = connectedNumber;
            this.color = Color.BLACK;
            this.chargeLevel = 100.0;
            this.isOn = false;
        }

        // Геттеры для полей
        public Brand getBrand() {
            return brand;
        }

        public String getConsoleSerial() {
            return consoleSerial;
        }

        public int getConnectedNumber() {
            return connectedNumber;
        }

        public Color getColor() {
            return color;
        }

        public double getChargeLevel() {
            return chargeLevel;
        }

        public boolean isOn() {
            return isOn;
        }

        // Методы для включения и выключения джойстика
        @Override
        public void powerOn() {
            isOn = true;
        }

        @Override
        public void powerOff() {
            isOn = false;
        }

        // Метод для уменьшения заряда джойстика
        public void decreaseChargeLevel(double amount) {
            chargeLevel -= amount;
            if (chargeLevel <= 0) {
                chargeLevel = 0;
                isOn = false;
            }
        }
    }
}