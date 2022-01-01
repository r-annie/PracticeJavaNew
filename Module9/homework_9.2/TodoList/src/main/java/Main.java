import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {
        String regexIndex = "[0-9]+";
        Pattern patternIndex = Pattern.compile(regexIndex);

        while (true) {
            Scanner sc = new Scanner(System.in);
            String newLine = sc.nextLine();
            String scanTrim = newLine.trim();
            String[] scan = scanTrim.split(" ");

            String taskTodo = scan[0];

            int index = -1;
            int startI = 0;
            String text = "";

            if (!taskTodo.equals("GETLIST") && !taskTodo.equals("LIST")) {
                Matcher matcherIndex = patternIndex.matcher(scan[1]);
                if (matcherIndex.find()) {
                    index = Integer.parseInt(scan[1]);
                    startI = 2;
                } else {
                    index = -1;
                    startI = 1;
                }
                for (int i = startI; i < scan.length; i++) {
                    text = text + scan[i] + " ";
                }
            }

            switch (taskTodo) {

                case "ADD":
                    if (index != -1) {
                        todoList.add(index,text);
                    } else {
                        todoList.add(text);
                    }
                    continue;

                case "DELETE":
                    todoList.delete(index);
                    continue;

                case "EDIT":
                    todoList.edit(text,index);
                    continue;

                case "GETLIST":
                    System.out.println(todoList.getTodos());
                    continue;

                case "LIST":
                    todoList.list();
                    continue;

                default:
                    System.out.println("Давайте выберем действие!");
                    break;
            }
            sc.close();
        }
    }
}
