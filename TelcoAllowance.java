import java.util.*;
public class TelcoAllowance implements UsagePromo {
    private static Map<String, Double> AllowanceMap = new HashMap<>();
    static {
        AllowanceMap.put("Smart", 15);
        AllowanceMap.put("Globe", 10);
        AllowanceMap.put("Dito", 8);
    }

    @Override
    public String showAllowance(String telcoName, double money) {
        return AllowanceMap.get(telcoName);
    }
}