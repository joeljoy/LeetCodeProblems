package greedy;

import java.util.ArrayList;
import java.util.List;

public class WalkingRobotSimulation {

    public static void main(String[] args) {
        int[] commands1 = {4, -1, 3};
        int[][] obstacles1 = {};
        int[] commands2 = {4, -1, 4, -2, 4};
        int[][] obstacles2 = {{2, 4}};
        int[] commands3 = {7, -2, -2, 7, 5};
        int[][] obstacles3 = {
                {-3, 2},
                {-2, 1},
                {0, 1},
                {-2, 4},
                {-1, 0},
                {-2, -3},
                {0, -3},
                {4, 4},
                {-3, 3},
                {2, 2},

        };
        int[] commands4 = {-2, 8, 3, 7, -1};
        int[][] obstacles4 = {{-4, -1}, {1, -1}, {1, 4}, {5, 0}, {4, 5}, {-2, -1}, {2, -5}, {5, 1}, {-3, -1}, {5, -3}};

        WalkingRobotSimulation simulation = new WalkingRobotSimulation();
        System.out.println(simulation.robotSim(commands1, obstacles1));
        System.out.println(simulation.robotSim(commands2, obstacles2));
        System.out.println(simulation.robotSim(commands3, obstacles3));
        System.out.println(simulation.robotSim(commands4, obstacles4));
    }

    public int robotSim(int[] commands, int[][] obstacles) {
        Point currentPosition = new Point();
        String currentDirection = "N";

        List<Point> obstacleList = new ArrayList<>();
        if (obstacles.length != 0) {
            for (int[] obstacle : obstacles) {
                Point obstaclePoint = new Point(obstacle[0], obstacle[1]);
                obstacleList.add(obstaclePoint);
            }
        }

        for (int command : commands) {
            if (command == -1) {
                switch (currentDirection) {
                    case "N":
                        currentDirection = "E";
                        break;
                    case "E":
                        currentDirection = "S";
                        break;
                    case "S":
                        currentDirection = "W";
                        break;
                    case "W":
                        currentDirection = "N";
                        break;
                }
            } else if (command == -2) {
                switch (currentDirection) {
                    case "N":
                        currentDirection = "W";
                        break;
                    case "E":
                        currentDirection = "N";
                        break;
                    case "S":
                        currentDirection = "E";
                        break;
                    case "W":
                        currentDirection = "S";
                        break;
                }
            } else {
                int obstacleAt = checkObstacle(obstacleList, currentPosition, currentDirection, command);
                int x = currentPosition.x;
                int y = currentPosition.y;
                switch (currentDirection) {
                    case "N":
                        if (obstacleAt != 0) {
                            y = obstacleAt - 1;
                        } else {
                            y += command;
                        }
                        currentPosition = new Point(x, y);
                        break;
                    case "E":
                        if (obstacleAt != 0) {
                            x = obstacleAt - 1;
                        } else {
                            x += command;
                        }
                        currentPosition = new Point(x, y);
                        break;
                    case "S":
                        if (obstacleAt != 0) {
                            y = obstacleAt + 1;
                        } else {
                            y -= command;
                        }
                        currentPosition = new Point(x, y);
                        break;
                    case "W":
                        if (obstacleAt != 0) {
                            x = obstacleAt + 1;
                        } else {
                            x -= command;
                        }
                        currentPosition = new Point(x, y);
                        break;
                }
            }
        }
        return square(currentPosition.x) + square(currentPosition.y);
    }

    private int checkObstacle(List<Point> obstaclePoints, Point currentPosition, String currentDirection, int distance) {
        for (Point obstaclePoint : obstaclePoints) {
            switch (currentDirection) {
                case "N":
                    if (obstaclePoint.x == currentPosition.x &&
                            obstaclePoint.y < currentPosition.y + distance) {
                        return obstaclePoint.y;
                    }
                    break;
                case "E":
                    if (obstaclePoint.y == currentPosition.y &&
                        obstaclePoint.x < currentPosition.x + distance){
                    return obstaclePoint.x;
                }
                break;
                case "S":
                    if (obstaclePoint.x == currentPosition.x &&
                            obstaclePoint.y > currentPosition.y - distance) {
                        return obstaclePoint.y;
                    }
                    break;
                case "W":
                    if (obstaclePoint.y == currentPosition.y &&
                            obstaclePoint.x > currentPosition.x - distance) {
                        return obstaclePoint.x;
                    }
                    break;
            }
        }
        return 0;
    }

    private int abs(int a) {
        return Math.abs(a);
    }

    private int square(int a) {
        return a * a;
    }

    static class Point {
        int x;
        int y;

        public Point() {
            x = 0;
            y = 0;
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
