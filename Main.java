public class Main {

    public static double valA, valC, dist, distTot, lat1R, lat2R, lon1R, lon2R;
    public static double radius = 6371;

    public static void main(String[] args) {
	// write your code here
        distTot = 0;

        distTot += distance (25, 23,-15,-20);
        distTot += distance (23, 21, -20, -24);
        distTot += distance (21, 20, -24, -27);
        distTot += distance (20, 19, -27, -35);
        distTot += distance (19, 21, -35, -46);
        distTot += distance (21, 23, -46,-56 );
        distTot += distance (23, 25, -56, -65);
        distTot += distance (25, 28, -65, -70);
        distTot += distance (28, 32, -70, -73);
        distTot += distance (32, 34, -73, -74);
        distTot += distance (34, 36, -74, -74);
        distTot += distance (36, 39, -74, -74);


System.out.print("Total Distance Traveled by Hurricane: ");
        System.out.print(distTot);
System.out.print(" km");

    }
    public static double distance (double lat1 , double lat2 ,double lon1 ,double lon2) {
        lat1R = Math.toRadians(lat1);
        lat2R = Math.toRadians(lat2);
        lon1R = Math.toRadians(lon1);
        lon2R = Math.toRadians(lon2);

        valA = (Math.pow(Math.sin((lat1R - lat2R) / 2), 2)) + ((Math.cos(lat1R)) * (Math.cos(lat2R)) * (Math.pow(Math.sin((lon1R - lon2R) / 2), 2)));
        valC = 2 * (Math.atan2(Math.sqrt(valA), Math.sqrt(1 - valA)));
        dist = valC * radius;

        return dist;

    }



}
