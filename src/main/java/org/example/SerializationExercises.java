package org.example;

import com.google.gson.Gson;
import org.example.model.Movie;
import org.example.model.Session;
import org.example.model.Theater;

import java.io.*;

public class SerializationExercises {
    public static class Exercise1 {
        public static void main(String[] args) {

            Movie movie1 = new Movie("It", 120);
            Movie movie2 = new Movie("Titanic", 180);

            Theater theater1 = new Theater("opera", "alfredo kraus");
            Theater theater2 = new Theater("opera2", "perez galdós");

            Session session1 = new Session(movie1, theater1);
            Session session2 = new Session(movie2, theater2);


            Gson gson = new Gson();
            String movie1Json = gson.toJson(movie1);
            String movie2Json = gson.toJson(movie2);
            String theater1Json = gson.toJson(theater1);
            String theater2Json = gson.toJson(theater2);
            String session1Json = gson.toJson(session1);
            String session2Json = gson.toJson(session2);

            try (FileWriter file1 = new FileWriter("movie1.json")) {
                file1.write(movie1Json);
            } catch (IOException e) {
                e.printStackTrace();
            }

            try (FileWriter file2 = new FileWriter("movie2.json")) {
                file2.write(movie2Json);
            } catch (IOException e) {
                e.printStackTrace();
            }

            try (FileWriter file3 = new FileWriter("theater1.json")) {
                file3.write(theater1Json);
            } catch (IOException e) {
                e.printStackTrace();
            }

            try (FileWriter file4 = new FileWriter("theater2.json")) {
                file4.write(theater2Json);
            } catch (IOException e) {
                e.printStackTrace();
            }

            try (FileWriter file5 = new FileWriter("session1.json")) {
                file5.write(session1Json);
            } catch (IOException e) {
                e.printStackTrace();
            }

            try (FileWriter file6 = new FileWriter("session2.json")) {
                file6.write(session2Json);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static class Exercise2 {
        public static void main(String[] args) {

            Gson gson = new Gson();
            Movie movie1;
            Movie movie2;
            Theater theater1;
            Theater theater2;
            Session session1;
            Session session2;

            try (FileReader fileReader1 = new FileReader("movie1.json")) {
                movie1 = gson.fromJson(fileReader1, Movie.class);
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }

            try (FileReader fileReader2 = new FileReader("movie2.json")) {
                movie2 = gson.fromJson(fileReader2, Movie.class);
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
            try (FileReader fileReader3 = new FileReader("theater1.json")) {
                theater1 = gson.fromJson(fileReader3, Theater.class);
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }

            try (FileReader fileReader4 = new FileReader("theater2.json")) {
                theater2 = gson.fromJson(fileReader4, Theater.class);
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
            try (FileReader fileReader5 = new FileReader("session1.json")) {
                session1 = gson.fromJson(fileReader5, Session.class);
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }

            try (FileReader fileReader6 = new FileReader("session2.json")) {
                session2 = gson.fromJson(fileReader6, Session.class);
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }






            try (FileOutputStream fileOutputStream = new FileOutputStream("movieSerialized.dat");
                 ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
                objectOutputStream.writeObject(movie1);
                objectOutputStream.writeObject(movie2);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try (FileOutputStream fileOutputStream = new FileOutputStream("theaterSerialized.dat");
                 ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
                objectOutputStream.writeObject(theater1);
                objectOutputStream.writeObject(theater2);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try (FileOutputStream fileOutputStream = new FileOutputStream("sessionSerialized.dat");
                 ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
                objectOutputStream.writeObject(session1);
                objectOutputStream.writeObject(session2);
            } catch (IOException e) {
                e.printStackTrace();
            }

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