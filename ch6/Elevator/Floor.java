package ch6.Elevator;

public enum Floor {
    ENTRANCE(0), FIRST(1), SECOND(2), THIRD(3), FOURTH(4), FIFTH(5);
    private final int floor;

    Floor(int floor){
        this.floor = floor;
    }
    int getFloor(){return floor;}

    Floor increase(){
        return switch (this) {
            case ENTRANCE -> FIRST;
            case FIRST -> SECOND;
            case SECOND -> THIRD;
            case THIRD -> FOURTH;
            default -> FIFTH;
        };
    }

    Floor decrease() {
        return switch (this) {
            case FIFTH -> FOURTH;
            case FOURTH -> THIRD;
            case THIRD -> SECOND;
            case SECOND -> FIRST;
            default -> ENTRANCE;
        };
    }

    @Override
    public String toString(){
        return "Floor: " + getFloor();
    }
}
