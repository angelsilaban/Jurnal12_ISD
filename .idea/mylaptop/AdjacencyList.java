package mylaptop;

import java.util.*;

public class AdjacencyList {
    int vertex;
    LinkedList<Character> AdjacencyListArray[];

    //konstruktor
    AdjacencyList(int vertex) {
        this.vertex = vertex;

        // membuat banyak array sama dengan banyak vertex
        AdjacencyListArray = new LinkedList [vertex];

        // Buat list baru untuk setiap vertex, sehingga node-node yang bertetangga dapat disimpanaa
        for (int i = 0; i < vertex; i++){
            AdjacencyListArray[i] = new LinkedList<>();
        }
    }

    // Fungsi menambah Edge dari setiap node
    public void addEdge (char from, char destinationTo){
        int num = -1; // Dimulai dari 0 sampai 9 (jumlah array)
        for (char i = 'A'; i <= from; i++){
            num++;
        }
        AdjacencyListArray[num].add(destinationTo);
    }
    // Fungsi Mencetak Adjacency yang dibuat
    public void cetakGraph(){
        char huruf = 'A';
        for(int i = 0; i < vertex; i++){
            System.out.print("Vertex " + huruf + " terhubung dengan: ");
            for(int j = 0; j < AdjacencyListArray[i].size(); j++){
                System.out.print (AdjacencyListArray[i].get(j) + " "); // J = A --> B D E
            }
            System.out.println();
            huruf++;
        }
    }
}
