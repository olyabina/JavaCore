package Practic7;

public final class ApplicationGlobalState {

    private static ApplicationGlobalState INSTANCE;
    private String selectedCity = null;
    private final String API_KEY = "qwertyuiop";

    private ApplicationGlobalState() {
    }

    public static ApplicationGlobalState getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ApplicationGlobalState();
        }

        return INSTANCE;
    }

    public String getSelectedCity() {return selectedCity;}
    public void setSelectedCity (String selectedCity) { this.selectedCity = selectedCity;}
    public String getApiKey() {return this.API_KEY;}
}
