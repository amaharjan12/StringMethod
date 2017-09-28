public class StringMethod{
    public static void main(String[]args) {
        System.out.println("Humble".substring(5));
        String newWord = new String("Kind");//to display message to the command window
        System.out.println("New word:" + newWord);
        System.out.println("Apple".substring(0, 5));
        System.out.println("Apple".charAt(4));
        System.out.println(newWord.compareTo("Apple"));
        System.out.println(newWord.concat(",keep smiling"));
        System.out.println("Apple".equals("healthy"));
        System.out.println("Apple".equalsIgnoreCase("Apple"));
        System.out.println("Apple".indexOf("Emily"));
        System.out.println("Apple".lastIndexOf("c"));
        System.out.println(newWord.toLowerCase());
        System.out.println("Good morning class!".toUpperCase());
        System.out.println("Habit".replace("t", "s"));
        System.out.println(String.valueOf(newWord));
        System.out.println("  I love food  ".trim());

        StringBuffer stringBuffer = new StringBuffer();//to create mutable string
        stringBuffer.insert(0, "Flexibity");
        System.out.println("Management" + stringBuffer.capacity());
        System.out.println("String Length:" + stringBuffer.length());
        System.out.println("Spring:" + stringBuffer);
        System.out.println("Spring:" + stringBuffer);
        stringBuffer.replace(2, 7, "PQRST");
        stringBuffer.append("I need sleep"); //to concatenate the string representation of any other type of data
        stringBuffer.replace(2, 7, "mode");
        System.out.println(stringBuffer);

    }

}
