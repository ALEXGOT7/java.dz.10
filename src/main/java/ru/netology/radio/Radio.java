package ru.netology.radio;

public class Radio {
    private int cerrentVolume;
    private int currentStation;

    public int getCerrentVolume() {
        return cerrentVolume;
    }

    public void setCerrentVolume(int cerrentVolume) {
        if (cerrentVolume < 0) {
            return;
        }
        if (cerrentVolume > 10) {
            return;
        }
        this.cerrentVolume = cerrentVolume;
    }

    public void increaseVolume() {
        if (cerrentVolume < 10) {
            cerrentVolume++;
        }
    }

    public void decreaseVolume() {
        if (cerrentVolume > 0) {
            cerrentVolume--;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void next() {
        if (currentStation < 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

}
