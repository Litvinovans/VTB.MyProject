package Lesson25.Task22;

import java.sql.*;
import java.util.Scanner;

public class Main {

    static final String DB_URL = "jdbc:postgresql://127.0.0.1:5433/userdb";
    static final String login = "postgres";
    static final String pass = "admin";
    //запрос на создание таблицы company
    static final String createtable = "CREATE TABLE company ("
            + "company_name varchar(30) NOT NULL, "
            + "inn varchar(12), "
            + "address varchar(255), "
            + "phone_number varchar(20), "
            + "id serial PRIMARY KEY, "
            + "agreement_id int,"
            + "CONSTRAINT inn_ch CHECK(inn IS NOT NULL),"
            + "UNIQUE (agreement_id) "
            + ");";

    //выборка всех данных таблицы company
    static final String selectAll = "SELECT * FROM company;";

    //добавление значений в таблицу company
    static final String insertcompany = "INSERT INTO company "
            + "(company_name,inn,address,phone_number,agreement_id)" + "VALUES"
            + "(?,?,?,?,?);";

    public static void main(String[] args) {

        System.out.println("Testing PostgreSQL JDBC:");

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver is not found!");
            e.printStackTrace();
            return;
        }

        System.out.println("Driver is connected");
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, login, pass);
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
            return;
        }

        if (connection != null) {
            System.out.println("Connected successfully");
        } else {
            System.out.println("Failed to connect to DB!");
        }

        //**********************************************************
        //запуск на выполнение запроса создания таблицы company
        Statement statement = null;

        try {
            System.out.println("Creating new table...");
            statement = connection.createStatement();
            statement.execute(createtable);
        } catch (SQLException e) {
            System.out.println("Table is not created!");
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                System.out.println("Statement is not closed!");
            }
        }
        System.out.println("Table is created!");
        //**********************************************************
        //ввод данных таблицы из консоли
        int i = 0;

        while (i == 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input company_name: ");
            String companyname = sc.nextLine();
            System.out.println("Input inn: ");
            String inn = sc.nextLine();
            System.out.println("Input address: ");
            String address = sc.nextLine();
            System.out.println("Input phone_number: ");
            String phonenumber = sc.nextLine();
            System.out.println("Input agreement_id: ");
            int agreementid = sc.nextInt();

            try {
                System.out.println("Adding new data...");
                PreparedStatement preparedstatement = connection.prepareStatement(insertcompany);

                preparedstatement.setString(1, companyname);
                preparedstatement.setString(2, inn);
                preparedstatement.setString(3, address);
                preparedstatement.setString(4, phonenumber);
                preparedstatement.setInt(5, agreementid);

                int rows = preparedstatement.executeUpdate();
                System.out.printf("%d rows added\n", rows);

            } catch (SQLException e) {
                System.out.println("Table is not created!");
                e.printStackTrace();
            } finally {
                try {
                    if (statement != null) {
                        statement.close();
                    }
                } catch (SQLException e) {
                    System.out.println("Statement is not closed!");
                }
            }
            System.out.println("0 - продолжить ввод данных в таблицу");
            System.out.println("1 - завершить ввод данных в таблицу и вывод данных таблицы на экран");
            i = sc.nextInt();
        }
        //**********************************************************
        //выборка данных таблицы company с выводом на консоль
        try {
            System.out.println("Print table");
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(selectAll);
            while (rs.next()) {
                System.out.printf("company_name: %s \t inn: %s \t address: %s \t " +
                                "phone_number: %s \t id: %s \t agreement_id: %s \n",
                        rs.getString("company_name"),
                        rs.getString("inn"),
                        rs.getString("address"),
                        rs.getString("phone_number"),
                        rs.getString("id"),
                        rs.getString("agreement_id"));
            }
        } catch (SQLException e) {
            System.out.println("Data is not read correctly");
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                System.out.println("Statement is not closed!");
            }
        }
        //**********************************************************
        //вывести максимальный ID договора
        String f = "SELECT MAX(agreement_id) FROM company;";

        try {
            System.out.println("Print MAX agreement_id");
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(f);
            while (rs.next()) {
                System.out.printf("max: %s \t \n",
                        rs.getString("max"));
            }

        } catch (SQLException e) {
            System.out.println("Table is not created!");
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                System.out.println("Statement is not closed!");
            }
        }

        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println("Unable to close the connection!");
            e.printStackTrace();
            return;
        }
        System.out.println("Connection is closed!");
    }
}
