import java.util.Scanner;

public class TreeMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        java.util.TreeMap<String, Integer> treeMap = new java.util.TreeMap<>();

        while (true) {
            System.out.println("1. Добавить элемент");
            System.out.println("2. Удалить элемент");
            System.out.println("3. Найти элемент");
            System.out.println("4. Вывести все элементы");
            System.out.println("5. Выход");
            System.out.print("Введите ваш выбор: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введите ключ: ");
                    String key = scanner.next();
                    System.out.print("Введите значение: ");
                    int value = scanner.nextInt();
                    treeMap.put(key, value);
                    break;
                case 2:
                    System.out.print("Введите ключ для удаления: ");
                    String keyToRemove = scanner.next();
                    treeMap.remove(keyToRemove);
                    break;
                case 3:
                    System.out.print("Введите ключ для поиска: ");
                    String keyToSearch = scanner.next();
                    if (treeMap.containsKey(keyToSearch)) {
                        System.out.println("Value: " + treeMap.get(keyToSearch));
                    } else {
                        System.out.println("Ключ не найден");
                    }
                    break;
                case 4:
                    for (String k : treeMap.keySet()) {
                        System.out.println(k + ": " + treeMap.get(k));
                    }
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
