package com.modernjava.textblocks;

public class TextBlocks {



    public static String multiLineString() {

        var multiLine = "This is a\n" +
                "    multiline string\n" +
                "with newlines inside";

        return  multiLine;
    }

    public static String multiLineStringUsingTextBlock() {

        var multiLine = """
                This is a
                multiline string
                with newlines inside
                """;

        return  multiLine;
    }

    public static String sql() {

        var multiLine = """
                SELECT * FROM employee
                WHERE firstname = 'amar'
                AND lastname = 'mane'
                """;

        return  multiLine;
    }
    public static String json() {

        var multiLine = """
                {
                "orderId":123456,
                "status":"DELIVERED",
                "amount":99.99
                }
                """;

        return  multiLine;
    }

    public static String sqlWithDynamicParams(String firstname, String lastname) {

        var multiLine = """
                SELECT * FROM employee
                WHERE firstname = '%s'
                AND lastname = '%s'
                """.formatted(firstname,lastname);

        return  multiLine;
    }
    public static String multiLineStringUsingTextBlockWithDynamicValue(String name) {

        var multiLine = """
                Hello, %s!
                This is a
                multiline string
                with newlines inside
                """.formatted(name);

        return  multiLine;
    }

    public static void main(String[] args) {

        System.out.println("multiLineString = " + multiLineString());
        System.out.println();
        System.out.println("multiLineString = " + multiLineStringUsingTextBlock());
        System.out.println();
        System.out.println("multiLineString = " + multiLineStringUsingTextBlockWithDynamicValue("AMAR"));
        System.out.println();
        System.out.println("sql = " + sql());
        System.out.println();

        System.out.println("sql = " + sqlWithDynamicParams("a", "b"));
        System.out.println();
        System.out.println("json = " + json());


    }
}
