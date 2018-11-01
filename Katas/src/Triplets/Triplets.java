package Triplets;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

//https://www.hackerrank.com/challenges/compare-the-triplets/problem

//Ingresar dos lineas separadas por coma con tres valores
public class Triplets {
    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int p1 = 0;
        int p2 = 0;
        for(int i = 0; i< a.size(); i++){
            if(a.get(i) == b.get(i))
                continue;
            if(a.get(i) < b.get(i)){
               p2++;
            }else{
                p1++;
            }
        }
        return new ArrayList<>(Arrays.asList(p1,p2));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt"));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }


}
