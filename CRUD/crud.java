package Java.CRUD;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class crud {

        public static volatile List<Person> allPeople = new ArrayList<Person>();

        static {
            allPeople.add(Person.createFemale("Nika Sherr", new Date()));  //birthday - today
            allPeople.add(Person.createMale("Tolic Vasya", new Date()));
        }

        public static void main(String[] args) throws ParseException {

            switch (args[0]) {

                // args: name - String (accept 1 word), sex - "m"/"f", birthday - dd/MM/yyyy

                //example:
                //to create ne Persons
                // -c Mr.Smith m 12/03/1990 Ms.Smith w 11/02/1992

                //info about persons
                // -i 0 1


                case "-c":
                    //create
                    // args format: -c name1 sex1 bd1 name2 sex2 bd2...
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i += 3) {
                            Date birthday = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i + 2]);

                            if (args[i + 1].equals("m"))  //male or female?
                                allPeople.add(Person.createMale(args[i], birthday));
                            else
                                allPeople.add(Person.createFemale(args[i], birthday));

                            //output created id of the person in allpeople
                            System.out.println(allPeople.size() - 1);
                        }
                        break;
                    }
                case "-u":
                    //update
                    // args format: -u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...

                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i += 4) {
                            int index = Integer.parseInt(args[i]);
                            String name = args[i + 1];
                            Sex sex = args[i + 2].equals("m") ? Sex.MALE : Sex.FEMALE;
                            Date birthday = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i + 3]);
                            //update with methods of Person
                            allPeople.get(index).setName(name);
                            allPeople.get(index).setSex(sex);
                            allPeople.get(index).setBirthDate(birthday);

                        }
                        break;
                    }
                case "-d":
                    synchronized (allPeople) {
                        //soft (logical) delete of an element by id
                        // args format: -d id1 id2 id3 id4 ...
                        for (int i = 1; i < args.length; i++) {
                            int index = Integer.parseInt(args[i]);
                            //all fields are changed to null:
                            allPeople.get(index).setName(null);
                            allPeople.get(index).setSex(null);
                            allPeople.get(index).setBirthDate(null);

                        }
                        break;
                    }
                case "-i":
                    synchronized (allPeople) {
                        //display information
                        //args format: -i id1 id2 id3 id4 ...
                        for (int i = 1; i < args.length; i++) {
                            int index = Integer.parseInt(args[i]);
                            String name = allPeople.get(index).getName();
                            String sex = allPeople.get(index).getSex().equals(Sex.MALE) ? "m" : "f";
                            Date date = allPeople.get(index).getBirthDate();
                            String birthday = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(date);
                            System.out.println(name + " " + sex + " " + birthday);

                        }
                        break;
                    }

            }

        }


}
