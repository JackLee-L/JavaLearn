package cn.gree.lwh.chatgpt;

import java.io.*;
import java.util.*;

public class GraceHashJoin {
    public static List<Tuple> readRelation(String filename) throws IOException {
        List<Tuple> relation = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] fields = line.split("\\s+");
            int key = Integer.parseInt(fields[0]);
            int value = Integer.parseInt(fields[1]);
            Tuple tuple = new Tuple(key, value);
            relation.add(tuple);
        }
        reader.close();
        return relation;
    }

    public static void writeRelation(List<Tuple> relation, String filename) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        for (Tuple tuple : relation) {
            writer.write(tuple.key + " " + tuple.value + "\n");
        }
        writer.close();
    }

    public static Map<Integer, List<Tuple>> buildHashTable(List<Tuple> relation, int tableSize) {
        Map<Integer, List<Tuple>> hashTable = new HashMap<>();
        for (Tuple tuple : relation) {
            int hashValue = tuple.key % tableSize;
            if (!hashTable.containsKey(hashValue)) {
                hashTable.put(hashValue, new ArrayList<>());
            }
            hashTable.get(hashValue).add(tuple);
        }
        return hashTable;
    }

    public static List<Tuple> joinRelations(List<Tuple> R, List<Tuple> S) {
        List<Tuple> result = new ArrayList<>();
        for (Tuple r : R) {
            for (Tuple s : S) {
                if (r.key == s.key) {
                    Tuple tuple = new Tuple(r.key, r.value + s.value);
                    result.add(tuple);
                }
            }
        }
        return result;
    }

    public static void graceHashJoin(String Rfilename, String Sfilename, String outputFilename, int tableSize)
            throws IOException {
        List<Tuple> R = readRelation(Rfilename);
        List<Tuple> S = readRelation(Sfilename);
        Map<Integer, List<Tuple>> HR = buildHashTable(R, tableSize);
        Map<Integer, List<Tuple>> HS = buildHashTable(S, tableSize);
        List<Tuple> result = new ArrayList<>();
        for (Map.Entry<Integer, List<Tuple>> entry : HR.entrySet()) {
            int hashValue = entry.getKey();
            if (HS.containsKey(hashValue)) {
                List<Tuple> Rbucket = entry.getValue();
                List<Tuple> Sbucket = HS.get(hashValue);
                List<Tuple> bucketResult = joinRelations(Rbucket, Sbucket);
                result.addAll(bucketResult);
            }
        }
        writeRelation(result, outputFilename);
    }

    public static void main(String[] args) throws IOException {
        graceHashJoin("src/main/Java/cn.gree.lwh/chatgpt/lib/R.txt",
                "src/main/Java/cn.gree.lwh/chatgpt/lib/S.txt",
                "src/main/Java/cn.gree.lwh/chatgpt/out/output.txt", 1000);
    }

}
