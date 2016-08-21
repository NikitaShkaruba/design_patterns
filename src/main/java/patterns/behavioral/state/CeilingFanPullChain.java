package patterns.behavioral.state;

class CeilingFanPullChain {
    private int currentState = 0;

    public void pull() {
        switch (currentState) {
            case 0: {
                currentState = 1;
                System.out.println("low speed");
                break;
            }
            case 1: {
                currentState = 2;
                System.out.println("medium speed");
                break;
            }
            case 2: {
                currentState = 3;
                System.out.println("high speed");
                break;
            }
            case 3: {
                currentState = 0;
                System.out.println("turning off");
                break;
            }
        }
    }
}
