package org.example;

import org.example.model.Movie;
import org.example.model.Session;
import org.example.model.Theater;

public class SerializationExercises {
    /*
        Should define the class for the concepts Movie, Theater and Session.
        A session is a play of movie in a theater.
        Create 2 instances of each class and relate among them.
        Serialize to Json all objects and save then in different files.
     */
    public static class Exercise1 {
        public static void main(String[] args) {

            Movie movie1 = new Movie("It", 120);
            Movie movie2 = new Movie("Titanic", 180);

            Theater theater1 = new Theater("opera", "alfredo kraus");
            Theater theater2 = new Theater("opera2", "perez galdós");

            Session session1 = new Session(movie1, theater1);
            Session session2 = new Session(movie2, theater2);

        }
    }

    /*
        Deserialize the objects created in exercise 1.
        Now serialize them using ObjectOutputStream
     */
    public static class Exercise2 {

        public static void main(String[] args) {

        }
    }

    /*
       Deserialize the objects from the binary files created in exercise 2.
    */
    public static class Exercise3 {

        public static void main(String[] args) {

        }
    }
}