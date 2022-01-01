import java.util.ArrayList;

public class TodoList {

    ArrayList<String> todoList = new ArrayList<>();

    public void add(String todo) {
        todoList.add(todo);
        System.out.println("Добавлено дело " + todo);
    }

    public void add(int index, String todo) {
        if (index <= todoList.size() && index >= 0) {
            todoList.add(index, todo);
        } else {
            todoList.add(todo);
        }
        System.out.println("Добавлено дело " + todo);
    }

    public void edit(String todo, int index) {
        if (index < todoList.size() && index >= 0) {
            String todoOld = todoList.get(index);
            todoList.set(index,todo);
            System.out.println("Дело " + todoOld + " заменено на " + todo);
        } else {
            System.out.println("Дело с таким номером не существует");
        }
    }

    public void delete(int index) {
        if (index < todoList.size() && index >= 0) {
            todoList.remove(index);
            System.out.println("Удалено дело с индексом " + index);
        } else {
            System.out.println("Дело с таким номером не существует");
        }
    }

    public void list() {
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println(i + " - " + todoList.get(i));
        }
    }

    public ArrayList<String> getTodos() {
        return todoList;
    }

}