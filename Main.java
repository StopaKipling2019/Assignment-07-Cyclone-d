public class Main {

    public static double lat1, lat2, lon1, lon2, valA, valC, dist, distTot;
    public static double radius = 6371;

    public static void main(String[] args) {
	// write your code here
        System.out.print(distanceTot());
        System.out.print(" km traveled");
    }

    public static double distance1 () {
        lat1 = Math.toRadians(-15);
        lat2 = Math.toRadians(-20);
        lon1 = Math.toRadians(25);
        lon2 = Math.toRadians(23);

        valA = (Math.pow(Math.sin((lat1 - lat2)/2), 2)) + ( (Math.cos(lat1)) * (Math.cos(lat2)) * (Math.pow(Math.sin((lon1-lon2)/2) ,2)) );
        valC = 2 * (Math.atan2(Math.sqrt(valA), Math.sqrt(1-valA)));
        dist = valC * radius;

        return dist;
    }

    public static double distance2 () {
        lat1 = Math.toRadians(-20);
        lat2 = Math.toRadians(-24);
        lon1 = Math.toRadians(23);
        lon2 = Math.toRadians(21);

        valA = (Math.pow(Math.sin((lat1 - lat2)/2), 2)) + ( (Math.cos(lat1)) * (Math.cos(lat2)) * (Math.pow(Math.sin((lon1-lon2)/2) ,2)) );
        valC = 2 * (Math.atan2(Math.sqrt(valA), Math.sqrt(1-valA)));
        dist = valC * radius;

        return dist;
    }

    public static double distance3 () {
        lat1 = Math.toRadians(-24);
        lat2 = Math.toRadians(-27);
        lon1 = Math.toRadians(21);
        lon2 = Math.toRadians(20);

        valA = (Math.pow(Math.sin((lat1 - lat2)/2), 2)) + ( (Math.cos(lat1)) * (Math.cos(lat2)) * (Math.pow(Math.sin((lon1-lon2)/2) ,2)) );
        valC = 2 * (Math.atan2(Math.sqrt(valA), Math.sqrt(1-valA)));
        dist = valC * radius;

        return dist;
    }

    public static double distance4 () {
        lat1 = Math.toRadians(-27);
        lat2 = Math.toRadians(-35);
        lon1 = Math.toRadians(20);
        lon2 = Math.toRadians(19);

        valA = (Math.pow(Math.sin((lat1 - lat2)/2), 2)) + ( (Math.cos(lat1)) * (Math.cos(lat2)) * (Math.pow(Math.sin((lon1-lon2)/2) ,2)) );
        valC = 2 * (Math.atan2(Math.sqrt(valA), Math.sqrt(1-valA)));
        dist = valC * radius;

        return dist;
    }

    public static double distance5 () {
        lat1 = Math.toRadians(-35);
        lat2 = Math.toRadians(-46);
        lon1 = Math.toRadians(19);
        lon2 = Math.toRadians(21);

        valA = (Math.pow(Math.sin((lat1 - lat2)/2), 2)) + ( (Math.cos(lat1)) * (Math.cos(lat2)) * (Math.pow(Math.sin((lon1-lon2)/2) ,2)) );
        valC = 2 * (Math.atan2(Math.sqrt(valA), Math.sqrt(1-valA)));
        dist = valC * radius;

        return dist;
    }

    public static double distance6 () {
        lat1 = Math.toRadians(-46);
        lat2 = Math.toRadians(-56);
        lon1 = Math.toRadians(21);
        lon2 = Math.toRadians(23);

        valA = (Math.pow(Math.sin((lat1 - lat2)/2), 2)) + ( (Math.cos(lat1)) * (Math.cos(lat2)) * (Math.pow(Math.sin((lon1-lon2)/2) ,2)) );
        valC = 2 * (Math.atan2(Math.sqrt(valA), Math.sqrt(1-valA)));
        dist = valC * radius;

        return dist;
    }

    public static double distance7 () {
        lat1 = Math.toRadians(-56);
        lat2 = Math.toRadians(-65);
        lon1 = Math.toRadians(23);
        lon2 = Math.toRadians(25);

        valA = (Math.pow(Math.sin((lat1 - lat2)/2), 2)) + ( (Math.cos(lat1)) * (Math.cos(lat2)) * (Math.pow(Math.sin((lon1-lon2)/2) ,2)) );
        valC = 2 * (Math.atan2(Math.sqrt(valA), Math.sqrt(1-valA)));
        dist = valC * radius;

        return dist;
    }

    public static double distance8 () {
        lat1 = Math.toRadians(-65);
        lat2 = Math.toRadians(-70);
        lon1 = Math.toRadians(25);
        lon2 = Math.toRadians(28);

        valA = (Math.pow(Math.sin((lat1 - lat2)/2), 2)) + ( (Math.cos(lat1)) * (Math.cos(lat2)) * (Math.pow(Math.sin((lon1-lon2)/2) ,2)) );
        valC = 2 * (Math.atan2(Math.sqrt(valA), Math.sqrt(1-valA)));
        dist = valC * radius;

        return dist;
    }

    public static double distance9 () {
        lat1 = Math.toRadians(-70);
        lat2 = Math.toRadians(-73);
        lon1 = Math.toRadians(28);
        lon2 = Math.toRadians(32);

        valA = (Math.pow(Math.sin((lat1 - lat2)/2), 2)) + ( (Math.cos(lat1)) * (Math.cos(lat2)) * (Math.pow(Math.sin((lon1-lon2)/2) ,2)) );
        valC = 2 * (Math.atan2(Math.sqrt(valA), Math.sqrt(1-valA)));
        dist = valC * radius;

        return dist;
    }

    public static double distance10 () {
        lat1 = Math.toRadians(-73);
        lat2 = Math.toRadians(-74);
        lon1 = Math.toRadians(32);
        lon2 = Math.toRadians(34);

        valA = (Math.pow(Math.sin((lat1 - lat2)/2), 2)) + ( (Math.cos(lat1)) * (Math.cos(lat2)) * (Math.pow(Math.sin((lon1-lon2)/2) ,2)) );
        valC = 2 * (Math.atan2(Math.sqrt(valA), Math.sqrt(1-valA)));
        dist = valC * radius;

        return dist;
    }

    public static double distance11 () {
        lat1 = Math.toRadians(-74);
        lat2 = Math.toRadians(-74);
        lon1 = Math.toRadians(34);
        lon2 = Math.toRadians(36);

        valA = (Math.pow(Math.sin((lat1 - lat2)/2), 2)) + ( (Math.cos(lat1)) * (Math.cos(lat2)) * (Math.pow(Math.sin((lon1-lon2)/2) ,2)) );
        valC = 2 * (Math.atan2(Math.sqrt(valA), Math.sqrt(1-valA)));
        dist = valC * radius;

        return dist;
    }

    public static double distance12 () {
        lat1 = Math.toRadians(-74);
        lat2 = Math.toRadians(-74);
        lon1 = Math.toRadians(36);
        lon2 = Math.toRadians(39);

        valA = (Math.pow(Math.sin((lat1 - lat2)/2), 2)) + ( (Math.cos(lat1)) * (Math.cos(lat2)) * (Math.pow(Math.sin((lon1-lon2)/2) ,2)) );
        valC = 2 * (Math.atan2(Math.sqrt(valA), Math.sqrt(1-valA)));
        dist = valC * radius;

        return dist;
    }

    public static double distanceTot () {
        distTot = distance1() + distance2() + distance3() + distance4() + distance5() + distance6() + distance7() + distance8() + distance9() + distance10() + distance11() + distance12();

        return distTot;



    }


}
