package display;

import service.Location;

public class Line {
        private Location startp, endp;
        Line(Location s, Location e) {
            startp = s;
            endp = e;
        }

        Location getStart() { return startp; }
        Location getEnd() { return endp; }
}
