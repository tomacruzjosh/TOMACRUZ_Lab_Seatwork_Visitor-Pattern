public class UnliCallTextPackage implements UnliCallsTextOffer {
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        if (!unliCallText) {
            return "No unlimited calls and texts offered.";
        } else {
            if (telcoName.equalsIgnoreCase("Globe")) {
                return "Unlimited calls and texts within network.";
            } else if (telcoName.equalsIgnoreCase("Dito")) {
                return "Unlimited calls and texts to all networks.";
            }
            return "Unlimited calls and texts available.";
        }
    }
}