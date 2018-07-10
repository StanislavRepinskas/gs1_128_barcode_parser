package gs1_128;

import static gs1_128.GS1_128.GS1_128_PARSE;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        try {
            HashMap<String, String> attr = new HashMap<>();
            String barcode = "0104607018700852111806051718062910180605\u001D211";
            GS1_128_PARSE(barcode, attr);
            for (Map.Entry<String, String> entry : attr.entrySet()) {
                System.out.println(entry.getKey() + "=" + entry.getValue());
            }
        } catch (GS1_128.GS1_128_PARSE_EXCEPTION e) {
            Logger.getGlobal().log(Level.WARNING, e.toString());
        }
    }
}
