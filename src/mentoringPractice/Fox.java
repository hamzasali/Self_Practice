package mentoringPractice;

public class Fox {

    public boolean isWearingCoat;
    public boolean hasATorch;
    public String coatColor;
    public int bagCount;

    public String toString() {
        return "Fox{" +
                "isWearingCoat=" + isWearingCoat +
                ", hasATorch=" + hasATorch +
                ", coatColor='" + coatColor + '\'' +
                ", bagCount=" + bagCount +
                '}';
    }

    public void setInfo(boolean isWearingCoat, boolean hasATorch, String coatColor, int bagCount) {
        this.isWearingCoat = isWearingCoat;
        this.hasATorch = hasATorch;
        this.coatColor = coatColor;
        this.bagCount = bagCount;
    }

    public void isThief(int foxNumber) {
        if (isWearingCoat && coatColor.equalsIgnoreCase("black") && hasATorch && bagCount == 3) {
            System.out.println("\uD83E\uDD8A Fox" + foxNumber + " is one of the suspects! \uD83E\uDD14");
        } else {
            System.out.println("\uD83E\uDD8A Fox" + foxNumber + " is cleared of charges!");
        }
    }
}