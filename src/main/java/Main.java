public class Main {
    public static void main(String[] args) {
        JsonToJava.mapFromJsonToJava("src/main/resources/movies.json");
        Menu.chooseMenuOption();
    }
}