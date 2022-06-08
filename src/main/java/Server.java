import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        /*TODO класс сервер, хз есть ли смысл еще и БД городить отдельно можно и в сервере хранить инфу
            у нас все равно более чем 2000 экземпляров Abiturient не будет, с другой стороны, на перспективу ...
            class in work
                 Вообще в иделае посмотреть про hibernate ...
        */

        try (ServerSocket serverSocket = new ServerSocket(8989)) {
            System.out.println("Запустили наш чудный сервер!");
            while (true)
            try (Socket socket = serverSocket.accept();
                 BufferedWriter writer =
                         new BufferedWriter(
                                 new OutputStreamWriter(
                                         socket.getOutputStream()
                                 )
                         );
                 BufferedReader reader =
                         new BufferedReader(
                                 new InputStreamReader(
                                         socket.getInputStream()

                                 ))) {
                String request = reader.readLine();
                System.out.println(request);
                String response = request.length() > 0 ? "Проверяем сервер: " + request.length() : "";
                System.out.println(response);
                writer.write("Ты на территории свервера!");
                writer.newLine();
                writer.flush();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    }
