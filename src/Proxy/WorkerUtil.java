package Proxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkerUtil {

    public static List<Worker> getWorkerList(){

        List<Worker> workers = new ArrayList<>();

        Worker john = new Worker("John123", "123", false);
        Worker jack = new Worker("321Jack", "1234", false);
        Worker josef = new Worker("1Josef", "12345", true);

        workers.add(jack);
        workers.add(john);
        workers.add(josef);

        return workers;
    }

    public static Map<String, Worker> getUsernameWorkerMap(){

        List<Worker> workerList = getWorkerList();
        Map<String, Worker> map = new HashMap<>();

        for (Worker worker : workerList) {
            map.put(worker.getUsername(), worker);
        }

        return map;
    }

    public static Worker getWorkerByUsername(String username){
        Map<String, Worker> map = getUsernameWorkerMap();
        Worker worker = map.get(username);
        return worker;
    }


    public static boolean isWorkerValid(String username, String password) {
        boolean isWorkerValid = false;
        Worker worker = getWorkerByUsername(username);
        if (worker != null)
            isWorkerValid = worker.getPassword().equals(password);
        return isWorkerValid;
    }
}
