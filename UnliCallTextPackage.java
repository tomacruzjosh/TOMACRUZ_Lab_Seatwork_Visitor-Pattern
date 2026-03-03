import java.util.*;

public class UnliCallTextPackage implements UnliCallsTextOffer {
    private static Map<String, Boolean> UnliCallsTextMap = new HashMap<>();
        static {
            UnliCallsTextMap.put("Smart", false);
            UnliCallsTextMap.put("Globe", true);
            UnliCallsTextMap.put("Ditto", true);
        }
    
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        return UnliCallsTextMap.get(telcoName);
    }
}   