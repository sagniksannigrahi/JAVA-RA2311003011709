import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class LibraryManagementSystem extends JFrame {

    private ArrayList<Book> bookList = new ArrayList<>();
    private JTable bookTable;
    private JTextField titleField, authorField, isbnField, yearField, searchField;
    private JComboBox<String> genreCombo;
    private JCheckBox availabilityCheck;

    public LibraryManagementSystem() {
        // Setting up the main window
        setTitle("Library Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(new BorderLayout());

        // Menu bar setup
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        setJMenuBar(menuBar);

        // Toolbar setup
        JToolBar toolBar = new JToolBar();
        JButton addBookButton = new JButton("Add Book");
        JButton removeBookButton = new JButton("Remove Book");
        JButton searchBookButton = new JButton("Search");
        toolBar.add(addBookButton);
        toolBar.add(removeBookButton);
        toolBar.add(searchBookButton);
        add(toolBar, BorderLayout.NORTH);

        // TabbedPane setup
        JTabbedPane tabbedPane = new JTabbedPane();

        // Book Details Panel
        JPanel bookDetailsPanel = new JPanel(new GridLayout(6, 2));
        titleField = new JTextField();
        authorField = new JTextField();
        isbnField = new JTextField();
        yearField = new JTextField();
        genreCombo = new JComboBox<>(new String[] { "Fiction", "Non-fiction", "Science", "History", "Others" });
        availabilityCheck = new JCheckBox("Available");

        bookDetailsPanel.add(new JLabel("Title:"));
        bookDetailsPanel.add(titleField);
        bookDetailsPanel.add(new JLabel("Author:"));
        bookDetailsPanel.add(authorField);
        bookDetailsPanel.add(new JLabel("ISBN:"));
        bookDetailsPanel.add(isbnField);
        bookDetailsPanel.add(new JLabel("Publication Year:"));
        bookDetailsPanel.add(yearField);
        bookDetailsPanel.add(new JLabel("Genre:"));
        bookDetailsPanel.add(genreCombo);
        bookDetailsPanel.add(new JLabel("Availability:"));
        bookDetailsPanel.add(availabilityCheck);

        JButton addBook = new JButton("Add Book");
        JButton updateBook = new JButton("Update Book");
        bookDetailsPanel.add(addBook);
        bookDetailsPanel.add(updateBook);

        tabbedPane.add("Book Details", bookDetailsPanel);

        // Book List Panel
        JPanel bookListPanel = new JPanel(new BorderLayout());
        bookTable = new JTable(new BookTableModel(bookList));
        JScrollPane scrollPane = new JScrollPane(bookTable);
        bookListPanel.add(scrollPane, BorderLayout.CENTER);

        // Search Bar setup
        JPanel searchPanel = new JPanel(new FlowLayout());
        searchField = new JTextField(20);
        JButton searchButton = new JButton("Search");
        searchPanel.add(new JLabel("Search by Title:"));
        searchPanel.add(searchField);
        searchPanel.add(searchButton);
        bookListPanel.add(searchPanel, BorderLayout.NORTH);

        tabbedPane.add("Book List", bookListPanel);
        add(tabbedPane, BorderLayout.CENTER);

        // Event Handling
        addBook.addActionListener(e -> addBook());
        searchButton.addActionListener(e -> searchBook());
        removeBookButton.addActionListener(e -> removeBook());

        setVisible(true);
    }

    private void addBook() {
        String title = titleField.getText();
        String author = authorField.getText();
        String isbn = isbnField.getText();
        String year = yearField.getText();
        String genre = (String) genreCombo.getSelectedItem();
        boolean available = availabilityCheck.isSelected();

        if (title.isEmpty() || author.isEmpty() || isbn.isEmpty() || year.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields must be filled", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        bookList.add(new Book(title, author, isbn, year, genre, available));
        bookTable.setModel(new BookTableModel(bookList));
        JOptionPane.showMessageDialog(this, "Book added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        clearFields();
    }

    private void searchBook() {
        String searchQuery = searchField.getText();
        ArrayList<Book> resultList = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getTitle().toLowerCase().contains(searchQuery.toLowerCase())) {
                resultList.add(book);
            }
        }
        bookTable.setModel(new BookTableModel(resultList));
    }

    private void removeBook() {
        int selectedRow = bookTable.getSelectedRow();
        if (selectedRow >= 0) {
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this book?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                bookList.remove(selectedRow);
                bookTable.setModel(new BookTableModel(bookList));
            }
        } else {
            JOptionPane.showMessageDialog(this, "No book selected", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearFields() {
        titleField.setText("");
        authorField.setText("");
        isbnField.setText("");
        yearField.setText("");
        genreCombo.setSelectedIndex(0);
        availabilityCheck.setSelected(false);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LibraryManagementSystem::new);
    }
}

class Book {
    private String title, author, isbn, year, genre;
    private boolean available;

    public Book(String title, String author, String isbn, String year, String genre, boolean available) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
        this.genre = genre;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isAvailable() {
        return available;
    }
}

class BookTableModel extends javax.swing.table.AbstractTableModel {
    private final String[] columns = {"Title", "Author", "ISBN", "Year", "Genre", "Availability"};
    private ArrayList<Book> bookList;

    public BookTableModel(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public int getRowCount() {
        return bookList.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Book book = bookList.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return book.getTitle();
            case 1:
                return book.getAuthor();
            case 2:
                return book.getIsbn();
            case 3:
                return book.getYear();
            case 4:
                return book.getGenre();
            case 5:
                return book.isAvailable() ? "Yes" : "No";
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
}
