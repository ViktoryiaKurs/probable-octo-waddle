package homework.hw5streamapi;

import java.util.Arrays;
import java.util.List;

// Найти первого клиента с PRIORITY или VIP статусом
public class FindFirst {
    public static void main(String[] args) {
        List<Client> clients = Arrays.asList(
                new Client("Иванов", ClientStatus.REGULAR, 1),
                new Client("Петров", ClientStatus.REGULAR, 2),
                new Client("Сидоров", ClientStatus.PRIORITY, 3),
                new Client("Кузнецов", ClientStatus.VIP, 4),
                new Client("Смирнов", ClientStatus.PRIORITY, 5)
        );

        System.out.println(clients.stream()
                .filter(c -> c.getStatus().equals(ClientStatus.PRIORITY) || c.getStatus().equals(ClientStatus.VIP))
                .findFirst());
    }
}

enum ClientStatus {REGULAR, PRIORITY, VIP}

class Client {
    String name;
    ClientStatus status;
    int queueNumber;

    Client(String name, ClientStatus status, int queueNumber) {
        this.name = name;
        this.status = status;
        this.queueNumber = queueNumber;
    }

    public ClientStatus getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", status=" + status +
                ", queueNumber=" + queueNumber +
                '}';
    }
}
