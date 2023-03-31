package com.company.roughwork2048champs;

public class RoughWork23 {
    private static int getPowerOfTwo(long value) {
        int result = 0;
        while (value >= 2) {
            value = value / 2L;
            result++;
        }
        return result;
    }

    private static long powerOfTwo(long index) {
        if (index == 0) {
            return 1L;
        }

        long result = 1L;
        for (int indexCounter = 1; indexCounter <= index; indexCounter++) {
            result = result * 2L;
        }
        return result;
    }

    public static void main(String[] args) {

        GameProgressionManager gameProgressionManager = new GameProgressionManager(16, 1);
        System.out.println("The attributes of gameProgressionManager are as follows -> ");
        System.out.println("lowestTilePowerOfTwo = " + gameProgressionManager.getLowestTilePowerOfTwo());
        System.out.println("lowestTileValue = " + gameProgressionManager.getLowestTileValue());
        System.out.println("highestTilePowerOfTwo = " + gameProgressionManager.getHighestTilePowerOfTwo());
        System.out.println("highestTileValue = " + gameProgressionManager.getHighestTileValue());
        System.out.println("highestPossibleScore = " + NumericValueDisplay
                .getScoreValueDisplay(gameProgressionManager.getHighestPossibleScore()) + "\n");

        // long value = 8L;
        // System.out.println("getPowerOfTwo(" + value + ") = " + getPowerOfTwo(value));

        long newHighestTileValue = powerOfTwo(23);
        if (gameProgressionManager.hasGameLevelledUp(newHighestTileValue)) {
            System.out.println("YES, the game has levelled up");
            System.out.println("The attributes of gameProgressionManager are as follows (After levelling up) -> ");
            System.out.println("lowestTilePowerOfTwo = " + gameProgressionManager.getLowestTilePowerOfTwo());
            System.out.println("lowestTileValue = " + gameProgressionManager.getLowestTileValue());
            System.out.println("highestTilePowerOfTwo = " + gameProgressionManager.getHighestTilePowerOfTwo());
            System.out.println("highestTileValue = " + gameProgressionManager.getHighestTileValue());
            System.out.println("highestPossibleScore = " + NumericValueDisplay
                    .getScoreValueDisplay(gameProgressionManager.getHighestPossibleScore()) + "\n");
        } else {
            System.out.println("NO, the game has NOT levelled up");
        }
    }
}
