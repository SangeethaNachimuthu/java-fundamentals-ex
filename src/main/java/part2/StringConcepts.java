package part2;

import java.lang.reflect.Array;

public class StringConcepts {

    void main() {

        //Print the length of String "Java"
        String str1 = "Java";
        System.out.println("The length of " +str1+ " is " + str1.length());

        // Print char at index position 6
        String str2 = "Long example sentence";
        System.out.println("The char at index position 6 " +
                "in the 'Long example sentence' is " + str2.charAt(6));

        // Print the index position of 'o' in the below String
        String str3 = "Even longer example sentence";
        System.out.println("The index position of 'o' " +
                "in the 'Even longer example sentence' is " +str3.indexOf("o"));

        //Print substring
        String str4 = "Ok this is not as long!";
        System.out.println("Printing a substring: " +str4.substring(11,22));

        //lowercase and uppercase
        String str5 = "CAPS EQUALS SCREAMING";
        str5 = str5.toLowerCase();
        System.out.println("Lowercase: " + str5);
        System.out.println("Uppercase: " + str5.toUpperCase());

        //String replacement
        String str6 = "Java is the worst programming language.";
        System.out.println("Before replacing word: " + str6);
        str6 = str6.replace("worst", "best");
        System.out.println("Replacing the specific word: " + str6);

        String str7 = "\tJ\ta\tv\ta\t";
        System.out.println(str7.trim());

        //String parsing
        int num = 20;
        String str8 = Integer.toString(num);
        System.out.println("Parsing the int to String: " + str8.concat("20"));

        //String array and split
        String str9 = "Oil and Water";
        String regex = "and";
        String[] strArray = str9.split(regex);
        for(String s : strArray) {
            System.out.println("String Array: " + s);
        }

        //String array and split
        String str10 = "Carl,Susie,Fredrick,Bob,Erik";
        String regex1 = ",";
        String[] strArray1 = str10.split(regex1);
        System.out.println("Splitting 'Carl,Susie,Fredrick,Bob,Erik' ");
        for (String s : strArray1) {
            System.out.println(s);
        }

        //Convert String to CharArray and print each char.
        String str11 = "ThisShouldBeConverted";
        char[] charArray = str11.toCharArray();
        System.out.println("Printing characters of 'ThisShouldBeConverted': ");
        for(char c : charArray) {
            System.out.println(c);
        }

        //Converting charArray to String using String Constructor.
        char[] charArray1 = {'J','a','v','a'};
        String str12 = new String(charArray1);
        System.out.println("Converting charArray to String using String Constructor :" + str12);
        String str13 = String.copyValueOf(charArray1);
        System.out.println("Converting charArray to String using copyValueOf :" + str13);
    }
}
