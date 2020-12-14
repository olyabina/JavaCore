package Practic7;

import java.io.IOException;

public class UserInterface {

    private final Controller controller = new Controller();

    public void runApplication();

    Scanner scanner = new Scanner(System.in);
    while(true)

    {
        System.out.println("Введите город на англ языке");
        String city = scanner.nextLine();

        setGlobalCity(city);

        System.out.println("Введите ответ: 1 - получить текущую погоду, " +
                "2 - получить погоду на следующие 5 дней, " +
                "выход exit - завершить работу");
        String result = scanner.nextLine();

        checkIsExit(result);

        try {
            validateUserInput(result);
        } catch (IOException e) {
            e.printStackTrace();
            continue;
        }
    }

        try

    {
        notifyController(result);
    } catch(
    IOException e)

    {
        e.printStackTrace();
    }

}
}

private void checkIsExit(String result){
        if(result.toLowerCase().equals("выход"))||result.toLowerCase().equals("exit")){
        System.out.println("Завершаю работу");
        System.exit(0);
        }
        }

        private void setGlobalCity(String city) {
    ApplicationGlobalState.getInstance().setSelectedCity(city);
}

private void validateUserInput(String userInput) throws IOException {
    if (userInput == null || userInput.length() !=1) {
        throw new IOException("Incorrect user input: expected one digit as answer, but actually get" + userInput);
        }
    int answer = 0;
    try {
        answer = Integar.parseInt(userInput);
        } catch (NumberFormatException e) {
        throw new IOExcception("Incorrect user input: character is not numeric!");
        }

        }

        private void notifyController(String input) throws IOException {
    controller.onUserInput(input);
        }
        }