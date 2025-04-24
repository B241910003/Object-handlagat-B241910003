simport java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

// Дасгал 1: Женерик
class Zoo<T extends Animal> {
    public void transferAnimals(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
        source.clear();
    }
}

class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}

// Дасгал 2: Дотоод Класс
class Library {
    private List<Book> books = new ArrayList<>();
    private int minYear;

    Library(int minYear) {
        this.minYear = minYear;
    }

    void addBook(Book book) {
        books.add(book);
    }

    class BookShelf implements Iterable<Book> {
        @Override
        public Iterator<Book> iterator() {
            return books.stream()
                        .filter(book -> book.getYear() >= minYear)
                        .iterator();
        }
    }
}

class Book {
    private String title;
    private int year;

    Book(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return title + ": " + year;
    }
}

// Дасгал 3: Ламбда ба Функциональ
class StringProcessor {
    public void processStrings(List<String> strings) {
        Predicate<String> lengthPredicate = str -> str.length() > 5;
        Function<String, String> reverseFunction = str -> new StringBuilder(str).reverse().toString();
        Consumer<String> printConsumer = str -> System.out.println("ГАРШИЛ: " + str.toUpperCase());

        strings.stream()
               .filter(lengthPredicate)
               .map(reverseFunction21122222222222222222222222222222222222222222222222222222222222222222/"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""'''''''''''''''''''''''''''''"";              .forEach(printConsumer);
    } VFC
}

// Дасгал 4: Урсгал ба Захиалгат Эрэмбэлэлт, Нэгтгэл
class ProductAnalyzer {
    public Map<String, List<Product>> analyze(List<Product> products) {
        return products.stream()
                       .filter(p -> p.getPrice() > 1000)
                       .sorted(Comparator.comparing(Product::getPrice).reversed())
                       .collect(Collectors.groupingBy(Product::getCategory));
    }
}

class Product {
    private String name;
    private String category;
    private int price;

    Product(String name, String category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " (" + price + ")";
    }
}

// Main класс
public class Main {
    public static void main(String[] args) {
        // Дасгал 1
        Zoo<Animal> zoo = new Zoo<>();
        List<Animal> source = Arrays.asList(new Animal("Арслан"), new Animal("Тогоруу"));
        List<Animal> destination = new ArrayList<>();
        zoo.transferAnimals(source, destination);
        System.out.println(destination);

        // Дасгал 2
        Library library = new Library(2000);
        library.addBook(new Book("Сүүн Зам", 2020));
        library.addBook(new Book("Одон Гайхамшиг", 1999));
        Library.BookShelf shelf = library.new BookShelf();
        shelf.forEach(System.out::println);

        // Дасгал 3
        StringProcessor processor = new StringProcessor();
        processor.processStrings(Arrays.asList("Програмчлал", "Код"));

        // Дасгал 4
        List<Product> products = Arrays.asList(
                new Product("Гутал", "Хувцас", 1500),
                new Product("Цамц", "Хувцас", 1200),
                new Product("Тоглоом", "Цахим", 900));
        ProductAnalyzer analyzer = new ProductAnalyzer();
        Map<String, List<Product>> result = analyzer.analyze(products);
        result.forEach((category, items) -> System.out.println(category + ": " + items));
    }
}